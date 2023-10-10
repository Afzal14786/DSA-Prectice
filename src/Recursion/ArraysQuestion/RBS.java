package Recursion.ArraysQuestion;

public class RBS {
    public static void main(String[] args) {
        // Rotated Binary Search using recursion //
        int array[] = {2,4,6,8,10,12};
        int target = 12;
        int result = RBS(array, target, 0, array.length - 1);
        if (result == -1) {
            System.out.println("No target element found in array🤔");
        } else {
            System.out.println("Target Element found at index 😜-> " + RBS(array, target, 0, array.length - 1));
        }
    }

    static int RBS(int arr[], int target, int start, int end) {
        // base case condition //
        while (start <= end) {
            // mid //
            int mid = start + (end - start) / 2;
            // condition 1:
            if (arr[mid] == target) {       // time complexity : O(1)
                return mid;
            }
            // condition 2:
            if (target > arr[mid]) { // time complexity : O(logn) // space complexity : O(n)
                return RBS(arr, target, mid + 1, end);
            } else { // condition 3 //
                return RBS(arr, target, start, mid - 1);
            }
        }
        return -1;
    }
}