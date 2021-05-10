# Decorator Pattern

### Intent

Attach additional responsibilities to an object dynamically. Decorators provide
a flexible alternative to subclassing for extending functionality. 

Also known as **wrapper**

### Motivation

Sometimes we want to add responsibilities to individual objects, not to an entire
class. A graphical user interface toolkit, for example, should let you add
properties like borders or behaviors like scrolling to any user interface
component.


One way to add responsibilities is with inheritance. Inheriting a border from
another class puts a border around every subclass instance. This is inflexible,
however, because the choice of border is made statically. A client can't control
how and when to decorate the component with a border.


A more flexible approach is to enclose the component in another object that adds
the border. The enclosing object is called a decorator. The decorator conforms
to the interface of the component it decorates so that its presence is transparent
to the component's clients. The decorator forwards requests to the component and
may perform additional actions (such as drawing a border) before or after
forwarding. Transparency lets you nest decorators recursively, thereby allowing
an unlimited number of added responsibilities.


### Applicability

Use Decorator:

- to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
- for responsibilities that can be withdrawn.
- when extension by subclassing is impractical.

### Components

- **Component**, defines the interface for objects that can have responsibilities added to them dynamically.

- **ConcreteComponent**, defines an object to which additional responsibilities can be attached

- **Decorator**, maintains a reference to a Component object and defines an interface that conforms to Component's interface

- **ConcreteDecorator**, adds responsibilities to the component.

### Consequences

- The extension of the functionalities of an object is dynamically, at run-time.
- The decoration is transparent for the client
- There are no limits of decorations
- A decorator is a wrapper for the initial object, so the decorated object is not the same with the initial one

### Problem example solved

Changing the characteristics of some superheroes during the game
- During the game superheroes can be equipped with new equipment
- The superhero's behavior can change dynamically depending on the interaction with the other characters in the game