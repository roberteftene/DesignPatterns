# Singleton Pattern

### Intent

Ensure a class only has one instance, and provide a global point of access to it.

### Motivation

It's important for some classes to have exactly one instance. Although there can
be many printers in a system, there should be only one printer spooler. There
should be only one file system and one window manager. A digital filter will have
one A/D converter. An accounting system will be dedicated to serving one company. 

A solution is to make the class itself responsible for keeping track of
its sole instance. The class can ensure that no other instance can be created
(by intercepting requests to create new objects), and it can provide a way to
access the instance. This is the Singleton pattern. 

### Applicability

Use the Singleton pattern when

   * there must be exactly one instance of a class, and it must be accessible
     to clients from a well-known access point.
    
  * when the sole instance should be extensible by subclassing, and clients
    should be able to use an extended instance without modifying their code. 
    
### Components

* **Singleton()** - private constructor
* **private static Singleton instance** - private static attribute which represents a unique instance of the Singleton class
* **Singleton getInstance()** - public method for accessing the unique instance

### Implementations

1. private attribute defined static
2. public constant attribute defined static
3. using enumerations
4. _Singleton collection_ or _Singleton registry_ (manage unique objects using collections)

 ### Examples
 
 * Database connection management
 * Configuration management
 * Events management
 * File management
 
 
 ### Problem example with solution
 
 In order to create an online game (with superheroes), you need to create a software solution that will provide
 
 1. Efficient management of the connection to the Database / logger
 - the different modules must use or link a unique connection to the database
 - programmers implementing those modules cannot build multiple objects associated with the database connection
 - the client must use a unique object to take care of the connection to the database