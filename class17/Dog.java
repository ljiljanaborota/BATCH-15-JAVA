package class17;



public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    Dog(String dogName, String DogBreed, int dogAge, double dogWeight) {
        name = dogName;
        breed = DogBreed;
        age = dogAge;
        weight = dogWeight;

    }
        void printInfo(){
            System.out.println("name "+name+"  breed "+breed+" age "+age+" weight "+weight);
        }


    }


