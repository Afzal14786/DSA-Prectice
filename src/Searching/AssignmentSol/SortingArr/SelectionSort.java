package Searching.AssignmentSol.SortingArr;

import java.util.Arrays;
import java.util.Scanner;

/*
         WAP to sort an array in descending order using selection sort

 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int size = scn.nextInt();

        // Enter the elements in array //
        System.out.println("Enter the elements :: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // PRINTIING OF ARRAY ELEMENTS //
        System.out.println("Array element's entered by you !!");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] +" ");
//        }
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println("Decending Order is :: ");
        System.out.println(Arrays.toString(arr));
    }

    // SELECTION SORT //
    static void SelectionSort(int num[]) {
        // outer loop //
        // THE INNER LOOP SELECT THE MINIMUM ELEMENT IN THE UNORDERED ARRAY AND PLACE IT IN DECENDING ORDER //
        for (int i = 0; i < num.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[smallest] < num[j]) {
                    smallest = j;
                }
            }
            // SWAPING //
            if (num[smallest] != i) {
                int temp = num[smallest];
                num[smallest] = num[i];
                num[i] = temp;
            }
        }
    }
}
