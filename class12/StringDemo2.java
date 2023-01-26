package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="JAVA IS FUN 11354JK";
       String newStr= str.toLowerCase();// ONLY convert all uppercase to lower case letter
        System.out.println(newStr);
        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();// convert lower case to upper case
        System.out.println(upperCaseLetter);
    }
}
