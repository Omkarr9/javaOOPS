// Access modifiers help to restrict the scope of a class, constructor, variable, method, or data member.

// It provides security, accessibility, etc to the user depending upon the access modifier used with the element.

// Data hiding can be achived through access modifiers

// Data hiding is the process of protecting the members of class from unintended changes 

/*Types of Access Modifiers in Java
There are four types of access modifiers available in Java: 

1. Default – No keyword required and When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. 
            The data members, classes, or methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package.
2. Private - 
3. Protected
4. Public
*/

class Account2{
    public String name;
    protected String email;  // The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
    private String password; // getters and setters are used to access values defined with private access modifers
    // The private access modifier is specified using the keyword private. 
    // The methods or data members declared as private are accessible only within the class in which they are declared
    // in this case only Account2 class can access password and obj of this class cannot directly access password without creating getters and setters
    // getters and setters
    public String getPassword(){
        // setPassword(randomPass);  we do this to avoid creating setter and assigning password overself and setPassword can have access modifer as private and Account2 class cannot access setPassword but getPassword can access it and set any random password
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class access_modifiers {
    public static void main(String args[]){
        Account2 acc_obj = new Account2();
        acc_obj.name = "Omkar";
        acc_obj.email = "omkar619619@gmail.com"; // this can be only be accessed by different classes by importing current package
        // obj.password = "abcd";  // this cant be done as the scope is private, we need to use getters and setters

        acc_obj.setPassword("abcd");
        System.out.println(acc_obj.getPassword());

    }
    
}
