import java.util.Iterator;
import java.util.LinkedHashSet;

public class _01_main {
    public static void main(String[] args){
        // create set
        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();

        // add()
        evenNumber.add(2);
        evenNumber.add(6);
        evenNumber.add(8);
        evenNumber.add(10);

        System.out.println("EvenNumbers Set : "+evenNumber);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.addAll(evenNumber);
        System.out.println("Numbers : "+numbers);

        // Iterator()
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("LinkedHahsSet using Iterator : ");

        // accessing elements
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" , ");
        }

        // remove elements
        boolean val1 = numbers.remove(5);
        System.out.println("It Element removed? : "+val1);

        boolean val2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? "+val2);

        // Union intersection and subset
        evenNumber.add(4);
        evenNumber.add(8);
        evenNumber.add(12);

        numbers.add(1);
        numbers.add(3);
        numbers.add(4);

        numbers.addAll(evenNumber);
        System.out.println("Union of Sets : "+numbers);

        System.out.println("Numbers : "+numbers);
        System.out.println("Even Numbers : "+evenNumber);

        // Intersection of 2 sets
        numbers.retainAll(evenNumber);
        System.out.println("Intersection of 2 elements : "+numbers);

        boolean result = numbers.containsAll(evenNumber);
        System.out.println("It evenNumbers is subset of Numbers? "+result);

    }
}
