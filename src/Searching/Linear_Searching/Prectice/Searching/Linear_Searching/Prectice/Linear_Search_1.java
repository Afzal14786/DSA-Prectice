package Searching.Linear_Searching.Prectice;

import java.util.*;

public class Linear_Search_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of elements in array :");
        int n = scn.nextInt();

        System.out.println("Enter the element of array");
        int arr[] = new int[n];

        // input array from user //
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        // Searching element //
        System.out.println("Element u want to find");
        int x = scn.nextInt();
        // Searching Implimantation //
        int idx = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("@ error :( " +"Element is not found in the inputed array :)");
        }else {
            System.out.println("Element u want to find, found at index no :) "+ idx);
        }
    }
}
