package Searching.AssignmentSol.Linear_BinarySearch;

import java.util.Scanner;

/*
        Question ::

        Given a sorted binary array, efficiently count the total number of 1’s in it.
 */
public class CountSetBit {
    public static void main(String[] args) {
        int arr[] = {0,0,1,0,0,0,1,1,1,1,1};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2 == 1) {
                count++;
            }
        }
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("The No of set bit's in the given array is :: " + count);
    }
}
