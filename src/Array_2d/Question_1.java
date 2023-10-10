package Array_2d;
import java.util.*;
public class Question_1 {
    public static void main(String[] args) {
        /*
         Q> Take a matrix as input from user. Search for a 
            given number x and print the indices at which it occurs.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter The No Of Columns");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements of matrix :");
        //input
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of X :");
        int x = sc.nextInt();
        System.out.println("The value of X is :" + x);

        //Output //
        System.out.println("The Matrix is :");
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == x){
                    System.out.println("X is found at (" + i + ", " + j + ")");
                }
            }
        }
    }
}
