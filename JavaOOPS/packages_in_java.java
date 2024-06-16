import Bank.*; // Importing specific class from the Bank package

public class packages_in_java {
    public static void main(String args[]) {
        Account obj5 = new Account(); // Account class is imported from Bank package which is present in Account.java file

        obj5.name = "omkar";
        obj5.bank_name = "State Bank Of India";

        obj5.printAccountInfo();
    }
}
