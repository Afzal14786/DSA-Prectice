package Searching.Binary_Search.prectice;
import java.util.*;
import java.io.*;

// Selection Sort //
// time complexity :: O(n^2);
// Space Complexity :: O(1)

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {5,98,78,67,94,34,65,82,72,46,99,22};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SelectionSort(int arr[]) {
        // Outeer loop //
        for (int i = 1; i < arr.length; i++) {
            int smalest = i;
            // inner loop //
            for (int j = i + 1; j < arr.length; j++) {
                // check the condition //
                if (arr[smalest] > arr[j]) {
                    smalest = j;
                }
            }
            if (smalest != arr[i]) {
//                // First way of Swaping //
                int temp = arr[smalest];
                arr[smalest] = arr[i];
                arr[i] = temp;

//                // Second way of swaping //
//                arr[smalest] = arr[smalest] ^ arr[i];
//                arr[i] = arr[smalest] ^ arr[i];
//                arr[smalest] = arr[smalest] ^ arr[i];
            }
        }
    }
}
