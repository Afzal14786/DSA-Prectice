package Array_2d;
import java.util.*;
public class Question_5 {

    static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int arr[]){
        int i=0, j=arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void transpose(int matrix[][], int row, int cols){
        for(int i=0; i<cols; i++){
            for(int j=i; j<row; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void rotate(int matrix[][], int n){
        transpose(matrix, n, n);

        for(int i=0; i<n; i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        /*
             Q.5 Take a square matrix input from user and rotate it by 90 degree in a clockwise
                 direction without using any extra space.

                note :- Rotation only works when the given matrix is a square matrix.
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the no of rows and columns :");
         int row = scan.nextInt();
         int cols = scan.nextInt();

         System.out.println("Enter the "+ (row*cols) +" elements of matrix :");
         int matrix[][] = new int[row][cols];
         // Input //
         for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = scan.nextInt();
            }
         }
         // Output //
         System.out.println("Orignal Elements of matrix is :");
         printMatrix(matrix);

         System.out.println("The transpose Array is : ");
         for(int i=0; i<cols; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[j][i]+"  ");
            }
            System.out.println();
         }

        rotate(matrix, row);

        System.out.println("Rotated matrix is :");
        printMatrix(matrix);
    }
}
