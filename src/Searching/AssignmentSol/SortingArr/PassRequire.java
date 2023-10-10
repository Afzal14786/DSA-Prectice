package Searching.AssignmentSol.SortingArr;

import java.util.Arrays;
import java.util.Scanner;

/*
     Find out how many pass would be required to sort the array in decreasing order
     using bubble sort.
     int arr[] = {3,5,1,6,0};

 */
public class PassRequire {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        int ans = PassRequire(arr);
        System.out.println(ans +" passes required to sort the entered array in decending order.");
    }

    static int PassRequire(int arr[]) {
        int n = arr.length;
        int passes = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < n - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping //
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    passes++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return passes;
    }
}
