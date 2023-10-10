package Array_2d;

import java.util.Scanner;

public class Declaration_of_2d_array {
    public static void main(String[] args) {
        // Input 2D_array from user //
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The No Of Rows");
        int rows = scan.nextInt();
        System.out.println("Enter the no of column");
        int cols = scan.nextInt();

        int array[][] = new int[rows][cols];
        System.out.println("Enter your matrix :");
        
        //Input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("The Matrix is : ");

        //Output
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}
