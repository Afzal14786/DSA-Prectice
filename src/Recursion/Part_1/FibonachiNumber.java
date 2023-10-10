package Recursion.Part_1;

import java.util.Scanner;

public class FibonachiNumber {
    public static void main(String[] args) {
        // Fibonachi Number //
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number in fibonachi series:: ");
        int number = scn.nextInt();
        // Function Calling //
        int result = FibonachiNumber(number);
        System.out.println("The Fibonachi Number is :: " + result);
        scn.close();
    }
    // Function Defination //
    static int FibonachiNumber(int n) {
        // Base-case Condition //
        if (n <= 1) {
            return n;
        }
        // Time Complexity :: O(2^n) { It's a exponantional Time Complexity } //
        // Space Complexity :: O(n) //
        return FibonachiNumber(n - 1) + FibonachiNumber(n - 2);

    }
}
