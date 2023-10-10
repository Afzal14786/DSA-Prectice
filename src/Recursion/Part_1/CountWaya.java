package Recursion.Part_1;

import java.util.*;

// Count Ways //
public class CountWaya {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of stairs:: ");
        int num = scn.nextInt();

        // Function calling //
        int result = CountWaya(num + 1);
        System.out.println("The number of ways:: " + result);
    }
    // function definantion //
    static int CountWaya(int n) {
        // base case condition //
        if (n <= 1) {
            return n;
        }
        return CountWaya(n - 1) + CountWaya(n - 2);
    }
}
