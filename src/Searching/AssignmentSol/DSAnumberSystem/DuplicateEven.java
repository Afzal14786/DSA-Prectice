package Searching.AssignmentSol.DSAnumberSystem;
/*
     Given an integer array, duplicates are present in it in a way that all duplicates appear an even
     number of times except one which appears an odd number of times. Find that odd appearing
     element in linear time and without using any extra memory.
 */
public class DuplicateEven {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int odd = 0;
        for (int temp : arr) {
            odd ^= temp;
        }
        System.out.println("The odd occurring element is :: " + odd);

//        int even = 0;
//        for (int i : arr) {
//            if (i % 4 == 0) {
//                even++;
//            }
//        }
//        System.out.println("Total No Of Even Numbers in Array :: ");
    }
}
