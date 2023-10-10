package Assignment_Solution.Array_1D;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        /*
            Write a program to find out the maximum element in the array
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array");
         int arr_size = 0;
         if(sc.hasNextInt()){
            arr_size = sc.nextInt();
         }

         int arr[] = new int[arr_size];

         System.out.println("Enter the elements of array");
         for(int i=0; i<arr_size; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
         }

         System.out.println("The Elements of array is :");
         for(int i=0; i<arr_size; i++){
            System.out.print(arr[i]+" ");
         }
         sc.close();
         System.out.println();
         // Maximum and Minimum element of the input array //

         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;

         for(int element : arr){
            if (element > max) {
                max = element;
            }
         }
         
         for(int element : arr){
            if (element < min) {
                min = element;
            }
         }
         
        System.out.println("The Maximum Element is : "+ max);
        System.out.println("The Minimum Element is : "+ min);
        sc.close();
    }
}
