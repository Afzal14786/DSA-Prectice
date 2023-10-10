package Searching.Binary_Search.prectice;
import java.util.*;
import java.io.*;

// Insertion Sort //

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12,98,67,65,90,45,76,82,34};
        // function calling //
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // function defination //
    public static void insertionSort(int arr[]) {
        // loop for insertion sort //
        for (int i = 1; i < arr.length; i++) {
            // let a variable j will be i ;
            int j = i;
            // check the condition //
            while (j > 0 && arr[j] < arr[j - 1]) { // it will sort the array in assending order //
                // time complexity :: O(n^2) //
                // Space Complexity :: O(1)
                // ita a stable sort (Relative order is maintained) //
                // if the condition is satisfied then just swap it //

                // First way of swaping //
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;

                // second way of swaping // it is most optimize then first way //
                arr[j] = arr[j] ^ arr[j - 1];
                arr[j - 1] = arr[j] ^ arr[j - 1];
                arr[j] = arr[j] ^ arr[j - 1];
                j--;
            }
        }
    }
}
