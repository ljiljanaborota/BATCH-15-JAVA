package class14;

public class ReturnedDemoTester {
    public static void main(String[] args) {
        ReturnedDemo rd=new ReturnedDemo();
        String str= rd.method1();
        System.out.println(str);
        int result=rd.method2();
        System.out.println(result);
    }
}
