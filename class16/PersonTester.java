package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       //System.out.println(person.bankBalance); // is private
        // ,so you cant see it

        System.out.println(person.Address);
        System.out.println(person.name);
    }
}
