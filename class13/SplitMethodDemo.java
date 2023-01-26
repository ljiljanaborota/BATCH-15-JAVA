package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str=" I like Java. I write a lot of code daily. I am from the batch 15";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[2]);
        // when ever we are working with arrays,we use the length
        // whenever we are working with String we use length()
    }
}
