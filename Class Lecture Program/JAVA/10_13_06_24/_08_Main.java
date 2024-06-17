public class _08_Main {
    public static void main(String[] args) {
        // normal String with string class
        String str = "Hello";
        System.out.println(str.concat("World"));
        System.out.println("Original string not modified");
        System.out.println(str);

        // String with stringbuilder class
        StringBuilder str1 = new StringBuilder("Hello");

        str1.append("World");
        System.out.println("Original string modified");
        System.out.println(str1);
    }
}
