public class _09_Main {
    public static void main(String[] args) {
        String str = "   hello world   ";

        System.out.println(str.trim());

        String str1 = "Hello World";
        String str2 = "Hello World";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
