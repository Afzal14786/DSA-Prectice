package Searching.Binary_Search.prectice;
 // Time Complexity : O(logN)
// space Complexity : O(1)
public class OrderBiSearch {
    public static void main(String[] args) {
//        int arr[] = {-18, -12, -4, 0, 2, 3,4, 15, 16, 18, 22, 45, 89};
        int arr[] = {10,9,8,7,6,4,3,2,1,0,-1,-2,-4};
        int searchingElem = 7;
        int ans = OrderBiSearch(arr, searchingElem);
        System.out.println(ans);
    }
    static int OrderBiSearch(int matrix[], int target) {
        int start = 0;
        int end = matrix.length-1;

        // step :1 check if the array is sorted or not //
        boolean isAssending = matrix[start] < matrix[end];

        while (start <= end) {
            // calculate the mid and find it out //
            int mid = start + (end - start) / 2;
            // check mid //
            if (matrix[mid] == target) {
                return mid;
            }
            // check if the array is assending or decending and write the code //
            if (isAssending) {
                if (target > matrix[mid]) {
                    start = mid + 1; // It's indicates right side of an array from the mid of an array //
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > matrix[mid]) {
                    end = mid - 1; // It's indicates left side of an array from the mid of an array //
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
