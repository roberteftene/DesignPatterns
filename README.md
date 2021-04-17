# Design Patterns by GOF

This repository was created out of a desire to learn in a practical way the design patterns described in 
**Design Patterns: Elements of Reusable Object-Oriented Software**. 
Everything written in the documentation of this repository is taken from the official book.

### What is a Design Patter?

Christopher Alexander says, "Each pattern describes a problem which occurs over
and over again in our environment, and then describes the core of the solution
to that problem, in such a way that you can use this solution a million times
over, without ever doing it the same way twice" [AIS+77]. Even though Alexander
was talking about patterns in buildings and towns, what he says is true about
object-oriented design patterns. Our solutions are expressed in terms of objects
and interfaces instead of walls and doors, but at the core of both kinds of patterns
is a solution to a problem in a context. 

In general, a pattern has four essential elements:

_1. The **pattern name**_ - it describes a complex solution just by pronouncing it. 

_2. The **problem**_ - describes when to apply the patterns.

_3. The **solution**_ - describes the processes that make up the design.

_4. The **consequences**_ - the result of applying the patterns.

### Organizing the design patterns

Patterns are classified according to two criteria. 

The first criterion, called **_purpose_**, reflects
what a pattern does. Patterns can have either **creational**, **structural**, or **behavioral** purpose.
**Creational** patterns concern the processs of object creation. **Structural** pattern deal with the compostion
of classes or objects. **Behavioral** patterns characterize the ways in which classes or objects interact and distribute
responsibility.

The second criterion, called **_scope_**, specifies whether the pattern applies primarily 
to classes or to objects. **Class patterns** deal with relationships between classes and 
their subclasses. **Object patterns** deal with object relationships, which can be changed 
at run-time and are more dynamic.

**Creational class patterns** defer some part of object creation to subclasses, while
**Creational object patterns** defer it to another object. The **Structural class
patterns** use inheritance to compose classes, while the **Structural object patterns**
describe ways to assemble objects. The **Behavioral class patterns** use inheritance
to describe algorithms and flow of control, whereas the **Behavioral object patterns**
describe how a group of objects cooperate to perform a task that no single object
can carry out alone. 

### Important to know

    Program to an interface, not an implementation. 

#### Class versus Interface Inheritance

An object's class defines how the object is implemented. The class defines the object's internal state
and the implementation of its operations. In contrast, an object's type only refers to its interface-the set
of requests to which it can respond. An object can have many types, and objects of different classes can have the same type.

    Favor object composition over class inheritance. 
    
Inheritance and composition each have their advantages and disadvantages. Class
inheritance is defined statically at compile-time and is straightforward to use,
since it's supported directly by the programming language. Class inheritance also
makes it easier to modify the implementation being reused. When a subclass
overrides some but not all operations, it can affect the operations it inherits
as well, assuming they call the overridden operations.


But class inheritance has some disadvantages, too. First, you can't change the
implementations inherited from parent classes at run-time, because inheritance
is defined at compile-time. Second, and generally worse, parent classes often
define at least part of their subclasses' physical representation. Because
inheritance exposes a subclass to details of its parent's implementation, it's
often said that "inheritance breaks encapsulation" [Sny86]. The implementation
of a subclass becomes so bound up with the implementation of its parent class
that any change in the parent's implementation will force the subclass to change.

#### Delegation

Delegation is a way of making composition as powerful for reuse as inheritance. 
For example, instead of making class Window a subclass of Rectangle (because
windows happen to be rectangular), the Window class might reuse the behavior of
Rectangle by keeping a Rectangle instance variable and delegating
Rectangle-specific behavior to it. In other words, instead of a Window being a
Rectangle, it would have a Rectangle. Window must now forward requests to its
Rectangle instance explicitly, whereas before it would have inherited those
operations. 

#### Aggregation versus Acquaintance

Aggregation implies that an aggregate object and its owner have identical lifetimes or in other words,
it refers to one object which owns or is responsible for another object. Generally we speak of an object
**having** or being **part of** another object in aggregation.

Acquaintance implies that an object merely **knows of** another object. Sometimes
acquaintance is called "association" or the "using" relationship. Acquainted
objects may request operations of each other, but they aren't responsible for
each other. Acquaintance is a weaker relationship than aggregation and suggests
much looser coupling between objects.