package Recursion.Part_1;

import java.util.Scanner;
// Brute Force Approach //
public class CalculatePowerElement {
    public static void main(String[] args) {
        // Calculate the power of an element //
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num = scn.nextInt();
        System.out.println("Enter the power:: ");
        int power = scn.nextInt();

        int result = calculatePower(num, power);
        System.out.println("The Desired Output is:: " + result);
        scn.close();
    }

    static  int calculatePower(int num, int power) {
        // base case condition //
        if (power == 1) {
            return num;
        }
        // Time Complexity :: O(power) //
        return num * calculatePower(num , (power - 1));
    }
}
