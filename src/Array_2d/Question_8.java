package Array_2d;

import java.util.Scanner;

public class Question_8 {

    static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }
    static int[][] spiral(int n){
        int matrix[][] = new int[n][n];
        int topRow = 0, rightCols = n-1, bottomRow = n-1, leftCols=0;
        int curr = 1;

        while(curr <= n * n){
            for(int j= leftCols; j<= rightCols && curr <= n*n; j++){
                matrix[topRow][j] = curr++;
            }
            topRow++;

            for(int i=topRow; i<=bottomRow && curr <= n*n; i++){
                matrix[i][rightCols] = curr++;
            }
            rightCols--;

            for(int j = rightCols; j>=leftCols && curr <= n*n; j--){
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            for(int i = bottomRow; i>= topRow && curr <= n*n; i--){
                matrix[i][leftCols] = curr++;
            }
            leftCols++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        /*
            Q. Generate A matrix in Spiral Order from taking input the no of rows(n) and columns(n) from user.
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the value of N :");
         int n= scan.nextInt();

         int matrix[][] = spiral(n);
         System.out.println("The Spiral Matrix is :");
         printMatrix(matrix);
    }
}
