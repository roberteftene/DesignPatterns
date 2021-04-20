# Factory Method Pattern

### Intent

Define an interface for creating an object, but let subclasses decide
which class to instantiate. Factory Method lets a class defer instantiation to subclasses.


Also known as **Virtual Contructor**.

### Motivation

Frameworks use abstract classes to define and maintain relationships between
objects. A framework is often responsible for creating these objects as well.

Consider a framework for applications that can present multiple documents to the
user. Two key abstractions in this framework are the classes Application and
Document. Both classes are abstract, and clients have to subclass them to realize
their application-specific implementations. To create a drawing application, for
example, we define the classes DrawingApplication and DrawingDocument. The

Application class is responsible for managing Documents and will create them as
required—when the user selects Open or New from a menu, for example.
Because the particular Document subclass to instantiate is application-specific,
the Application class can't predict the subclass of Document to instantiate—the
Application class only knows when a new document should be created, not what kind
of Document to create. This creates a dilemma: The framework must instantiate
classes, but it only knows about abstract classes, which it cannot instantiate.

The Factory Method pattern offers a solution. It encapsulates the knowledge of
which Document subclass to create and moves this knowledge out of the framework.

### Aplicability

Use the Factory Method Pattern when

* a class can't anticipate the class of object it must create.
* a class wants its subclasses to specify the objects it creates.
* classes delegate responsibility to one of several helper subclasses, and you
want to localize the knowledge of which helper subclass is the delegate

### Components

* Product (Document per example) or ProductInterface
    * defines the interface of objects the factory method creates.
    
* ConcreteProduct (MyDocument per example) or Product
    * implements the Product interface.

* Creator (Application per example) or Factory
    * declares the factory method, which return an object of type Product.
       Creator may also define a default implementation of the factory method that returns a default 
       ConcreteProduct object.
    * may call the factory method to create Product object
    
* ConcreteCreator( MyApplication per example) or FactoryConcreteA, FactoryConcreteB...

    * overrides the factory method to return an instance of a ConcreteProduct
    

### Consequences

1. **Provides hooks for subclasses**. 
Creating objects inside a class with a
factory method is always more flexible than creating an object directly.
Factory Method gives subclasses a hook for providing an extended version
of an object.

2. **Connects parallel class hierarchies**.
Parallel class hierarchies result when a class delegates some of its
responsibilities to a separate class. Consider graphical figures that can
be manipulated interactively; that is, they can be stretched, moved, or
rotated using the mouse. Implementing such interactions isn't always easy.
It often requires storing and updating information that records the state
of the manipulation at a given time. This state is needed only during
manipulation; therefore it needn't be kept in the figure object. Moreover,
different figures behave differently when the user manipulates them. For
example, stretching a line figure might have the effect of moving an endpoint,
whereas stretching a text figure may change its line spacing. 
    


