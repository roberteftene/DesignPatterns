### Strategy Pattern

### Intent

Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently of clients that use it.

Also known as **Policy**.

### Applicability

Use the Strategy pattern when:

- many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors.

- you need different variants of an algorithm. For example, you might define algorithms
reflecting different space/time trade-offs.

- an algorithm uses data that clients shouldn't know about. Use the Strategy 
pattern to avoid exposing complex, algorithm-specific data structures.

- a class defines many behaviors.

### Components

- **Strategy**
    - declares an interface common to all supported algorithms. Context
    uses this interface to call the algorithm defined by a ConcreteStrategy
    
- **ConcreteStrategy**
    - implements the algorithm using the Strategy Interface

- **Context**
    - is configured with a ConcreteStrategy object
    - maintains a reference to a Strategy object
    - may define an interface that lets Strategy access its data. 
    

### Problem solved example

Depending on the involvement in the game (time spent, activity during the game, etc.) players receive bonus points.
This strategy is established by the marketing department and changes depending on other campaigns, time of year, etc.
Find a solution that allows:
- modifying the strategy for granting the runtime bonus without modifying the implementation of the game. It is considered that currently there are 3 strategies / ways to grant the bonus.
