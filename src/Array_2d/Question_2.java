package Array_2d;

import java.util.Scanner;

public class Question_2 {

    static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
            * There is some condition in adding two matrices.
            * -> the order of both matrices must be same.
            Q> Take matrix from user and add them.
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the no of rows and columns of 1st matrix :");
         int row1 = sc.nextInt();
         int cols1 = sc.nextInt();

         int matrix1[][] = new int[row1][cols1];
         System.out.println("Enter the element of matrix1 :");
         // Input Matrix 1
         for(int i=0;i<row1; i++){
            for(int j=0; j<cols1; j++){
                matrix1[i][j] = sc.nextInt();
            }
         }
         // output
         System.out.println("The elements of matrix 1 :");
         printMatrix(matrix1);

         System.out.println("Enter the no of rows and columns of 2nd matrix");
         int row2 = sc.nextInt();
         int cols2 = sc.nextInt();
         
         int matrix2[][] = new int[row2][cols2];
         System.out.println("Enter the element of matrix :");
         //Input Matrix 2
         for(int i=0;i<row2; i++){
            for(int j=0; j<cols2; j++){
                matrix2[i][j] = sc.nextInt();
            }
         }
         // output
         System.out.println("The elements of matrix 2 :");
         printMatrix(matrix2);
         // addition //
        int NewMatrix[][] = new int[row1][cols1];
        if(row1 != row2 || cols1 != cols2){
            System.out.println("Addition is not possible : enter valid matrix");
            return;
        }
        // code for Adding of two matrix
         if(row1==row2 || cols1 == cols2){
            for(int i=0; i<row1; i++){
                for(int j=0; j<cols1; j++){
                    NewMatrix[i][j]= matrix1[i][j] + matrix2[i][j];              
                }
            }
         }
         // Output of the resultend matrix :-
         System.out.println("The Resultend matrix is :");
         for(int i=0; i<row1; i++){
            for(int j=0; j<cols1; j++){
                System.out.print(NewMatrix[i][j] + "  ");
            }
            System.out.println();
         }
    }
}
