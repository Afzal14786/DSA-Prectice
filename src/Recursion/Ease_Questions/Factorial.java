package Recursion.Ease_Questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Get the factorial of a number //
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number which u want to get factorial:: ");
        int num = scn.nextInt();
        long result = factorial(num);
        System.out.println("Factorial of the given number is -> " + result);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
