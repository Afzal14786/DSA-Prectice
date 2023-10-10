package Searching.Binary_Search.prectice;

public class BinarySearch {
    public static void main(String[] args) {
        //binary search /
        int arr[] = {1,2,3,7,8,45,46,87,91,101};
        int target = 100;
        System.out.println(BinarySearch(arr,target,0, arr.length-1));
    }
    static int BinarySearch(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return BinarySearch(arr,target,start, mid-1);
        }
        return BinarySearch(arr,target,mid + 1, end);
    }
}
