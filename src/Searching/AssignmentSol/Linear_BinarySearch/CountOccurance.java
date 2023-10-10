package Searching.AssignmentSol.Linear_BinarySearch;

import java.util.Scanner;

/*
    Q4. Given a sorted integer array containing duplicates,
        count occurrences of a given number. If the element
        is not found in the array, report that as well.
 */
public class CountOccurance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // size of array //
        System.out.println("Enter the size of array ::");
        int size = scn.nextInt();

        // array //
        int arr[] = new int[size];
        // take array element from user //
        System.out.println("Enter the elements of array ::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // output  array in console //
        System.out.println("The array is :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // taking target element //
        System.out.println("Enter the target element ::");
        int target = scn.nextInt();

        // function calling //
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        int ans = DuplicateCount(arr,target);
        System.out.println("The target element " + target + " repeated " + ans +" times in array.");
    }

    // function defination //
    static  int DuplicateCount(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
