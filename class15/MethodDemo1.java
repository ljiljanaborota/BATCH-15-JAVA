package class15;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int num=scanner.nextInt();
        System.out.println("you entered "+num);
        Methods methods=new Methods();
        methods.doSomething();
        //int num2=methods.doSomething();
       String c= methods.method2();
    }
}
