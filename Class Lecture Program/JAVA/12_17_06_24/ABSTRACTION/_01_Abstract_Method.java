// Abstract class
abstract class Language {
    // method of abstract class (normal method)
    public void display(){
        System.out.println("This is a Language ");
    }
}

public class _01_Abstract_Method extends Language{
    public static void main(String[] args) {
        // Create obj of _01_Abstract_Method class
        _01_Abstract_Method obj = new _01_Abstract_Method();

        // accessing method of abstract class using obj of _01_Abstract_Method class
        obj.display();
    }
}
