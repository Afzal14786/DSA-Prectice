package Searching.Binary_Search.Prectice_Questions.Interview_Questions;
// Bubble Sort Problem //

// Assending or Decending Order :: //
// Time Complexity :: O(n^2) //
// Space Complexity :: O(1) //

import javax.swing.*;
import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
         // Bubble Sorting //
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :: ");
        int n = scn.nextInt();
        // array input //
        System.out.println("Enter the array elements :: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // print orignal array //
        System.out.println("The Array Elements Are :: ");
        print(arr);

            // loop for sorting in assending order //

        // time complexity :: O(n^2) ;

        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swaping //
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        // printing the array //
        System.out.println("Sorted Array is :: ");
        print(arr);

        // lop for sorting in decending order //

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                // Swaping is Decending Order //

                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

        // Decending Sorted array ::
        System.out.println("Decending Sorted array is :: ");
        print(arr);

    }
    // printing method //
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
