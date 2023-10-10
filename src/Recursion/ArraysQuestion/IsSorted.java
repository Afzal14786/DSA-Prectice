package Recursion.ArraysQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Check, if the array is sorted or not using recursion //
public class IsSorted {
    public static void main(String[] args) {
        // Question : take an array input from user and check if it is sorted or not using recursion //
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array-> ");
        int size = scn.nextInt();

        System.out.println("Enter the elements of array-> ");
        int array[] = new int[size];
        // input //
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        // display the array //
        System.out.println("The Entered array is :: ");
        for(int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        // function calling //
        boolean ans = isSorted(array,0);
        System.out.println("Answer is-> " + ans);
    }

    // function defination //
    static boolean isSorted(int arr[], int index) {
        // base case :
        if (index == arr.length-1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
