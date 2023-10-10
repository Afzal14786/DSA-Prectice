package Time_Space_Complexity;

// reversal of an array //

public class Revarsal {
    public static void main(String[] args) {
        int array[] = {1,2,3,5,8,13,144};
        int n = array.length;

        for(int i=0; i<n/2; i++){
            //Swaping 
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        System.out.println("The reverse emelents are :");
        for(int i=0; i<n; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println();

        /*
            Q6. Write two program to find the maximum and the minimum element in an array
                Solution :
         */

        int arr[] = {20, 5, -3000, 40, 2245, -450, 50, 35};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The Maximum Element value is: " + max);
        System.out.println("The Minimum Element value is: " + min);

        /*
        Q7. Write a java program to find whether an array is sorted or not
            Solution :
         */

        boolean isSorted = true;
        int arrr[] = {1,2,3,4,5,7,8,9,10};
        for (int i=0; i<arrr.length-1; i++){
            if (arrr[i] > arrr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Congratulation, The Array is sorted");
        }
        else{
            System.out.println("Batter Luck Next Time, The Array is not sorted");
        }
    }
}
