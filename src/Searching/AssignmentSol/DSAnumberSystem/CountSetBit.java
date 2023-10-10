package Searching.AssignmentSol.DSAnumberSystem;

import java.util.Arrays;
import java.util.Scanner;

/*
    Given a number, count the number of set bits in that number without using an extra space.
    Note : bit ‘1’ is also known as set bit.
 */
public class CountSetBit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();

        // convert the number to binary //
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary represent of your entered number is :: " + binary);

        // count //
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        System.out.println("No of bits present in the number is :: " + count);
    }
}
