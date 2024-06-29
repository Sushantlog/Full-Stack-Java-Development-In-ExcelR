import java.util.LinkedHashMap;
import java.util.concurrent.Flow.Subscriber;

public class _02_Linked_Hash_Map {
    public static void main(String[] args) {
        // create HashMap
        LinkedHashMap<String,Integer> evenNumberHashMap = new LinkedHashMap<>();

        // add entries to the map
        evenNumberHashMap.put("Two", 2);
        evenNumberHashMap.put("Four", 4);
        evenNumberHashMap.put("Six", 6);

        System.out.println("LinkedHashMap : "+evenNumberHashMap);

        // putAll() - this used to add entire hash table into different one
        LinkedHashMap<String,Integer> numbers = new LinkedHashMap<>();
        numbers.putAll(evenNumberHashMap);
        numbers.put("One",1);

        System.out.println(numbers); 

        // putIfAbsent() - it will add the entry only if the key is not present
        numbers.putIfAbsent("Eight", 8);
        System.out.println(numbers);

        numbers.putIfAbsent("One", 1);
        System.out.println(numbers);

        numbers.putIfAbsent("one", 1);
        System.out.println(numbers);

        // access using entrySet() keySet() and values()
        System.out.println("Entries Of Number Map : "+numbers.entrySet());

        System.out.println("Keys of Numbers Map : "+numbers.keySet());

        System.out.println("Values of Numbers Map : "+numbers.values());

        // get() and getOrDefault()
        int val = numbers.get("Eight");
        System.out.println(val);

        int val1 = numbers.getOrDefault("Ten", 10);
        System.out.println(val1);

        // ====================================================
        // Output =
        // LinkedHashMap : {Two=2, Four=4, Six=6}
        // {Two=2, Four=4, Six=6, One=1}
        // {Two=2, Four=4, Six=6, One=1, Eight=8}
        // {Two=2, Four=4, Six=6, One=1, Eight=8}
        // {Two=2, Four=4, Six=6, One=1, Eight=8, one=1}
        // Entries Of Number Map : [Two=2, Four=4, Six=6, One=1, Eight=8, one=1]
        // Keys of Numbers Map : [Two, Four, Six, One, Eight, one]
        // Values of Numbers Map : [2, 4, 6, 1, 8, 1]
        // 8
        // 10

        // ====================================================


        // Remove Elements from Map
        int ele = numbers.remove("Eight");
        System.out.println("Removed Element : "+ele);

        System.out.println(numbers);

        boolean bool = numbers.remove("one", 1);
        System.out.println(bool);

        boolean bool1 = numbers.remove("Three", 3);
        System.out.println(bool1);

        System.out.println(numbers);
    }
}

