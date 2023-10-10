package Searching.Binary_Search.NumberSystem.BitOperation;

import java.util.Scanner;

public class Bit_1 {
    public static void main(String[] args) {
        /*
        * Get Bit *

        int n = 5;
        int position = 2;
        int bitMask = 1<<position;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit Was One");
        }
         */

        /*
            * Set Bit *
            int n = 5;
            int pos = 1;
            int bitMs = 1<<pos;

            int newNum = bitMs | n;
            System.out.println(newNum);
         */

        /*
            Clear Bit

            int n = 5;
            int pos = 2;
            int bitMs = 1<<pos;
            int notBitMS = ~(bitMs);

            int newNumber = notBitMS & n;
            System.out.println(newNumber);
         */

        /*
            // Update Bit //
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the operation :: ");
        int operation = scn.nextInt();
        int n = 5;
        int pos = 1;
        int bitMS = 1 << pos;

        if (operation == 1) {
            int newNum = bitMS | n;
            System.out.println(newNum);
        } else {
            int notBitMS = ~(bitMS);
            int newnum = notBitMS & n;
            System.out.println(newnum);
        }

    }
}
