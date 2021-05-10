# Facade Pattern

### Intent

Provide a unified interface to a set of interfaces in a subsystem. Facade defines
a higher-level interface that makes the subsystem easier to use. 

### Motivation

Structuring a system into subsystems helps reduce complexity. A common design
goal is to minimize the communication and dependencies between subsystems. One
way to achieve this goal is to introduce a facade object that provides a single,
simplified interface to the more general facilities of a subsystem. 

### Applicability

- you want to provide a simple interface to a complex subsystem.
- there are many dependencies between clients, and the implementation classes of an abstraction.
- you want to layer your subsystems.

### Components

- **Facade**, knows which subsystem classes are responsible for a request and delegates client requests to appropriate subsystem objects.

- **Subsytem classes**, implement subsystem functionality, handle work assigned by the Facade object

- **Client**, defines the framework which calls the facade

### Consequences

- the subsystem remains unchanged
- it is only added an intermediary layer which hides the complexity of the subsystem.
- can be easily defined methods which simplifies any situation.

### Problem example solved

2. In order to allow other companies or players to develop external solutions that connect
to the game, a library (an API) must be developed.
- The API contains many classes with many details
- not all classes are documented
- The API should provide a simplified interface for a set of basic functions