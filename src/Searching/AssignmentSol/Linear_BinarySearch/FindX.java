package Searching.AssignmentSol.Linear_BinarySearch;
import java.util.*;
import java.io.*;

/*
    Q1. Given an array. Find the number X in the array. If the element is present, return the index of the element,
        else print “Element not found in array”. Input the size of array, array from user and the element X from user.
        Use Linear Search to find the element.
 */
public class FindX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :: ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        // Taking input array elements from user //
        System.out.println("Enter the elements of array :: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Array output in console //
        System.out.println("Array entered by you is :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Taking the searching  element from user //
        System.out.print("Enter the element you want to find :: ");
        int X = scn.nextInt();

        // Linear Search Implementation //
        int elem = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == X) {
                elem = i;
                break;
            }
        }
        if (elem != -1) {
            System.out.println("Entered element fount at index no :: " + elem);
        } else {
            System.out.println("Element is not found in array :: ");
        }
    }
}
