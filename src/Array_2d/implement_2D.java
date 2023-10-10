package Array_2d;

public class implement_2D {
    public static void main(String[] args) {
        int array[][] = new int[3][4];   // 1st way of implemantation
        int matrix[][] =            // 2nd way of implemantation
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }
}
