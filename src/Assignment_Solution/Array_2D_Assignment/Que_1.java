package Assignment_Solution.Array_2D_Assignment;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        /*
            Q1: Take m and n input from the user and m * n integer inputs from user and 
            print the following:
            
           -> number of positive numbers
           -> number of negative numbers
           -> number of odd numbers
           -> number of even numbers
           -> number of 0.

        //    input
                1 2 -3 4
                0 0 -4 2
                1 -1 2 3
                -4 -5 -7 0
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of row and cols for matrix : ");
        int row = scan.nextInt();
        int cols = scan.nextInt();

        System.out.println("Enter the matrix elements : ");
        int arr[][] = new int[row][cols];
        int p;
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        int positive = 0, negative = 0, zero = 0, even =0, odd =0;
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] > 0)
                positive++;
                if(arr[i][j] < 0)
                negative++;
                if(arr[i][j] == 0)
                zero++;
                if(arr[i][j]%2 == 0)
                even++;
                if(arr[i][j]%2 != 0)
                odd++;
            }
        }
        System.out.println("The No of positive elements is : "+ positive);
        System.out.println("The No of negative elements is : "+ negative);
        System.out.println("The No of even elements is : "+ even);
        System.out.println("The No of odd elements is : "+ odd);
        System.out.println("The No of zero elements is : "+ zero);
    }
}
