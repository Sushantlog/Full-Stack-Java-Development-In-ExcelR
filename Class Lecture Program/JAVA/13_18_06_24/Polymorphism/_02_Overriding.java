class Language{
    // Superclass
    public void displayInfo(){
        System.out.println("Common English Language");
    }
}

class Java extends Language{
    // subclass
    @Override
    public void displayInfo(){
        System.out.println("Java Programming");
    }
}

public class _02_Overriding {
    public static void main(String[] args) {
        // create an obj of java
        Java j1 = new Java();
        j1.displayInfo();

        Language l1 = new Language();
        l1.displayInfo();
    }
}