public class _01_ArrayInJava {
    public static void main(String[] args) {
        // declaration of array
        // int[] intArray = {1,2,3,4,5};

        double[] data = new double[5];

        // Inserting element into array
        data[0] = 2.5;
        data[1] = 5.6;
        data[2] = 10.2;
        data[3] = 5.6;
        data[4] = 6.5;

        System.out.println(data[0]); //2.5
        System.out.println(data[2]); //10.2

        // for(int i=0; i<data.length;i++){
        //     System.out.println(data[i]);  //access the array
        // }

        // Access using the for each loop
        for (double i : data) {
            System.out.println(i);
        }
    }
}
