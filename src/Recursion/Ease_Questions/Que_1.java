package Recursion.Ease_Questions;

public class Que_1 {
    public static void main(String[] args) {
        // Question :: 1
        // Print number from 15 to 1 //

        // function calling //
//        count(5);
//        count1(5);
        count2(5);
    }
    // Assending Order //
    static void count(int num) {
        if (num == 0) {
            return;
        }
        count(num - 1);
        System.out.print(num +" ");
    }

    static void count1(int num) {
        // decending order //
        if (num == 0) {
            return;
        }
        System.out.print(num +" ");
        count1(--num);
    }
// Both in assending or decending order //
    static void count2(int num) {
        // decending order //
        if (num == 0) {
            return;
        }
        System.out.print(num +",");
        count2(num - 1);
        System.out.print(num +",");
    }
}
