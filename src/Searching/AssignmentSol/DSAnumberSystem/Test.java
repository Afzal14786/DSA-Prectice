package Searching.AssignmentSol.DSAnumberSystem;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp;
        temp = sc.nextLine();
        char[] str1 = temp.toCharArray();
        System.out.println(str1);
        temp = sc.nextLine();
        char[] str2 = temp.toCharArray();
        System.out.println(str2);
        String str3 = "";

        str3 = new String(str1) + new String(str2);

        // Print the concatenated string
        System.out.println("Concatenated String: " + str3);

    }
}
