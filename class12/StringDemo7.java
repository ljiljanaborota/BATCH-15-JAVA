package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="i love java";
        boolean startsWith=str.startsWith("i"); // checking if string starts with whatever is start,first letter or words
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));// checking if strings end with whatever is ending with
        // method chaining is when multiple methods are called on the same line
        //only those methods can be chained which returnts a String
        System.out.println(str.toLowerCase().startsWith("i"));
        //System.out.println(str.length().startsWith("i")); this one will not work because is str.length
        // if the words are present you will get true in str.contains
        System.out.println(str.contains("java"));


    }
}

