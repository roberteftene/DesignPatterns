# Chain of Responsibility Pattern

### Intent

Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. 
Chain the receiving objects and pass the request along the chain until an object handles it.

### Motivation

Consider a context-sensitive help facility for a graphical userinterface. The
user can obtain help information on any part of theinterface just by clicking
on it. The help that's provided depends onthe part of the interface that's selected
and its context; forexample, a button widget in a dialog box might have different
helpinformation than a similar button in the main window. If no specifichelp
information exists for that part of the interface, thenthe help system should
display a more general help message about theimmediate context—the dialog box
as a whole, for example.

Hence it's natural to organize help information according to itsgenerality—from
the most specific to the most general. Furthermore,it's clear that a help request
is handled by one of several userinterface objects; which one depends on the context
and how specificthe available help is.

The problem here is that the object that ultimately provides thehelp isn't known
explicitly to the object (e.g., the button) that initiates the help request. What
we need is a way to decouple thebutton that initiates the help request from the
objects that mightprovide help information. The Chain of Responsibility pattern
defineshow that happens.

The idea of this pattern is to decouple senders and receivers bygiving multiple
objects a chance to handle a request. The requestgets passed along a chain of
objects until one of them handles it.

### Applicability

Use Chain of Responsibility when

- more than one object may handle a request, and the handler isn't know a priori.
- you want to issue a request to one of several objects without specifying the receiver explicitly.
- the set of objects that can handle a request should be specified dynamically.

### Components

- **Handler**
    - defines an interface for handling requests
- **ConcreteHandler**
    - handle requests it is responsible for
    - can access its successor
    - if the ConcreteHandler can handle the request, it does so; otherwise it forwards the request
    to its successor.
- **Client**
    - initiates the request to a ConcreteHandler object on the chain
    
### Consequences

1. Reduced coupling
2. Added flexibility
3. Receipt isn't guaranteed

### Problem example solved

The game has an internal chat and players can send messages to others
- we want to filter comments / messages that are not appropriate, those messages will be droped and not sent
- messages destined for a certain player will be sent in private
- broadcast messages for everyone
- messages sent to @everyone will be broadcast messages for everyone