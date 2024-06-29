
public class _16_String_Buffer {
    public static void main(String[] args) {
        // Crating a new string with string buffer class

        // In StringBuffer class original String will change 
        StringBuffer str = new StringBuffer("Hello");
        System.out.println(str);

        str.append("World");
        System.out.println("String after modification (Original string changed)");
        System.out.println(str);

        // In concat original string is not change
        String str1 = "Hello";
        System.out.println(str1.concat("World"));

        System.out.println("String after modification (Original string not changed)");
        System.out.println(str1);
        System.out.println(str);
    }
}
