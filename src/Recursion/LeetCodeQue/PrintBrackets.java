package Recursion.LeetCodeQue;

public class PrintBrackets {
    public static void main(String[] args) {
        int n = 2;
        validParentheses(n,0,0,"");
    }
    // function defination //
    static void validParentheses(int n, int openCount, int closeCount, String ans) {
        // base case condition //
        if (openCount == n && closeCount == n) {
            System.out.println(ans);
            return;
        }
        if (openCount < n) {
            validParentheses(n, openCount + 1, closeCount, ans + "(*");
        }
        if (closeCount < openCount) {
            validParentheses(n, openCount, closeCount + 1, ans+ ")");
        }
    }
}
