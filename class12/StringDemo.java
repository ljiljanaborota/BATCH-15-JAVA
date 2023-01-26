package class12;

public class StringDemo {
    public static void main(String[] args) {
        // creating object of the String class
        String strObj=new String("java");
        // another shorter way of creating an object of String class
        //mostly this is how we create the objects of string class
        String strObj2="java";
        System.out.println(strObj2.length());
        String str="banana ";
        int len=str.length();
        System.out.println(len);
        String name="hamid poya ";
        if(name.length()>10){
            System.out.println("name can't be more than 10 letters");
        }

    }
}
