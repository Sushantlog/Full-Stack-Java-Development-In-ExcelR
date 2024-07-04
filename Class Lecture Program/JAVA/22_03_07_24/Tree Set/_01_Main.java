import java.util.TreeSet;
import java.util.Iterator;

public class _01_Main {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumber = new TreeSet<>();

        // add 
        evenNumber.add(2);
        evenNumber.add(8);
        evenNumber.add(6);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(evenNumber);
        System.out.println("New TreeSet : "+numbers);

        // access element TreeSet
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("TreeSet using Iterator : ");
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }


        // Removed elements
        boolean val1 = numbers.remove(8);
        System.out.println("Is element removed? : "+val1);

        boolean val2 = numbers.removeAll(numbers);
        System.out.println("All Element removed? "+val2);

        // Navigation Method
        System.out.println("Numbers : "+numbers);
        System.out.println("Even Numbers : "+evenNumber);

        int first = evenNumber.first();
        System.out.println("First element of the set is : "+first);

        int last = evenNumber.last();
        System.out.println("Last element of the set is : "+last);

        // Higher() & Lower()
        System.out.println("Higher element from 6 is : "+evenNumber.higher(6));

        System.out.println("Lower element of 6 is : "+evenNumber.lower(6));

        // pollfirst() and polllast()
        System.out.println("Removed First element : "+evenNumber.pollFirst());

        System.out.println("Removed Last element : "+evenNumber.pollLast());

        System.out.println("Remaining elements : "+evenNumber);

        evenNumber.add(2);
        evenNumber.add(8);
        evenNumber.add(4);
        evenNumber.add(10);

        System.out.println("Even Numbers Set : "+evenNumber);

        // headSet() and TailSet() and subset()

        System.out.println("Using HeadSet without boolean value :"+evenNumber.headSet((6)));

        System.out.println("Using HeadSet with boolean value :"+evenNumber.headSet(6, true));

        System.out.println("Using TailSet Without boolean value : "+evenNumber.tailSet(6));

        System.out.println("Using TailSet with boolean value : "+evenNumber.tailSet(5, false));

        System.out.println("Using subset without boolean value : "+evenNumber.subSet(4, 8));

        System.out.println("Using Subset with boolean value : "+evenNumber.subSet(4,true,6,true));
    }
}
