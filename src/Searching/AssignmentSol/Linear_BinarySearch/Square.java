package Searching.AssignmentSol.Linear_BinarySearch;
import java.util.Scanner;

/*
        Question ::
         Given a positive integer num, return true if num is a perfect square or false otherwise.
         A perfect square is an integer that is the square of an integer. In other words,it is the product of some integer
         with itself.
 */
public class Square {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :: ");
        int num = scn.nextInt();
        System.out.println("Entered number is a perfect square root :: " + isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 0;
        long end =  num / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long value = mid * mid;
            if (value > num) {
                end = mid - 1;
            } else if (value < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
