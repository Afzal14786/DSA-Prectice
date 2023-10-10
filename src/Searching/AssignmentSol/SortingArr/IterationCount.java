package Searching.AssignmentSol.SortingArr;
import java.util.Scanner;
/*
     Find out the number of iterations to sort the array in descending order using selection sort.

 */
public class IterationCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int size = scn.nextInt();

        // Enter the elements in array //
        System.out.println("Enter the elements :: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // PRINTIING OF ARRAY ELEMENTS //
        System.out.println("Array element's entered by you !!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        int ans = IterationCount(arr);
        System.out.println(ans +" Iteration is required to sort the array in decending order.");
    }

    static int IterationCount(int arr[]) {
        int n = arr.length;
        int count = 0;
        boolean swap = false;
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] < arr[j]) {
                    // swaping //
                    arr[smallest] = arr[smallest] ^ arr[i];
                    arr[i] = arr[smallest] ^ arr[i];
                    arr[smallest] = arr[smallest] ^ arr[i];
                    count++;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return count;
    }
}
