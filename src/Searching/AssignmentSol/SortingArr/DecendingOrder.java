package Searching.AssignmentSol.SortingArr;

import java.util.Arrays;
import java.util.Scanner;

/*
    Q1. Write a program to sort an array in descending order using bubble sort.
*/
public class DecendingOrder {
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

        DecendingOrder(arr);
        System.out.println("Decending Order Array is :: ");
        System.out.println(Arrays.toString(arr));
    }
    static void DecendingOrder(int arr[]) {
        // DECENDING ORDER // USING BUBBLE SORT //
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swaping //
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
