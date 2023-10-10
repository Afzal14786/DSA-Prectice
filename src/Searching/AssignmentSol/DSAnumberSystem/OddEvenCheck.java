package Searching.AssignmentSol.DSAnumberSystem;

import java.util.Scanner;

/*
         Given a number. Using bit manipulation, check whether it is odd or even
 */
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number and check");
        int num = scn.nextInt();
        System.out.println("The Number entered by u is : " + num);

        System.out.println(evenOdd(num));
    }
//    static boolean evenOdd(int num) {
//        if ((num & 1) == 0) {
//            return true;
//        }
//        return false;
//    }

    static String evenOdd(int num) {
        if (num % 2 ==0) {
            return "even";
        }
        return "odd";
    }
}
