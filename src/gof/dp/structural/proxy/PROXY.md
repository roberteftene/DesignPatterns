# Proxy Pattern

### Intent

Provide a surrogate or placeholder for another object to control access to it.
 Also known as **Surrogate**
 
### Motivation

One reason for controlling access to an object is to defer the full cost of its
creation and initialization until we actually need to use it. Consider a document
editor that can embed graphical objects in a document. Some graphical objects,
like large raster images, can be expensive to create. But opening a document should
be fast, so we should avoid creating all the expensive objects at once when the
document is opened. This isn't necessary anyway, because not all of these objects
will be visible in the document at the same time.

These constraints would suggest creating each expensive object on demand, which
in this case occurs when an image becomes visible. But what do we put in the document
in place of the image? And how can we hide the fact that the image is created
on demand so that we don't complicate the editor's implementation? This
optimization shouldn't impact the rendering and formatting code, for example.

The solution is to use another object, an image proxy, that acts as a stand-in
for the real image. The proxy acts just like the image and takes care of
instantiating it when it's required.

The image proxy creates the real image only when the document editor asks it to
display itself by invoking its Draw operation. The proxy forwards subsequent
requests directly to the image. It must therefore keep a reference to the image
after creating it. 

### Applicability

Proxy is applicable whenever there is a need for a more versatile or sophisticated
reference to an object than a simple pointer. Here are several common situations
in which the Proxy pattern is applicable:

- A remote proxy provides a local representative for an object in a different address space.

- A virtual proxy creates expensive objects on demand. 

- A protection proxy controls access to the original object. Protection proxies
are useful when objects should have different access rights.

- A smart reference is a replacement for a bare pointer that performs additional
actions when an object is accessed.

### Components

- Proxy
   
   - maintains a reference that lets the proxy access the real subject.
   Proxy may refer to a Subject if the RealSubject and Subject interface are the same.
   
   - provides an interface identical to Subject's so that a proxy can be substituted for the real subject
   
   - controls access to the real subject and may be responsible for creating and deleting it
   
   - other responsibilities depend on the kind of proxy
        - remote proxies are responsible for encoding a request and its arguments
        - virtual proxies may cache additional information about the real subject so that they can postpone accessing it.
        - protection proxies check that the caller has the access permissions required to perform a request.
      
- Subject
    
    - defines the common interface for RealSubject and Proxy so that a Proxy can be
    used anywhere a RealSubject is expected.
    
- RealSubject
    
    - defines the real object that the proxy represents.
    

### Consequences

The Proxy pattern introduces a level of indirection when accessing an object.
The additional indirection has many uses, depending on the kind of proxy:

1. A remote proxy can hide the fact that an object resides in a different address
space.
2. A virtual proxy can perform optimizations such as creating an object on
demand.
3. Both protection proxies and smart references allow additional housekeeping
tasks when an object is accessed. 

### Problem example solved

1. Add an additional login filter

- at this moment the login is based on username and password and if the password is wrong the user can try several times
- there are attacks on the players' accounts and the attacker guesses the password related to the account after several attempts
- it is desired to modify the login module by limiting the number of attempts to a maximum of 3/add 2 step authentication
- the existing login module must be modified without interrupting the game