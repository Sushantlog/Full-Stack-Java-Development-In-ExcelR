package Constructor;
// Normal normal constructor
class _01_Constructor {
    private String name;

    // defining constructor
    _01_Constructor(){
        System.out.println("Constructor Called");
        name = "ExcelR";
    }

    public static void main(String[] args) {
        // creating the object of _01_Constructor class
        _01_Constructor obj = new _01_Constructor();
        System.out.println("The Name is : " + obj.name);

    }
}
