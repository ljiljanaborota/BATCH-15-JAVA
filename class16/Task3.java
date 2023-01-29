package class16;



public class Task3 {
    // Create a method that will print whether given String is palindrome or not.
    // return type ==>void
    // name==>ispalindrome
    // parameters==> String inputStr
    // example dad==>dad true
   void isPalindrome(String str){
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + "not is palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
      // String result=  task3.isPalindrome("kaya"); cant assign void methods to variable
      //  System.out.println(task3.isPalindrome("kaya");); cant use void method in Println
       task3.isPalindrome("kaya");

    }
}

