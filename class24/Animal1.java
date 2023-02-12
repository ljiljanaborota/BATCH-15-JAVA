package class24;

public abstract  class Animal1 {
    abstract void speak();
    void sleep(){
        System.out.println("animal sleep 5 to 8 hours a day");
    }
}
class Dog1 extends Animal1{
    void speak(){
        System.out.println("wuff wuff");
    }
}
 class Cat1 extends Animal1{
    void speak(){
        System.out.println("meow meow");
    }

}