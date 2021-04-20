# Simple Factory Pattern

It is not an official pattern but it's a particular case of Factory pattern.

### Components

* AbstractProduct
    
    * define interface for product objects
    
* Product

    * concrete classes which implements the interface; 
    
* Factory

    * hides the creation process of the products
    
* Client

    * uses factory interface toward creating new products