package Searching.Binary_Search.NumberSystem.BitOperation;

import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number and check");
        int num = scn.nextInt();
        System.out.println("The Number entered by u is : " + num);
        boolean ans = (num & (num - 1)) == 0;
        if (num == 0) {
            System.out.println("Its not a power of 2 :: " + ans);
        } else {
            System.out.println("Ansawer is :: " + ans);
        }
    }
}
