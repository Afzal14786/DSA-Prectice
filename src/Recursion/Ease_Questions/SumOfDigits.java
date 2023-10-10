package Recursion.Ease_Questions;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Example //
        // n = 1234 // Expected Output :-> 1 + 2 + 3 + 4 = 10 //
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num = scn.nextInt();

        int result = SumOfDigits(num);
        System.out.println("The desired output is :-> " + result);
        scn.close();
    }
    // Function Definition //
    static  int SumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + SumOfDigits(n / 10);
    }
}
