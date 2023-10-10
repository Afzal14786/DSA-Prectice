 import java.util.*;
 import java.io.*;
import java.lang.reflect.Array;
 
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,5,7,24,29,98,65};
         bubbleSort(arr);
        System.out.println("Sorted array is ::");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // loop for bubble sort //
        for (int i = 0; i < arr.length-1; i++) {
            // inner loop //
            boolean swapped = false;
            for (int j = i + 1; j < arr.length- i - 1; j++) {
                // comparision //
                if (arr[j] > arr[j + 1]) {
                    // swaping //
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    swapped = true;
                }
            }
            if(!swapped) {
            break;
            }
        }
        
    }
}
