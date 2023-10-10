package Array_2d;
import java.util.*;

public class Question_9 {
    
    // public static void printMatrix(int matrix[][]){
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[i].length; j++){
    //             System.out.print(matrix[i][i] +"  ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void rotatedMatrix(int arr[][]){

        // step 1 : transpose the given matrix //
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // step 2 : rotate the transpose matrix //
        for(int i=0; i<arr.length; i++){
            int leftIndex = 0;
            int rightIndex = arr[i].length-1;

            while(leftIndex < rightIndex){
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
    }
    
    public static void main(String[] args) {
        // Rotate the 2D matrix by 90 degree
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // function calling //
        rotatedMatrix(arr);

        for(var mat : arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}
