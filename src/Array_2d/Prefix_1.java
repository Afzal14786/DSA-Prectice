package Array_2d;
import java.util.Scanner;
import java.io.*;

// Time Complexity = O(n*n)
// Space Complexity = O(1)

public class Prefix_1 {
    
    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static int prifix_sum(int arr[][], int r1, int c1, int r2, int c2){
        int sum = 0;
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of matrix :");
        int row = scan.nextInt();
        int cols = scan.nextInt();

        System.out.println("Enter the "+(row*cols)+" elements in the matrix :");
        int arr[][] = new int[row][cols];
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Orignal matrix is :");
        printMatrix(arr);

        int r1, c1, r2, c2;

        System.out.print("The First co-ordinates are : ");
        r1 = scan.nextInt();
        c1 = scan.nextInt();
        System.out.println("First co-ordinates are :(" + r1 + ","+ c1 + ")");

        System.out.print("The Second co-ordinates are : ");
        r2 = scan.nextInt();
        c2 = scan.nextInt();
        System.out.println("First co-ordinates are :(" + r2 + ","+ c2 + ")");
        

        int result = prifix_sum(arr,r1, c1, r2, c2);
        System.out.println("Sum of the prifix is : " + result);
    }
}
