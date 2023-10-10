package Searching.Binary_Search.prectice;
import java.util.Scanner;

// Binary Search //

// time complexity is : O(logN)
// Space complexity is : O(1)
public class biSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scn.nextInt();
        System.out.println("Enter the elements of array ::");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // printing the matrix //
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] +",");
        }
        System.out.println();
        System.out.println("Enter the element u want to search :: ");
        int elem = scn.nextInt();
        // method calling //
        int ans = BinarySearch(arr, elem);
        System.out.println("The Element found at :: "+ ans);
    }
    // mathod //
    public static int BinarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length-1;

        // comparision //
        while (start <= end) {
            // calculate the middle element //
            int mid = start + (end - start) / 2;
                // TIME - COMPLEXITY OF THIS PROGRAM IS : O(logN) which is better the O(N)

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
