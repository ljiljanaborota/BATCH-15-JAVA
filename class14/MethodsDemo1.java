package class14;

public class MethodsDemo1 {
    public static void main(String[] args) {
       int [] array1={10,20,30,45,50}; // adding all of it
       int sum=0;
       for(int number:array1){
           sum+=number;
        }
        System.out.println(sum);
       int [] array2={10,10,10,20,30};
            int sum2=0;
            for(int number:array2){
                sum2+=number;
            }
        System.out.println(sum2);
    }

}
