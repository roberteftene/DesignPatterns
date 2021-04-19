# Builder Pattern

### Intent

Separate the construction of a complex object from its representation so that the same construction
process can create different representations.

### Motivation

A reader for the RTF (Rich Text Format) document exchange format should be able
to convert RTF to many text formats. The reader might convert RTF documents into
plain ASCII text or into a text widget that can be edited interactively. The problem,
however, is that the number of possible conversions is open-ended. So it should
be easy to add a new conversion without modifying the reader

### Applicability

Use the Builder pattern when:

* the algorithm for creating a complex object should be independent of the parts
that make up the object and how they're assembled
* the construction process must allow different representations for the object that's constructed


### Components

* **Builder** 
    - specifies an abstract interface for creating parts of a Product object
    
* **ConcreteBuilder** 
    - constructs and assembles parts of the product by implementing the Builder interface.  
    - defines and keeps track of the representation it creates
    - provides an interface for retrieving the product
    
* **Director** 
    - constructs an object using the Builder interface
    
* **Product** 
    - represents the complex object under construction.
    
### Consequences

1. **It lets you vary a product's internal representation**. The builder object provides the director
with an abstract interface for constructing the product.
The interface lets the builder hide the representation and internal
structure of the product. It also hides how the product gets assembled.
Because the product is constructed through an abstract interface, all you
have to do to change the product's internal representation is define a new
kind of builder. 

2. It isolates code for construction and representation.The Builder pattern
improves modularity by encapsulating the way a complex object is constructed
and represented. Clients needn't know anything about the classes that define
the product's internal structure; such classes don't appear in Builder's interface. 

3. It gives you finer control over the construction process. Unlinke creational patterns
that construct products in one shot, the Builder pattern constructs the product step by step under
the director's control.

### Problem Example

Instantiation of the superhero associated with the player
- there are many attributes to allow its customization
- name, is Positive, points Life, weapon Left Hand, weapon Right Hand, super Power, is Wounded Critical, super Super Power, etc.
- an efficient solution must be found that allows the creation of the superhero without giving values for all the attributes but
also without allowing the programmers to omit some of them