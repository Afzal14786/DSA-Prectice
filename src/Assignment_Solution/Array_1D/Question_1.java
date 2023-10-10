package Assignment_Solution.Array_1D;

public class Question_1 {
    public static void main(String[] args) {
        /*
            WRITE A PROGRAM TO PRINT THE SUM OF ALL THE ELEMENNTS ON EVEN
            INDICES IN THE FOLLOWING ARRAY...

            arr[] = {3,20,4,6,9};
            expected output = 16;
         */

         int arr[] = {3,20,4,6,9};
         int sum = 0, i = 0;
        //  for(int ii =0; i<=arr.length; i++){
        //     if(i % 2 == 0){
        //         sum += arr[i];
        //         i += 1;
        //     }
        //  }
        //  System.out.println(sum +" ");

        //     while(i < arr.length){
        //         sum += arr[i];
        //         i +=2;
        //     }
        //  System.out.println(sum +" ");

        /*
            arr[] = {4,3,6,7,1};
         */

         int arr1[] = {4,3,6,7,1,4,6};

        //  int sum = 0;
        //  int i = 0;

         // solution approach : 1 //
        //  while(i < arr1.length){
        //     sum += arr1[i];
        //     i += 2;
        //  }
        //  System.out.println(sum);

         // Solution approach 2 :

         for(int ii=0; i<=arr1.length; i++){
            if(i % 2 == 0){
                sum += arr1[i];
                i += 1;
            }
         }
         System.out.println(sum);
    }
}
