package Recursion.Part_1;

import java.util.Scanner;
import java.util.Spliterator;

// Calculate the power of an number //
// i.e :: 2^4 = 16; //
// Optimize approach //
public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number:: ");
        int num = scn.nextInt();
        System.out.println("Enter The Power:: ");
        int power = scn.nextInt();
        // Function Calling //
        long result = CalculatePowerFind(num, power);
        System.out.println("The Derived Answer is:: " + result);

        scn.close();
    }
    // Function Defination //
    static int CalculatePowerFind(int a, int b) {
        int result = 0, mid = 0, finalresult = 0;
        // base-case condition //
        if (b == 1) {
            return a;
        } else {
            mid = b / 2;
            result = CalculatePowerFind(a, mid);
            finalresult = result * result;

            if (b % 2 == 0) {
                return finalresult;
            } else {
                return a * finalresult;
            }
        }
    }
}
