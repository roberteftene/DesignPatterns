#  State

### Intent 

Allow an object to alter its behavior when its internal state changes. The object
will appear to change its class.

Also known as **objects for States**

### Applicability

- An object's behavior depends on its state, and it must change its behavior at run-time
depending on that state.

- Operations have large, multipart conditional statements that depend on the
  object's state. This state is usually represented by one or more enumerated
  constants. Often, several operations will contain this same conditional
  structure. The State pattern puts each branch of the conditional in a
  separate class. This lets you treat the object'sstate as an object in its
  own right that can vary independently fro mother objects. 
  
### Components

- **Context**
    - defines the interface of interest to clients
    - maintains as instance of a ConcreteState subclass that defines the current state.

- **State**
    - defines an interface for encapsulating the behavior associated with a particular state of the context

- **ConcreteState**
    - context delegates state-specific requests to the current ConcreteStateObject.
    - a context may pass itself as an argument to the State object handling the request.
    
### Consequences

1. It localizes state-specific behavior and partitions behavior for different
   states.
   
2. It makes state transitions explicit.

3. State objects can be shared.

### Problem example solved

Game characters actions are affected by their state
- the gameplay is different
- the action effects are different
- the way the superhero moves is affected by its state (lifepoints)