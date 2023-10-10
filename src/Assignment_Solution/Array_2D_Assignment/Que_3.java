package Assignment_Solution.Array_2D_Assignment;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        /*
            write a program to print the elements above the secondary diagonal in a user inputted
            square matrix.	
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

        // output //
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        // above elements of the secondry / right diagonal of inputted matrix array //
        System.out.print("The Above Elements Are : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j>n-1 ){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.print("The lower Elements Are: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j > n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
