# Prototype Pattern

### Intent

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

### Motivation

You could build an editor for music scores by customizing a general framework
for graphical editors and adding new objects that represent notes, rests, and
staves. The editor framework may have a palette of tools for adding these music
objects to the score. The palette would also include tools for selecting, moving,
and otherwise manipulating music objects. Users will click on the quarter-note
tool and use it to add quarter notes to the score. Or they can use the move tool
to move a note up or down on the staff, thereby changing its pitch.

Let's assume the framework provides an abstract Graphic class for graphical
components, like notes and staves. Moreover, it'll provide an abstract Tool class
for defining tools like those in the palette. The framework also predefines a
GraphicTool subclass for tools that create instances of graphical objects and
add them to the document.

But GraphicTool presents a problem to the framework designer. The classes for
notes and staves are specific to our application, but the GraphicTool class belongs
to the framework. GraphicTool doesn't know how to create instances of our music
classes to add to the score. We could subclass GraphicTool for each kind of music
object, but that would produce lots of subclasses that differ only in the kind
of music object they instantiate. We know object composition is a flexible
alternative to subclassing. The question is, how can the framework use it to
parameterize instances of GraphicTool by the class of Graphic they're supposed
to create?

The solution lies in making GraphicTool create a new Graphic by copying or "cloning"
an instance of a Graphic subclass. We call this instance a prototype. GraphicTool
is parameterized by the prototype it should clone and add to the document. If
all Graphic subclasses support a Clone operation, then the GraphicTool can clone
any kind of Graphic. 

### Applicability

Use the Prototype pattern when a system should be independent of how its products are created,
composed, and represented and:

* when the classes to instantiate are specified at run-time, for example, by dynamic loading;
* to avoid building a class hierarchy of factories that parallels the class hierarchy of products;
* when instances of a class can have one of only a few different combinations of state. It may be
more convenient to install a corresponding number of prototypes and clone them rather than instantianting
the class manually, each time with the appropriate state.

### Components

* **Prototype**
    * declares an interface for cloning itself
* **ConcretePrototype**
    * implements an operation for cloning itself
* **Client**
    * creates a new object by asking a prototype to clone itself
    
### Consequences

1. **Adding and removing products at run-time**.
 Prototypes let you incorporate
a new concrete product class into a system simply by registering a
prototypical instance with the client.

2. **Specifying new objects by varying values**. 
Highly dynamic systems let you
define new behavior through object composition—by specifying values for
an object's variables, for example—and not by defining new classes. 

3. **Specifyng new obejcts by varying structure**. 
 Many applications build
objects from parts and subparts. Editors for circuit design, for example,
build circuits out of subcircuits. For convenience, such applications
often let you instantiate complex, user-defined structures, say, to use
a specific subcircuit again and again.
The Prototype pattern supports this as well. We simply add this subcircuit
as a prototype to the palette of available circuit elements. As long as
the composite circuit object implements Clone as a deep copy, circuits with
different structures can be prototypes. 

4. **Reduced subclassing**. 
Factory Method (121) often produces a hierarchy of
Creator classes that parallels the product class hierarchy. The Prototype
pattern lets you clone a prototype instead of asking a factory method to
make a new object. Hence you don't need a Creator class hierarchy at all.

### Problem Example

All characters have a 3D graphic model
- instances of the same character can appear in the game
- creating the 3D model is an expensive process because it involves loading and generating the model
- an efficient solution must be found to create several instances of the same character