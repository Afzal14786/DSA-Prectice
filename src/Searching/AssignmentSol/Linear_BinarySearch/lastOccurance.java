package Searching.AssignmentSol.Linear_BinarySearch;
import java.util.*;
import java.io.*;
/*
    Question ::
    2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
       not present return -1.
 */

public class lastOccurance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :: ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        // Taking input array elements from user //
        System.out.println("Enter the elements of array :: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Array output in console //
        System.out.println("Array entered by you is :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the target value :: ");
        int target = scn.nextInt();

        System.out.println("Answer is ::");
        System.out.println(LowerOccurance(arr, target));
    }

    static int LowerOccurance(int arr[], int target) {
        int start = 0, end = arr.length-1;
        int result = -1;

        while (start <= end) {
            // calculate the middle element //
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                 start = mid + 1;
            }
        }
        return result;
    }
}
