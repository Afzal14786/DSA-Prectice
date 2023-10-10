package Time_Space_Complexity;

public class Complexity {

    public static int function(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n + function(n-1);
        }
    }
    public static void main(String[] args) {
        // Q 1. Write the sum of 1 to 100 //
        // Solution Approach :-1
        // int sum =0;
        int n = 8;
        System.out.println(function(n));
        
//        for(int i=1; i<=n; i++){
//            sum += i;     // Time Complexity of this particular problem is - O(n)
//        }
//        System.out.println(sum);


        //Solution Approach 2
         //Time Complexity of this particular problem is - O(1), constant
        // sum = n*(n+1)/2;  
        // System.out.println(sum);

    }
}
