package class23;

public class Student {
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
*/
    public void strStudent(){
    System.out.println("all the student need to take the test ");
}
    public void book(){
        System.out.println(" the student have have books");
    }
    public void computer(){
        System.out.println(" the student needs to practice on the computers");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void strStudent() {
        System.out.println("all the student trying to studay hard to get a job ");
    }

    @Override
    public void book() {
        System.out.println(" the student have to follow the teacher ");
    }

    @Override
    public void computer() {
        System.out.println(" the student needs to practice a lot to understand ");
    }
}
class CollegeStudent extends Student{
    @Override
    public void strStudent() {
        System.out.println(" the college student need follow the rules of the teacher ");
    }

    @Override
    public void book() {
        System.out.println("the level of college student is different ");
    }

    @Override
    public void computer() {
        System.out.println(" the college student study hard ");
    }
}
class SchoolStudent extends Student{
    @Override
    public void strStudent() {
        System.out.println(" study");
    }

    @Override
    public void book() {
        System.out.println(" writing a lot ");
    }

    @Override
    public void computer() {
        System.out.println(" follow the the teacher lechers ");
    }
}