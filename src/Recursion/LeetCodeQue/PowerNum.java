package Recursion.LeetCodeQue;
import java.util.*;
import java.math.*;

public class PowerNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number-> ");
        BigInteger num = scn.nextBigInteger();
        System.out.println("Enter The Power-> ");
        int power = scn.nextInt();
        // Function Calling //
        BigInteger result = CalculatePowerFind(num, power);
        System.out.println("The Derived Answer is-> " + result);
        scn.close();
    }
    // function defination //
    static BigInteger CalculatePowerFind(BigInteger num, int power) {
        BigInteger result, finalResult;
        // base case condition //
        if (power == 1) {
            return num;
        } else {
            result = CalculatePowerFind(num, power/2);
            finalResult = result.multiply(result);
            if (power % 2 == 0) {
                return finalResult;
            } else {
                return num.multiply(finalResult);
            }
        }
    }
}
