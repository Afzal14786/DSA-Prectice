package Recursion.ArraysQuestion;
// find element in an array is it is exist return its index value if not the return false //
public class FindElem {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,8,9,10};
        int target = 7;
        int res = findIdex(arr,target,0);
        System.out.println("Index of the target element is-> " + res);
        System.out.println("Is Target Element Exist-> " + find(arr,target,0));
        System.out.println("The index of target element form the last of the array-> " + findIndexLase(arr,target,arr.length-1));
    }

    static int findIdex(int arr[], int target, int index) {
        // base case condition //
        // if the target value dose not exist it's return -1, it exist its return it's index value //
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIdex(arr, target, index+1);
        }
    }


    // in this method return true if the target element exists if not then return  false //
    static boolean find(int arr[], int target, int index) {
        if (index == arr.length) {
            return true;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // find index value of target from last //
    static int findIndexLase(int arr[], int target, int index) {
        // base case condition //
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return target;
        }
        return findIndexLase(arr, target, index-1);

    }

}
