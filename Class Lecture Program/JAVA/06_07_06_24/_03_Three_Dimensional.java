public class _03_Three_Dimensional {
    public static void main(String[] args) {
        // main array
        int [][][] array ={
            // SubArray (array 2d)
            {  
                // Another array (array 1d)
                {1,2,-3},
                {2,3,5}
            },
            // SubArray (array 2d)
            {
                // Another subArray (array 1d)
                {4,6,8,9},
                {2,3,10,3},
                {2,3}
            },   
        };

        // Looping through array and printing it

        for(int[][] array2D:array){
            for(int[] array1D:array2D){
                for(int item : array1D){
                    System.out.print(" "+ item);
                }
                System.out.println();
            }
            System.err.println();
        }
    }
}
