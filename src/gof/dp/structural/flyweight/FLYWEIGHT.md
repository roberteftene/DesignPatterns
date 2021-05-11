# Flyweight Pattern

### Intent

Use sharing to support large numbers of fine-grained objects efficiently.

### Motivation

A flyweight is a shared object that can be used in multiple contexts simultaneously.
The flyweight acts as an independent object in each context—it's indistinguishable
from an instance of the object that's not shared. Flyweights cannot make
assumptions about the context in which they operate. The key concept here is the
distinction between intrinsic and extrinsic state. Intrinsic state is stored in
the flyweight; it consists of information that's independent of the flyweight's
context, thereby making it sharable. Extrinsic state depends on and varies with
the flyweight's context and therefore can't be shared. Client objects are
responsible for passing extrinsic state to the flyweight when it needs it.

Flyweights model concepts or entities that are normally too plentiful to represent
with objects. For example, a document editor can create a flyweight for each letter
of the alphabet. Each flyweight stores a character code, but its coordinate
position in the document and its typographic style can be determined from the
text layout algorithms and formatting commands in effect wherever the character
appears. The character code is intrinsic state, while the other information is
extrinsic. 

### Applicability

The Flyweight pattern's effectiveness depends heavily on how and where it is used.
Apply the Flyweight pattern when all the following are true:

- An application uses many objects
- Storage costs are high because of the sheer quantity of objects
- Most object state can be made extrinsic
- Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
- The application doesn't depend on object identity. Since flyweight objects may be shared,
identity tests will return true for conceptually distinct objects.

### Component

- **Flyweight** 
    - declares an interface through which flyweights can receive and act
      on extrinsic state.
      
- **FlyweightFactory**
    - creates and manages flyweight objects
    - ensures that flyweights are shared properly. When a client requests
      a flyweight, the FlyweightFactory object supplies an existing
      instance or creates one, if none exists.     

- **FlyweightConcrete**
    - implements the flyweight interface and adds storage for intrinsic state, if any, which 
    cannot be shared. 
    
- **Client**
    - maintains a reference to flyweight(s)
    - computes or stores the extrinsic states of flyweight(s).
    
### Consequences

- The memory used by the objects is reduced by sharing them between clients or objects of similar types.
- Flyweight objects must be immutable.

### Problem example solved

To efficiently manage (from a memory point of view) scenarios in which players interact with multiple
computer-controlled characters find a solution based on:
- the collection of computer-coordinated characters contains elements of the same kind (the same 3D models)
- the space occupied by a 3D model is significant
- generating such a scenario requires a significant memory space for the client
- 3D models are displayed on the screen at different coordinates and can have textures of different colors
- an efficient solution must be found regarding the management of these situations
