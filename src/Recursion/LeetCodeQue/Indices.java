package Recursion.LeetCodeQue;

public class Indices {
    public static void main(String[] args) {
        System.out.println("The Paths are -> ");
        Indices(0,5,"");
    }
    public static void Indices(int currDist, int Destination, String path) {
        if (currDist > Destination) {
            return;
        }
        if (currDist == Destination) {
            System.out.println(path);
            return;
        }
        // base condition //
        Indices(currDist + 1, Destination, path + 1);
        Indices(currDist + 2, Destination, path + 2);
        Indices(currDist + 3, Destination, path + 3);
        Indices(currDist + 4, Destination, path + 4);
        Indices(currDist + 5, Destination, path + 5);
        Indices(currDist + 6, Destination, path + 6);
    }
}
