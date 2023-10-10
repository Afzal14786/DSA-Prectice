package Recursion.Ease_Questions;

import java.util.Scanner;

public class SumFactorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num = scn.nextInt();

        // Function Calling //
        int result = SumFactorial(num);
        System.out.println("The Desired Answer is:-> " + result);
    }
    // Function Definition //

    static int SumFactorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num + SumFactorial(num - 1);
    }
}
