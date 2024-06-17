public class _02_Multi_Dimensional_Array {
    public static void main(String[] args) {
        // creating the multi-dimensional array
        double [][] matrix = {{1,2,3},{4,5,6,7,8}};

        // access the first row & and finding the length
        System.out.println("Length of First Row : " +matrix[0].length);
        System.out.println("Length of second Row : "+ matrix[1].length);


        // Looping through 2D Dimensional array
        int [][] a ={
            {1,2,-3},
            {-4,-5,6,9},
            {7}
        };

        // using for loop
        for(int i=0; i<a.length; i++){
            System.out.println("Length of a = " + a.length + " , i = " +i);
            for(int j=0; j<a[i].length; j++){  //a[1] length is 4
                System.out.println("Length of a[i] = " + a[i].length + " , j = " +j);
                System.out.println(a[i][j]);
            }
        }


    }
}
