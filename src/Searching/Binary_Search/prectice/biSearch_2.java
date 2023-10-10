package Searching.Binary_Search.prectice;
// Order Agnostic Binary Search //

public class biSearch_2 {
    public static void main(String[] args) {
        int arr[] = {20,18,16,14,12,10,8,6,4,2};
        int elem = 4;
        int ans = DecendingBiSearch(arr, elem);
        System.out.println("The Element found at :: " + ans);
    }

    // Method Creation //
    static int DecendingBiSearch(int matrix[], int target) {

        int start = 0;
        int end = matrix.length - 1;
        // in case of decending ordered array //
        while (start <= end) {
            // calculation of mid //
            int mid = start + (end - start) / 2;
            if (target > matrix[mid]) {
                end = mid - 1;
            } else if (target < matrix[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
