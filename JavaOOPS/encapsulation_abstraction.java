/* 
--> Encapsulation in Java is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data and methods 
    that operate on that data within a single unit, which is called a class in Java. 

--> Java Encapsulation is a way of hiding the implementation 
    details of a class from outside access and only exposing a public interface that can be used to interact with the class.

--> Abstraction in Java is the process in which we only show essential details/functionality to the user. 
    The non-essential implementation details are not displayed to the user.

--> Data hiding and astraction are not same, data hiding is the process of protecting 
    the members of data from unwanted changes which can be done through acess modifers
    
--> Abstraction can be achieved in java through two ways, 1) by creating abstract class  2) by creating interfaces

--> Abstraction in Java is the process in which we only show essential details/functionality to the user. 
    The non-essential implementation details are not displayed to the user. 

*/


abstract class Animal{

    // abstract class can have both normal methods and abstract methods
    abstract void walk();  /*abstract methods do not have any implementation and all 
                            the abstract methods should be implemented in the class which extends this abstract class */

    public void talk(){  // normal method

    }
    // abstract classes can also contain constrctors
    Animal(){
        System.out.println("This is a Animal constructor");
    }
}

class Horse extends Animal{

    public void walk(){
        System.out.println("Horse is walking");
    }

    Horse(){
        System.out.println("This is a Horse Constructor");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken is walking");    
    }
}

public class encapsulation_abstraction {
    public void main(String args[]){

   // Animal ani = new Animal(); // instance or object of an abstract class cannot be created and is does not have any method implementation

   Horse hor = new Horse();
   hor.walk();

   Chicken chk = new Chicken();
   chk.walk();

}
}
