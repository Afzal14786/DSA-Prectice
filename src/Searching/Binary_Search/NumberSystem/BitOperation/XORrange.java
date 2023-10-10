package Searching.Binary_Search.NumberSystem.BitOperation;

public class XORrange {
    public static void main(String[] args) {
        int a = 0;
        int b = 6;
        int ans = XOR(b) ^ XOR(a - 1);
        System.out.println(ans);


        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }
    static  int XOR(int num) {
        if (num % 4 == 0) {
            return num;
        }
        if (num % 4 == 1) {
            return 1;
        }
        if (num % 4 == 2) {
            return num + 1;
        } return  0;
    }
}
