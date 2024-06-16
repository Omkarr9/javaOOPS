// copy constructors is used to copy object to another object


class Student1{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student1(Student1 class_object){ // copy constructor , this constructor will take a class object as a parameter
        System.out.println("Copy Constructor Called");
        this.name = class_object.name; 
        this.age = class_object.age;
    }
    Student1(){  // this constructor is for s1 object

    }
}
public class copy_constructors {
    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.name = "Omkar";
        s1.age = 21;
        s1.printInfo();

        Student1 s2 = new Student1(s1); // assigning properties/values of s1 to s2
        s2.printInfo();
        
    }
    
}
