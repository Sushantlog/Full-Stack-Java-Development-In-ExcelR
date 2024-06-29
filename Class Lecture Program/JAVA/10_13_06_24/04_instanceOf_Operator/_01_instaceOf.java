public class _01_instaceOf {
    public static void main(String[] args) {
        //create a variable of string type
        String name = "ExcelR";

        // check if name is instance of string class
        boolean result = name instanceof String;
        System.out.println(result);

        // create obj of the class
        _01_instaceOf obj = new _01_instaceOf();

        // check object is instance of example class
        boolean result2 = obj instanceof _01_instaceOf;
        System.out.println(result2);
    }
}
