package Searching.AssignmentSol.DSAnumberSystem;
/*
    given a number, print its binary representation.
 */
import java.util.Scanner;

public class ConvertBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number which you want to conver into binary ::");
        int num = scn.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Number Entered by u :: " + num);
        System.out.println("Binary Value of entered number is :: " + binary);
    }
}
