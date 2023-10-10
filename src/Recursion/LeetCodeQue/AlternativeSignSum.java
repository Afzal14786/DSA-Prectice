package Recursion.LeetCodeQue;

public class AlternativeSignSum {
    public static void main(String[] args) {
        System.out.println(alternativeSignSum(11));
    }

    static  int alternativeSignSum(int n) {
        // base case condition //
        if (n == 0) {
            return 0;
        }
        else {
            if (n % 2 == 0) {
                return alternativeSignSum(n - 1)-n;
            }
            else {
                return alternativeSignSum(n-1) + n;
            }
        }
    }
}
