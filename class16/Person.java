package class16;




public class Person {
    private double bankBalance=125000;
    String Address="street 123";
    public String name="john snow";
    private void printPhonePassword(){
        System.out.println("pass123");
        }
        public void printTikTokAccount(){
            System.out.println("123");
        }



    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printTikTokAccount();
    }
}
