package class17;

public class DogTester {
    String name;
    String breed;
    String color;
    int age;
    double weight;


    DogTester(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {

        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;


    }

    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Color " + color + " age " + age + " weight " + weight);
    }
}

