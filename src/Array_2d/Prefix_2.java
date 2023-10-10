package Array_2d;
import java.util.Scanner;
import java.io.*;

public class Prefix_2 {
     /*
         // Advance Enhance Prefix Sum //
     */

    public static void printMat(int matrix[][]){
        // matrix output //
        int row  = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }

    // Code for Prefix Implementation //

    public static void traverse(int matrix[][]) {
        int row = matrix.length;
        int cols = matrix[0].length;

        // row wise prefix sum //
        for (int i = 0; i < row; i++){
            for (int j = 1; j < cols; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // column wise prefix sum //

        for (int j = 0; j < cols; j++){
            for (int i = 1; i < row; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    public static int prefix(int matrix[][], int r1, int c1, int r2, int c2){
        int result = 0, sum = 0, up_area = 0, left_area = 0, repeted_area = 0;
        traverse(matrix);
        sum = matrix[r2][c2];
        if(c1 >= 1)
            left_area = matrix[r2][c1-1];

        if(r1 >= 1)
            up_area = matrix[r1-1][c2];

        if (r1 >= 1 && c1 >= 1)
            repeted_area = matrix[r1-1][c1-1];

        result =  sum - up_area - left_area + repeted_area;
        return result;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :) ");
        int row = scn.nextInt();
        int cols = scn.nextInt();
        System.out.println("Enter the elements of array matrix ::");

        int array[][] = new int[row][cols];
        // input array elements //
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cols; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        // print matrix function calling //
        System.out.println("The Array Matrix is ::");
        printMat(array);

        // prefix function calling //
        System.out.println("Enter the first cordinates :: ");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        System.out.println("The First Co-Ordinates are :: (" + r1 + "," + c1 + ")");

        System.out.println("Enter the second cordinates :: ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        System.out.println("The Second Co-Ordinates are :: (" + r2 + "," + c2 + ")");

        System.out.println("The prefix Sum is :: " + prefix(array, r1,c1,r2,c2));
    }
}
