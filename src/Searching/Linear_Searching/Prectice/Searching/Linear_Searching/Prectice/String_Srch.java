package Searching.Linear_Searching.Prectice.Searching.Linear_Searching.Prectice;

import java.util.Arrays;

public class String_Srch {
    public static void main(String[] args) {
        String name = "Afzal";
        char target = 'M';
        String name1 = "Ansari";
        char target1 = 'A';
        System.out.println(search(name, target));
        System.out.println(search1(name1,target1));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name1.toCharArray()));
    }
    public static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // for each loop //

    public static boolean search1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
