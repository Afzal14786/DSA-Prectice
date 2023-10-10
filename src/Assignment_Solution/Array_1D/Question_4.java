package Assignment_Solution.Array_1D;
import java.util.*;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        /*
            Find out the second largest element in the array
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size on an array :");
         int size = sc.nextInt();

         System.out.println("Enter the elements of matrix :");
         int arr[] = new int[size];
         for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
         }
         sc.close();
         System.out.println("The matrix elements are");
         for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
         }
         System.out.println();

         // Implimantation //
         int large = Integer.MIN_VALUE;
         int second_large = Integer.MIN_VALUE;

         for(int element : arr){
            if(element > large){
                second_large = large;
                large = element;
            }else if(element > second_large){
                second_large = element;
            }
         }
         System.out.println("The 2nd largest element is : " + second_large);
    }
}
