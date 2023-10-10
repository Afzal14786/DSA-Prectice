package Recursion.Part_1;
import java.util.Scanner;

// Fibonachi Number //
// Fectorial Finding //

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :: ");
        int number = scn.nextInt();

        int result = FactorialNum(number);
        System.out.println("Factorial of a given number is :: " + result);
        scn.close();
    }
    static int FactorialNum(int n) {
        // base case condition //
        if (n <= 1) {           // Time Complexity :: O(n) // Space Complexity :: O(1) //
            return 1;
        }
        return n * FactorialNum(n-1);
    }

}
