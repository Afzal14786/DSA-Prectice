package Time_Space_Complexity;

public class Missing_arr1 {
    public static void main(String[] args) {
        int arr[] = {6,1,2,8,3,4,7,10,5};
        int n = arr.length;
        int sum = 0;
        int missing_element = 0;

        // step 1 :

        int sum_of_all_natural_number = ((n+1)*(n+2))/2;
        //step 2 :
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        // step : 3
        missing_element = sum_of_all_natural_number - sum;
        System.out.println("Missing No is: "+ missing_element);

    }

}
