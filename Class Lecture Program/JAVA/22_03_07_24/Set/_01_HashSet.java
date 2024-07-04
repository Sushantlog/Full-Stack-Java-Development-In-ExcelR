import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSet {
    public static void main(String[] args) {
        //HashSet with default capacity and load factor
        HashSet<Integer> numberSet = new HashSet<>();

        //Insert element to hashSet
        numberSet.add(2);
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(2);
        System.out.println("Number Set : "+numberSet);

        HashSet<Integer> number = new HashSet<>();

        number.addAll(numberSet);
        System.out.println("Number Set (2) : "+number);

        // Access HashSet Element - Iterator()
        Iterator<Integer> iterator = number.iterator();
        System.out.println("HashSet Using Iterator : ");
        // accessing element
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" , ");
        }

        // Remove element 
        boolean val = number.remove(5);
        System.out.println("It 5 removed? "+val);

        boolean val2 = number.removeAll(number);
        System.out.println("Are all element removed? "+val2);

        System.out.println("Number : "+number);

        // In
    }
}
