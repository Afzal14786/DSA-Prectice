package Searching.Binary_Search.Prectice_Questions.Interview_Questions;
import java.util.Scanner;

// time complexity : O(logN)
// space complexity : O(1)

// First Occurrence Problem //

public class Que_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :: ");
        int n = scn.nextInt();

        System.out.println("Enter the elements of array ::");
        int arr[] = new int[n];
        // take array elements input from user //
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // display the elements of array //
        System.out.println("The Array elements are ::");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] +", ");
        }
        System.out.println();
        System.out.println("The target value is ::");
        int target = scn.nextInt();

        int result = firstOccurrence(arr, target);
        if (result == -1) {
            System.out.println("The element does't exist in the array ::");
        } else{
            System.out.println("Target Element first occurrence present in :: " + result);
        }
    }

    // function definition //
    static int firstOccurrence(int matrix[], int target) {
        int start = 0;
        int end = matrix.length-1;
        int result = -1;

        // check the array is in assending or decending order  //
        boolean isAssending = matrix[start] < matrix[end];

        while (start <= end) {

            // calculate the mid //
            int mid = start + (end - start) / 2;
            // comparision //
            if (isAssending) {  // this will execute when the array is in assending order //
                if (matrix[mid] == target) {
                    result = mid;
                    end = mid - 1;
                } else if (matrix[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {  // this will execute when the array is in decending order //
                if (matrix[mid] == target) {
                    result = mid;
                    end = mid - 1;
                } else if (matrix[mid] < target) {
                    end = mid - 1;
                } else {
                   start = mid + 1;
                }
            }
        }
        return result;
    }
}
