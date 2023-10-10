package Array_2d;
import java.util.Scanner;
import java.io.*;


public class Prefix_3 {

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void findPrefixSum(int matrix[][]){
        int row = matrix.length;
        int cols = matrix[0].length;
        // traverse horizontaly to calculate row-wise prefix sum //
        for(int i=0; i<row; i++){
            for(int j=1; j<cols; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    public static int prefixSum(int [][]matrix, int r1, int c1, int r2, int c2){
        int sum = 0;
        findPrefixSum(matrix);

        // Time Complexity : O(n)
        // Space Complexity : O(1)
        for(int i = r1; i<= r2; i++){
            // r1 to r2 sum for row i
            if(r1 >= 1)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2];
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
        System.out.println("Matrix is :) ");
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

        System.out.println("Sum is :) " + prefixSum(arr, r1, c1, r2, c2));
    }
}
