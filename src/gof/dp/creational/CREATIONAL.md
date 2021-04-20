# Creational Pattern

Creational design patterns abstract the instantiation process.They help make a
system independent of how its objects are created,composed, and represented. A
**class creational pattern** uses inheritance to vary the class that's instantiated,
whereas an **object creational pattern** will delegate instantiation to another object.

Consequently, the creational patterns give you a lot of flexibility in what
gets created, who creates it, how it gets created, and when.

#### Abstract factory

Provide an interface for creating families of related or dependent
objects without specifying their concrete classes.

#### Builder

Separate the construction of a complex object from its representation
so that the same construction process can create different representations. 

#### Factory Method

Define an interface for creating an object, but let subclasses decide
which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

#### Prototype

Specify the kinds of objects to create using a prototypical instance,
and create new objects by copying this prototype. 

#### Singleton

Ensure a class only has one instance, and provide a global point of
access to it.