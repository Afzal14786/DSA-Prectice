package Recursion.Patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        triangle2(4,0);
    }

    // triangle //
    static void triangle(int row, int cols) {
        if (row ==0) {
            return;
        }
        if (cols < row) {
            System.out.print("*" +" ");
            triangle(row, cols + 1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    static void triangle2(int row, int cols) {
        if (row ==0) {
            return;
        }
        if (cols < row) {
            triangle2(row, cols + 1);
            System.out.print("* ");
        } else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}
