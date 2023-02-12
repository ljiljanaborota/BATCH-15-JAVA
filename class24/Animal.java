package class24;

public class Animal {
    /*
    define the speak eat methods and create 3 subclases and override the speak eat method
     */
         // abstract void speak();
        void speak () {
            System.out.println("Animal sound!");
        }
        void eat () {
            System.out.println("Animal eats!");
        }
    }
    class Cat extends Animal {

        @Override
        void speak() {
            System.out.println("Meow!");
        }
        @Override
        void eat() {
            System.out.println("Num num!");
        }
    }
    class Dog extends Animal {
        @Override
        void speak() {
            System.out.println("BARK BARK");
        }

        @Override
        void eat() {
            System.out.println("Dog is eating");
        }
    }


