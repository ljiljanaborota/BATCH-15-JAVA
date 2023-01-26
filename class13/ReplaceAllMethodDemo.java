package class13;



public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kjFGHAD56455%$@#(*()";
        System.out.println(str.replaceAll("[A-Z]","#"));
        // replace all upper case letter from A TO Z
        System.out.println(str.replaceAll("[a-z]","#"));
        // replace all LOWER case letter from a to z
        System.out.println(str.replaceAll("[0-9]","#"));
        // replace all lower case letter from 0-9
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        // replace all lower case letter from A TO Z,and lowe case letter from a-z and numbers
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // replace all upper case letter from A TO Z
    }
}
