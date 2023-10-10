package Searching.Binary_Search.NumberSystem.BitOperation;
import java.util.*;
public class NoOfDegits {
    public static void main(String[] args) {
        // Time Complexity :: O(logN)...
        int n = 34567;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
