public class _01_pattern {
    // function to print pattern
    public static void printPatter(int n) {
        // outer loop - rows
        for(int i=0; i<n; i++){
            // inner loop - cols
            for(int j=0; j<n; j++){
                // Star will print only when it is in the first row or first colum or last row

                it(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }else{
                    // otherwise print space 
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPatter(n);
    }
}