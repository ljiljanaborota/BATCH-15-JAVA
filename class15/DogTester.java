package class15;

public class DogTester {
    public static void main(String[] args) {
        System.out.println("start");
        Dog dog=new Dog();
        dog.printFood();
        System.out.println("end");

        for (int i = 0; i < 2; i++) {
            System.out.println(i);

        }
       // System.out.println(i); cant use outside of block
    }
}
