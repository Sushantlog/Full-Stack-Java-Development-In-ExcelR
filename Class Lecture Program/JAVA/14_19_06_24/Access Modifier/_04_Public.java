class Animal{
    public int legCount;

    public void display(){
        System.out.println("I am an Animal");
        System.out.println("I have "+ legCount + " legs");
    }
}

public class _04_Public {
    public static void main(String[] args) {
        Animal a = new Animal();

        // access public variable
        a.legCount = 4;

        // access method
        a.display();
    }
}
