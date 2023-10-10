package Searching.Binary_Search.NumberSystem.BitOperation;

public class FindUnique {
    public static void main(String[] args) {
        /*
            Question 1 ::
            // Find the only non-repeating element in an array where every element repeats twice //
            Solution ::
         */
        int arr[] = {5,5,7,4,7,3,4,3,1,2,1};
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        System.out.println(unique);

         /*
            Question 2 :: Find the two non-repeating element in an array where every element repeat twice ...
            solution ::

        int arr[] = {5,5,7,4,7,3,4,3,1,2,1,9};
        int result = 0;
        int temp = 0;
        for (int i = 0; i< arr.length; i++) {
            result = result ^ arr[i];
        }
        result = (result & -result);

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & result) > 0) {
                num1 = num1 ^ arr[i];
            } else {
                num2 = num2 ^ arr[i];
            }
        }
        System.out.println("The Non-repeating Elements Are :: " + num1 +" and " + num2);
          */

        /*
            Questin 3 :: Find the only non-repeating element in an array where every
                         other element repeats thrice...
            Solution :: panding;
         */
        /*
            Find i-th bit of a given number //
         */
    }
}
