package Array_2d;

import java.util.Scanner;

public class Question_4 {
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
            Q. Take a matrix input from user and transpose it.
            solution... code :-
         */
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please Enter the no of rows and colums");
        // int row = sc.nextInt();
        // int cols = sc.nextInt();
        // System.out.println("Enter " +(row*cols)+" elements in the matrix :");
        // int mat[][]= new int[row][cols];
        // for(int i=0;i<row; i++){
        //     for(int j=0; j<cols; j++){
        //         mat[i][j]= sc.nextInt();
        //     }
        // }
        // System.out.println("The Orignal matrix is :");
        // printMatrix(mat);
        
        // // Transpose //
        // System.out.println("The Transpose matrix is :");
        // for(int i=0; i<cols; i++){
        //     for(int j=0; j<row; j++){
        //         System.out.print(mat[j][i]+"  ");
        //     }
        //     System.out.println();
        // }
        
        // Q2. take a matrix input from user and transpose it without creating a new matrix.

        System.out.println("Please enter the row and columns of matrix :");
        int row1 = sc.nextInt();
        int cols1 = sc.nextInt();

        System.out.println("Enter " + (row1*cols1) + " Elements of the matrix :");
        int matrix[][] = new int[row1][cols1];
        for(int i=0; i<row1; i++){
            for(int j=0; j<cols1; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Elements of matrix is :");
        printMatrix(matrix);

        System.out.println("The Transpose matrix is :");       
        for(int i=0; i<cols1; i++){
            for(int j=0; j<row1; j++){
                System.out.print(matrix[j][i]+"  ");        // Time complexity = O(n^2) and Space Complexity = O(1).
            }
            System.out.println();
        }
        
    }
}
