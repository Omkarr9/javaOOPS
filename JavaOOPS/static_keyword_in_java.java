/* The static keyword in Java is mainly used for memory management. 
The static keyword in Java is used to share the same variable or method of a given class. 
The users can apply static keywords with variables, methods, blocks, and nested classes. 
The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.
 */



class Student3{
    String student_name;
    static String school_name;  // school name will be same for all students

    // practical use - suppose if the school name is changed in the future then it will updated for all the students and we dont to update the school name for each student
     /* memory is assigned once to static data so whenever we want to save the memory and when the data is common for all, we use static */

    static void static_method(){
        System.out.println("This is a static method and you dont have to create an object to access me");
    }

    public static void changeSchool(){
        school_name = "new school"; // school name is changed for all the students
    }
}
public class static_keyword_in_java {
    public static void main(String args[]){

        Student3.school_name = "SECAB"; // we do not have to create object for static fields, we can directly use the class name itself

        Student3 obj = new Student3(); // since student_name is not static, so we have to create an object to access it

        obj.student_name = "Omkar"; // object to access student_name 

        Student3.static_method(); // we can also access static methods without creating object of the class and just by using the class name itself

        System.out.println(Student3.school_name);
        System.out.println(obj.student_name);
    }
}
