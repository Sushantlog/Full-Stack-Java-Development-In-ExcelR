public class _15_StratsWith_EndsWith {
    public static void main(String[] args) {
        String str = "Javascript";

        // check str is starting with Java
        System.out.println(str.startsWith("Java"));
        
        // check str is ending with script 
        System.out.println(str.endsWith("script"));

        System.out.println(str.endsWith("scri"));
    }
}
