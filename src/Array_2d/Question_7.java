package Array_2d;

import java.util.Scanner;

public class Question_7 {

    static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void spiral(int matrix[][], int row, int cols){
        int topRow = 0, rightCols = cols-1, bottomRow = row-1, leftCols=0;
        int total , noOfElem;
        total =0;
        noOfElem = row * cols;

        while(total < noOfElem){
            for(int j= leftCols; j<= rightCols && total < noOfElem; j++){
                System.out.print(matrix[topRow][j]+ ", ");
                total++;
            }
            topRow++;

            for(int i=topRow; i<=bottomRow && total < noOfElem; i++){
                System.out.print(matrix[i][rightCols]+ ", ");
                total++;
            }
            rightCols--;

            for(int j = rightCols; j>=leftCols && total < noOfElem; j--){
                System.out.print(matrix[bottomRow][j]+ ", ");
                total++;
            }
            bottomRow--;

            for(int i = bottomRow; i>= topRow && total < noOfElem; i--){
                System.out.print(matrix[i][leftCols]+ ", ");
                total++;
            }
            leftCols++;
        }
    }
    
    
    public static void main(String[] args) {
        /*
            Q. Given an n * m matrix 'a', return all elements of the matrix in spiral order.
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the no of rows and columns :");
         int row = scan.nextInt();
         int cols = scan.nextInt();
         System.out.println("Enter the " + (row * cols) +" element of matrix :");
         int matrix[][] = new int[row][cols];
         for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = scan.nextInt();
            }
         }
         System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
         System.out.println("Orignal Matrix is :");
         printMatrix(matrix);

         System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
         System.out.println("Spiral Order is :");
        //  spiralOrder(matrix, row, cols);
        spiral(matrix, row, cols);
    }
}
