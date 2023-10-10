package Assignment_Solution.Array_2D_Assignment;

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        /*
          write a program to print all the primary diagonal elements of a matrix and 
          sum of the diagonal elements :
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of matrix :");
        int n = scn.nextInt();
        int sum = 0;
        // input matrix //
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        // output matrix //
        System.out.println("Matrix is :");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        // // left diagonal elements //
        System.out.print("Diagonal elements are : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

        // for(int i=0; i<n && i<n; i++){
        //     System.out.print(arr[i][i]+" ");         // better approach
        // }
        System.out.println();
        // // sum of diaognal elements //
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==j){
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("Sum of left diognal elements are: "+sum +" ");

        // Right Diagonal elements //
        // System.out.print("right diagonal elements are: ");
        // for(int i=0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         if(i+j == n-1){
        //             System.out.print(arr[i][j] +" ");
        //         }
        //     }
        // }
        
        // both diagonal elements //
        // System.out.println("Both diagonal elements are : ");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i+j == n-1 || i==j){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //     }
        // }

        System.out.println(); // only for next line
        // sum of right diagonal element //
        // System.out.print("Sum of right diagonal elements are :");
        // for(int i=0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         if(j+i == n-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        // sum of both diagonal elements //

        System.out.print("Sum of both diagonal elements are :");
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j || j+i == n-1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}
