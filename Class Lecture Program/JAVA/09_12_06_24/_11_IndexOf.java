public class _11_IndexOf {
    public static void main(String[] args) {
        String str = "Hello World";
        int result;
        int result1;

        // get the index of particular char - 1
        result = str.indexOf('l');
        result1 = str.indexOf('i');
        System.out.println(result);
        System.out.println(result1);  //not present
    }
}
