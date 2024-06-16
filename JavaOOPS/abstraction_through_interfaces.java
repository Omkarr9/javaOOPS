/* An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. 
An interface in Java is a blueprint of a behavior. 
A Java interface contains static constants and abstract methods. */

// Interfaces is complete abstraction meaning we cannot have non abstract methods inside the interfaces
// unlike abstract classes which also supports having non abstract methods inside them.

interface Animal2{
    // interfaces do not support constructors
    // interfaces do not support non abstract methods 
    // interfaces do not support method/function implementation

    // all the fields (varibles, values, methods) are static, public and final by default inside the interface

    int eyes = 2; // this value is static, final and public by default

    public void walk(); // this method/function is abstract and public by default so we do not use abstract keyword and public keyword

    default void animalMethod(){   // default methods allows user to have methods with their implementation in the interface
        System.out.println("This method has an implementation");
    }
}

interface Herbivore{
    public void diet();
}

// implements keyword is used to use interface
// interfaces supports multiple inheritance (one dervied class and multiple base classes) which is not possible through classes

class Horse2 implements Animal2, Herbivore{ // multiple interfaces can inherited by the base class through interfaces
    public void walk(){  // (pubic) scope of the method should always be equal to or higher than scope in interface (which is public)
        System.out.println("Horse is walking");
    }
    public void diet(){
        System.out.println("I eat only vegetarian food");
    }
}

public class abstraction_through_interfaces {
    public static void main(String args[]){
        Horse2 horse = new Horse2();
        horse.walk();
        horse.diet();
    }
    
}
