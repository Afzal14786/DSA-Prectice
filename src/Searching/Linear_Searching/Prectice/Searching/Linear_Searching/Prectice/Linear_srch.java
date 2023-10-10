package Searching.Linear_Searching.Prectice.Searching.Linear_Searching.Prectice;

public class Linear_srch {
    public static void main(String[] args) {
        int nums[] = {1, 4, 5, 87, 9, -4, 2, -5};
        int target = 1;
        System.out.println(linearSearch(nums, target));
        System.out.println(linearSearch1(nums, target));
        System.out.println(linearSearch2(nums,target));
    }

    public static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        // enhanced for loop //
        for (int elem : arr) {
            if (elem == target) {
                return elem;
            }
        }
        return -1;
    }

    // return true if element exist //
    public static boolean linearSearch1(int arr[], int target) {
        if (arr.length == 0) {
            return false;
        }
        // for loop //
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // return the element if exist //
    public static int linearSearch2(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        // enhance for loop //
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

}
