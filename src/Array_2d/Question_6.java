package Array_2d;
import java.util.*;
/*
    Q. Given an integer n. return the first n rows of pascle's trangle.
       Note :- 
       -> In pascle's trangle, each number is the sum of two numbers above it.
       -> In pascle's trangle, first and last element is: 1.
       
       Approach to solve a pascle's trangle problem :
       1 : p[i][j]= p[i-1][j] + p[i-j][j-1]
       2 : In pascle's trangle, first and last element is: 1.
       3 : jagged array -> ith row has (i+1) columns.
 */

public class Question_6 {

    static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static int[][] pascle(int n){
        int pascleTrangle[][] = new int[n][];
        for(int i=0; i<n;i++){
            // ith row has (i+1) columns //
            pascleTrangle[i] = new int[i+1];
            // First and last element is : 1. //
            pascleTrangle[i][0] = pascleTrangle[i][i] = 1;
            // formula implemantation //
            for(int j=1; j<i; j++){
                pascleTrangle[i][j] = pascleTrangle[i-1][j] + pascleTrangle[i-1][j-1];
            }
        }
        return pascleTrangle;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = scan.nextInt();

        int pascleTrangle[][] = pascle(n);
        System.out.println("The Pascle Trangle is :");
        printMatrix(pascleTrangle);
    }
}
