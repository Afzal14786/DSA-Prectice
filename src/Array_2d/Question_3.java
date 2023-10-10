package Array_2d;
import java.util.*;

/*
        Q. Write a program to display Multiplication of two matrices entered by user.

 */

public class Question_3 {

    static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

static void multiple(int matrix1[][], int r1, int c1, int matrix2[][], int r2, int c2){
    if(c1 != r2){
        System.out.println(" invalid dimantions : matrix Multiplication is not possible:");
        return;
    }
    int solution[][] = new int[r1][c2];
    for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
            for(int k=0; k<c1; k++){
                solution[i][j] += (matrix1[i][k] * matrix2[k][j]); // Time complexity = O(n^3)
            }
        }
    }
    System.out.println("Multiple of 2 matrices :");
    
    for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
            System.out.print(solution[i][j]+"  ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of 1st matrix :");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();

        // Input matrix 1 //
        int matrix1[][] = new int[r1][c1];
        System.out.println("Enter the 1st Matrix Element :");
        for(int i=0;i<r1;i++){
            for(int j=0; j<c1; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }
        //Output
        System.out.println("The Elements of 1st Matrix");
        printMatrix(matrix1);

        System.out.println("Enter the no of rows and columns of 2nd Matrix :");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();

        // Input matrix 2 //
        int matrix2[][] = new int[r2][c2];
        System.out.println("Enter The Element of 2nd Matrix :");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }
        // output matrix 2
        System.out.println("The Elements Of 2nd Matrix :");
        printMatrix(matrix2);

        multiple(matrix1, r1, c1, matrix2, r2, c2);
    }
}

// Time complextiy = O(n^2)
// Space complextiy = O(n)