// It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. 
// In Java, Inheritance means creating new classes based on existing ones. 
// A class that inherits from another class can reuse the methods and fields of that class. 
// In addition, you can add new fields and methods to your current class as well.
// we use the keyword 'extends' to perform inheritance

/* Below are the different types of inheritance which are supported by Java.

Single Inheritance  --> one base class and one derived class only
Multilevel Inheritance  --> one base and each dervied class also acts as intermediate base class
Hierarchical Inheritance  --> only one base class and multiple dervied class
Multiple Inheritance   --> it exists in the form of interfaces in java
Hybrid Inheritance --> mix of all other types of inheritances */


class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
    public void shapeInheritanceFunction(){ 
        System.out.println("I am inherited from \"Shape\" class");
    }
}

class triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class inheritance {
    public static void main(String args[]){

        circle obj4 = new circle();
        obj4.area(10);
        obj4.shapeInheritanceFunction();  // this function is inherited from Shape class
    }
}
