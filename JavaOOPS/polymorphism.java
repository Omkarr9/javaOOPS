// polymorphism is having many forms
// doing the same task in different types
// polymorphism is of two types
// 1 --> function overloading  , this is compile time polymorphism...error is detected during compilation
// 2 --> function overriding  , this is run time polymorphism...error is detected during runtime

// function overloading is defining functions with same name but different properties
// each function should differ in either return type, parameters and number of parameters

//A real-life example of method overloading could be a class "Calculator" having multiple methods named "add" with different parameters, such as add(int a, int b), add(double a, double b) and add(int a, int b, int c).

class Student2{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class polymorphism{
    public static void main(String args[]){
        Student2 s3 = new Student2();
        s3.name = "Omkar";
        s3.age = 21;

        s3.printInfo(s3.name);
        s3.printInfo(s3.name, s3.age);
        s3.printInfo(s3.age);

    }
}