# Adapter pattern

### Intent

Convert the interface of a class into another interface clients expect. Adapter
 lets classes work together that couldn't otherwise because of incompatible
 interfaces. 
 
 Also known as **wrapper**.
 
 ### Applicability
 
 Use the Adapter pattern when
 
 - you want to use an existing class, and its interface does not match the
 one you need. 
 
 - you want to create a reusable class that cooperates with unrelated or
 unforeseen classes, that is, classes that don't necessarily have compatible
 interfaces.
 
 - (object adapter only) you need to use several existing subclasses, but it's
 impractical to adapt their interface by subclassing every one. An object
 adapter can adapt the interface of its parent class. 
 
 
### Components

- Existing class, class that needs to be adapted to a new interface
- New context class, defines the new domain interface
- Adaptor, adapt the interface of the existing class to the new context. Includes a reference of the object that it is adapted.
- Client, represents the framework which call the interface of the new context

### Consequences

- The existing classes do not change towards using them in a new context
- It is only added a new layer for communication
- It is easy to define adaptors whatever is the context

### Example of problem to be solved

  
1. The use of an external library that contains Disney characters.
- currently the game contains its own characters that are part of the ACME framework
 