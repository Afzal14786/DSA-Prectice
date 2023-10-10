package Array_2d;
import java.util.Scanner;
import java.io.*;
/*
    Prefix Sum :: Optimize Approach
    Time Complexity :: O(log n)
    Space Complexity :: O(1)
 */

public class pre {
    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void pre(int matrix[][]){
        int row = matrix.length;
        int cols = matrix[0].length;

        // row wise prefix sum //
        for(int i=0; i<row; i++){
            for(int j=1; j<cols; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // column wise prefix sum //
        for(int j=0; j<cols; j++){
            for(int i=1; i<row; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    public static int findprefix(int matrix[][], int r1, int c1, int r2, int c2){
        int ans = 0, sum = 0, up = 0, left = 0, left_up = 0;
        pre(matrix);

        sum = matrix[r2][c2];
        if(c1>=1){
            left = matrix[r2][c1-1];
        }

        if(r1>=1){
            up = matrix[r1-1][c2];
        }
        if(r1>=1 && c1>=1){
            left_up = matrix[r1-1][c1-1];
        }
        ans = sum - up -left + left_up;
        return ans;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of matrix :");
        int row = scan.nextInt();
        int cols = scan.nextInt();

        System.out.println("Enter the "+(row*cols)+" elements in the matrix :");
        int arr[][] = new int[row][cols];
        // matrix input from user //
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix is :)");
        printMatrix(arr);

        int r1, c1, r2, c2;

        System.out.print("Enter the first co-ordinates : ");
        r1 = scan.nextInt();
        c1 = scan.nextInt();
        System.out.println("First co-ordinates are :(" + r1 + ","+ c1 + ")");

        System.out.print("Enter the second co-ordinates : ");
        r2 = scan.nextInt();
        c2 = scan.nextInt();
        System.out.println("Second co-ordinates are :(" + r2 + ","+ c2 + ")");

        System.out.println("Approach 2 Prefix Sum is :) " + findprefix(arr, r1, c1, r2, c2));
    }
}
