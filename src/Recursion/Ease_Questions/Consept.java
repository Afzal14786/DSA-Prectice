package Recursion.Ease_Questions;

public class Consept {
    public static void main(String[] args) {
        function(10);
    }

    static void function(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        function(--num);
    }
        // (--num) v/s (num--)

    /*
        (--num) :-> It's pre-decrement. It will decrement/subtract first and then pass the number //
        (num--) :- Post-decrement. It will pass the number first then decrement/subtract //
     */
}
