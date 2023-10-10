package Searching.Binary_Search.Prectice_Questions.Interview_Questions;
 // Square Root problem //
// time complexity : O(logN)
// space complexity : O(1)

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of which u want the square root ::");
        int root = scn.nextInt();

        int ans = SquareRoot(root);
        System.out.println("The Square root is :: " + ans);
    }
    // function defination //
    static int SquareRoot(int num) {
        int start = 0, end = num, result = 0;
        // modified binary search //
        while (start <= end) {
            // Step : 1 calculate the mid //
            int mid = start + (end - start) / 2;
            long value = mid * mid;

            if (value == num) {
                return mid;
            } else if (value < num) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
