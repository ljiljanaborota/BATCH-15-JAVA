package class15;

public class MPractice3 {

    // create a method that takes an array of int sum all the elements from the array and return the sum
    // first we do  return type==> int
    // second name of he Method===> arraySum
    //then parameters==> int[] arr
    int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}


