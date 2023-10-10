package Searching.Binary_Search.Prectice_Questions.Interview_Questions;

import java.util.Scanner;

/*
    Selection Sorting Problem //
 */

public class Que_4 {
    public static void main(String[] args) {
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

        // Sorting the elements by Selection Sorting method //
        for (int i = 0; i < arr.length; i++) {  // outer loop runs (n-1) time //
            int smallest = i;
            // inner loop //
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.print("The Sorted Accending Order is :: ");
        print(arr);

        // Sorting in Decending Order Using Selection Sorting Method //

        for (int i = 0; i < arr.length; i++) {  // outer loop runs (n-1) time //
            int gretest = i;
            // inner loop //
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[gretest] < arr[j]) {
                    gretest = j;
                }
            }
            int temp = arr[gretest];
            arr[gretest] = arr[i];
            arr[i] = temp;
        }
        System.out.print("The Sorted Decending Order is :: ");
        print(arr);
    }
    static void print(int matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }
}
