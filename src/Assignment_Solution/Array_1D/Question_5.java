package Assignment_Solution.Array_1D;
import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        /*
            Find the first peak element in the array. A peak element is 
            an element that is greater than its just left and just right neighbor.
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

        // int arr[] = {1,3,2,6,5};

         // First peak element implemantation
         int n = arr.length;
         System.out.println("The Peak Elements are :");
         for(int i=1; i<n-1; i++){
            if(arr[i]> arr[i-1] && arr[i] > arr[i+1]){
                System.out.print( arr[i]+",");
            }
         }
    }
}
