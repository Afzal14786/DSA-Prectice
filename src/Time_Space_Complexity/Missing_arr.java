package Time_Space_Complexity;

public class Missing_arr {
    public static void main(String[] args) {
        // Find missing number in an array //
        int ar[] = {1,2,4,5,6,7};
        // Expected output : 3 //
        int n=ar.length;
        int missing_element =0;
        int sum =0;
        // Step :1 
        int sum_of_all_natural_number = ((n+1)*(n+2))/2;
        // step : 2
        for(int i=0; i<n; i++){
            sum += ar[i];
        }
        // step : 3
        missing_element = sum_of_all_natural_number - sum;
        System.out.println(missing_element +", ");

        // Find the missing element is given array //
        int array[] = {1,3,4,5,6,7,9,8,11,10};
        // Expected output : 2
        int length = array.length;
        int sum1=0;
        int missing_elem =0;
        // step : 1
        int total_elem_sum = (length+1)*(length+2)/2;

        // step : 2
        for(int i=0; i<length; i++){
            sum1 += array[i];
        }
        // step : 3
        missing_elem = total_elem_sum - sum1;
        System.out.println(missing_elem);
        
        // Time Complexity of this particular problem is : O(n)
        // Space Complexity of this particular problem is : O(1)
    }
}
