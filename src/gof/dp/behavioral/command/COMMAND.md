# Command Pattern

### Intent

Encapsulate a request as an object, thereby letting you parameterize clients
with different requests, queue or log requests, and support undoable operations.

Also known as **Action**, **Transaction**

### Applicability

Use the Command pattern when you want to:

- parameterize objects by an action to perform. Commands are an oop replacement
for callbacks.

- specify, queue, and execute requests at different times. A command object can have
a lifetime independent of the original request.

- support undo

- support logging changes, so that they can be reapplied in case of a system crash

- structure a system around high-level operations built on primitives operations.

### Components

- **Command**
    - declares an interface for executing an operation

- **ConcreteCommand**
    - defines a binding between a Receiver object, and an action
    - implements Execute by invoking the corresponding operation(s) on Receiver

- **Client**
    - creates a ConcreteCommand object and sets its receiver

- **Invoker**
    - asks the command to carry out the request

- **Receiver**
    - knows how to perform the operations associated with carryng out a request
    . Any class may serve as Receiver.
    
### Consequences

1. Command decouples the object that invokes the operation from the one that
knows how to perform it

2. Command are first-class objects. They can be manipulated and extended like any
other object.

3. It's easy to add new Commands because you don't have to change existing classes.

### Problem example solved

The game client must perform tasks in the background without interfering with the development of the game (without blocking or slowing it down)
- customer data backup
- receive updates for the forum
- update 3D models in a silent mode (during the game)
- a solution must be found through which these tasks can be executed without affecting the execution of the game