package Searching.AssignmentSol.SortingArr;

import java.util.Arrays;
import java.util.Scanner;

/*
         WAP to sort an array in decreasing order using insertion sort

 */
public class Insertion {
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
        InsertionSort(arr);
        System.out.println("Decending Order Array is ::");
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                arr[j] = arr[j] ^ arr[j - 1];
                arr[j - 1] = arr[j] ^ arr[j - 1];
                arr[j] = arr[j] ^ arr[j - 1];
                j--;
            }
        }
    }
}
