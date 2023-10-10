package Time_Space_Complexity;

public class palindrome {
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,2,1};
        int n = arr.length;
        int flag =0;
        for(int i=0; i<n/2; i++){
            if(arr[i] != arr[n-i-1]){
                flag=1;
                System.out.println("It's not a palindrome !!");
            }
        }
        if(flag==0){
            System.out.println("Its a palindrome !!");
        }

        // Time Complexity of this particular problem is : O(n)
        // Space Complexity of this particular problem is : O(1)
    }
}
