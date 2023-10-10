package Recursion.Ease_Questions;

public class ReverseNum {
    public static void main(String[] args) {
        ReverseDegit(1234);
        System.out.println(sum);
    }
    static int sum = 0;
    // Method 1 //
    static void ReverseDegit(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        ReverseDegit(n / 10);
    }
}
