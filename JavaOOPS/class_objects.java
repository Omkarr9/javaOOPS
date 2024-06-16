// class is a blueprint/prototype from which objects are created
// class is a group of varibles of different datatypes, group of methods
// it contains constructors

class Pen{
    String color;
    String type;

    public void printInfo(){
        System.out.println(this.color);  // this keyword is a reference variable that refers to current object
        System.out.println(this.type);
    }

}

public class class_objects{
    public static void main(String args[]){
        Pen pen1 = new Pen(); // Pen() is a constructor
        // objects are the instances of a class that are created to use the attributes and methods of a class

        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.printInfo();

        // we can create multiple objects of same class

        Pen pen2 = new Pen();  // 2nd object of Pen class
        pen2.color = "Black";
        pen2.type = "Ballpoint";
        pen2.printInfo();

    }
}