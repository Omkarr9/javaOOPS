// constructor is a block of code similar to method
// it is called when a instance of class is created
// constructor will always have same name as its class
// constructor does not have any return type nor void
// constructor can be called only once 
// there are three types of constructors --> default constrctors, parameterized constructors and copy constructors
// destructors are automatically handled in java, with the help of garbage collector

// real life example --> Registering a new user on a website.   
// --> Initializes a user profile with details like username, email, and date of registration.


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){ // constructor 
        System.out.println("Constructor called");
        this.name = name;
        this.age = age;
    }
}
public class constructors {
    public static void main(String args[]){
        Student s1 = new Student("Omkar", 21);
        s1.printInfo();
        // now we dont need to assign name and age since we have added those values in the constructor itself
        // dont need to do s1.name = "Omkar" and s1.age = 21

        
    }
    
}
