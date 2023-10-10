package Recursion.ArraysQuestion;
import java.util.ArrayList;
import java.util.Scanner;
// return an array list of all the duplicates target indexes //
// i.e :-> {1,2,3,4,2,5,2} , target = 2 //
// expected output = [1,4,6]

public class FindAllIndex {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the size of array -> ");
//        int size = scn.nextInt();
//
//        System.out.println("Enter the elements of array -> ");
//        int array[] = new int[size];
//        // enter the array elements //
//        for(int i = 0; i < size; i++) {
//            array[i] = scn.nextInt();
//        }
//        System.out.println("The array elements entered by u is ->");
//        for(int elem : array) {
//            System.out.print(elem +" ");
//        }
//        System.out.println();
//        // enter the target element //
//        System.out.println("Enter the target element ->");
//        int target = scn.nextInt();

        int array[] = {1,2,3,2,4,3,5,6,3};
        int target = 3;

        // function calling //
        // return of an array list // first way //
//        ArrayList<Integer>  answer = findElem(array,target,0,list);
//        System.out.println("The Desired Output is -> " + answer);

        // function calling of 2nd way //
//        find(array, target,0);
//        System.out.println(list);

        // function calling without passing in paramiters //
        System.out.println(findIndexDup(array,target,0));
    }
    // Return an array list //
    // function defination //
    // it's a optimize approach //

    static ArrayList<Integer> findElem(int arr[], int target, int index, ArrayList<Integer> list) {
        // base case condition //
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findElem(arr, target, index + 1, list);
    }

    // second way //
    static ArrayList<Integer> list = new ArrayList<>();
    static int find(int arr[], int target, int index) {
        if (index == arr.length) {
            return index;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return find(arr, target, index+1);
    }

    // Return the list without passing the argument //
    // it's not a very optimize approach //
    static ArrayList<Integer> findIndexDup(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        // base case condition is //
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answers = findIndexDup(arr,target,index+1);
        list.addAll(answers);
        return list;
    }
}
