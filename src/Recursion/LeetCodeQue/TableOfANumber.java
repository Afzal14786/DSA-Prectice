package Recursion.LeetCodeQue;
import java.util.Scanner;
// Multiple of numbers //
public class TableOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of number -> ");
        int num = scn.nextInt();
        System.out.print("Enter the value of multiple number -> ");
        int k = scn.nextInt();

        multiple(num, k);
    }
    static void multiple(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        multiple(n, k-1);
        System.out.println(n*k);
    }
}
