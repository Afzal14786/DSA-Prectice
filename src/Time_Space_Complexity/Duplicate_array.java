package Time_Space_Complexity;

// Find out the duplicates in the given array
// Array[] = {1,3,3,5,2,5,6}
// expected Output : 3,5

public class Duplicate_array {
    public static void main(String[] args) {
        int array[] = {1,3,3,5,2,5,2,6};
        int n = array.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){         // time complexity O(n^2)
                if(array[i] == array[j]){
                    System.out.println("Duplicate Element are :" + array[i] +", ");
                }
            }
        }

        /*
            * Time Complexity = O(n^2)
            * Space Complexity = O(1)
         */
    }
}
