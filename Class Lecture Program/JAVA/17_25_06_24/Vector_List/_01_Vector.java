import java.util.Iterator;
import java.util.Vector;

public class _01_Vector {
    public static void main(String[] args) {
        // vector list implementation

        // Vector - 1
        // Create Vector List
        Vector<String> mammals = new Vector<>();

        // Using add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // using index add()
        mammals.add(1,"Cat");
        System.out.println("Mammals List : "+mammals);

        // vector -2
        Vector<String> animals = new Vector<>();
        animals.add("Lion");
        animals.add("Tiger");

        // using addAll()

        animals.addAll(mammals);
        System.out.println("Merged List: "+animals);

        // accessing vector element using get()
        String str = animals.get(2);
        System.out.println(str);

        // accessing vector elements using iterator()
        Iterator<String> iterator = animals.iterator();  //this will access all the elements
        System.out.println("Vector : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" , ");
        }

        // Remove vector element
        String removedString = animals.remove(2);
        System.out.println("Removed Element "+ removedString);
        System.out.println("After Removing item from 2nd index : "+animals);

        // removeAll()
        // animals.removeAll(animals);
        // System.out.println(animals);

        //       or

        // clear() - remove all item
        animals.clear();
        System.out.println(removedString);
        System.out.println(animals);
    }
}
