package class19;

public class Student {
    /*
    Write a Student class   that have instance variables name and address. Create a constructor that will
     initialize those variables. Print name & address of given  student using displayInfo method.

Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String name;
    String address;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo(String name, String address) {
        System.out.println(name + address);
    }
}



