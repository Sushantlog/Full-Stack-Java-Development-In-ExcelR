public class _07_Substring {
    public static void main(String[] args) {
        String str = "Hello World";

        // Extract substring from index 0 to 3 (but will take number before 3 => 012 in case of 4 = 0123 characters)
        System.out.println(str.substring(0,3));
    }
}
