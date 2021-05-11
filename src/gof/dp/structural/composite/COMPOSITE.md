# Composite Pattern

### Intent

Compose objects into tree structures to represent part-whole hierarchies.
Composite lets clients treat individual objects and compositions of objects
uniformly. 

### Applicability

Use the Composite pattern when

- you want to represent part-whole hierarchies of objects
- you want clients to be able to ignore the difference between compositions of objects
  and individual objects. Clients will treat all objects in the composite structure uniformly.


### Components

- **Component**
     - defines the interfaces of all the components of the hierarchy
     - defines the interface of the objects in the composition.
     
- **LeafNode** 
    - define leaf nodes from the composition. A leaf node has no children.
    - define the behavior of the objects

- **Composite**
    - defines behavior for components having children.
    - stores child component
    
- **Client**

### Consequences

- the framework cannot be modified.
- enable easy use of hierarchies of classes which contains composite objects or primitive objects.

### Problem example solved

  
1. Create the possibility that the players, and the game should be able to handle groups of characters
- multiple players or NPCs can be grouped together
- groups can grow by including other groups ot individual characters
- some characters can control groups