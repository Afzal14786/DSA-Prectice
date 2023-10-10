package Assignment_Solution.Array_2D_Assignment;
import java.util.*;
public class Que_4 {
    public static void main(String[] args) {
        /*
            write a program to print the elements of both the diagonals in a user inputted square matrix
            in any order.	
         */
        System.out.println("<---------------------------------------------------------------->");

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = scn.nextInt();

        int arr[][] = new int[n][n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
        // both diognals //
        // System.out.println("The both diognals are: ");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==j || i+j == n-1){
        //             System.out.print(arr[i][j]+"  ");
        //         }
        //     }
        // }
        // System.out.println();
        System.out.println("<---------------------------------------------------------------->");
        /*
             Write a program to find the largest element of a given 2D array of integers. 
         */
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MAX_VALUE;
        // for(int array[] : arr){
        //     for(int elem : array){
        //         if(elem > largest){
        //             secondLargest = largest;
        //             largest = elem;
        //         } else if(elem > secondLargest){
        //             secondLargest = elem;
        //         }
        //     }
        // }
        // System.out.println("Largest element is: "+ largest);
        // System.out.println("Second Largest element is: "+ secondLargest);

        /*
            Write a function which accepts a 2D array of integers and its size as arguments and
            displays the elements of middle row and the elements of middle column. Printing can 
            be done in any order.
            
            [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
         */

        System.out.println("<---------------------------------------------------------------->");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==n/2 || j==n/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
