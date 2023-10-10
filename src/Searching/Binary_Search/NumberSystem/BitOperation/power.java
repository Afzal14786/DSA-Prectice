package Searching.Binary_Search.NumberSystem.BitOperation;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base number :: ");
        int base = scn.nextInt();
        System.out.print("Enter the value of power :: ");
        int power = scn.nextInt();
        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println("Answer is :: " + ans);


    }
}
