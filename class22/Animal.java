package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("animal  can speak");
    }
    void eat(){
        System.out.println("all the animals eat");
    }

}
class Cat extends Animal {
    // we are overrding speak method in Cat class
    void speak() {
        super.speak();
        System.out.println("Meow Meow.........");
    }
    void printName(){
        System.out.println(name);
    }
}

    class Dog extends Animal {


    }

    class Tester {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.speak();
        }
    }

