package Recursion.Ease_Questions;
import java.util.Scanner;

// Multiplication of Digits //
// i.e :-> 55 = 25 // 25 = 10 //
public class ProductOfDigits {
    public static void main(String[] args) {
        // Product of Digits //
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number:->");
        int num = scn.nextInt();

        int result = ProductOfDigits(num);
        System.out.println("The Product of numbers is:-> " + result);
        scn.close();
    }
    static  int ProductOfDigits(int num) {
        if (num % 10 == num) {
            return num;
        }
        return (num % 10) * ProductOfDigits(num / 10);
    }
}
