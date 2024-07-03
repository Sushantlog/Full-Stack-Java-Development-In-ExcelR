import java.util.TreeMap;

public class _01_Treemap {
    public static void main(String[] args) {
        // create TreeMap of even numbers
        TreeMap<String,Integer> evenNumber = new TreeMap<>();

        // using put()
        evenNumber.put("Two", 2);
        evenNumber.put("Four", 4);
        evenNumber.put("Six",6);
        System.out.println("Even Number Map : "+evenNumber);

        // using putIfAbsent()
        // key is unique 
        // evenNumber.putIfAbsent("Ten",10);
        evenNumber.putIfAbsent("Ten", 4);
        System.out.println("Map after putIfAbsent() : "+evenNumber);

        // crate TreeMap of Number
        TreeMap<String,Integer> Number = new TreeMap<>();
        Number.put("One",1);

        // using putAll()
        Number.putAll(evenNumber);
        System.out.println(Number);

        // =================================

        TreeMap<Integer,String> WholeNumber = new TreeMap<>();
        WholeNumber.put(2, "Two");
        WholeNumber.put(4, "Four");
        WholeNumber.put(6, "Six");
        WholeNumber.put(1, "One");

        // Access TreeMap Elements - entrySet(), keySet(), values()
        System.out.println("Using EntrySet() : "+WholeNumber.entrySet());

        System.out.println("Key of EvenNumber Map : "+WholeNumber.keySet());

        System.out.println("Values of EvenNumber Map :"+ WholeNumber.values());

        // using get() and getOrDefault()
        String val = WholeNumber.get(4);
        System.out.println("Value of 4 : "+val);

        String val2 = WholeNumber.getOrDefault(5, "Five");
        System.out.println(val2);
        System.out.println(WholeNumber);

        // Remove(key) & remove(key,value)
        String str = WholeNumber.remove(2);
        System.out.println("Removed Element : "+str);
        System.out.println("Map after remove() : "+WholeNumber);

        // remove with 2 parameter 
        boolean result = WholeNumber.remove(6, "Six");
        System.out.println("Removed element is "+result);
        System.out.println("Map after remove() : "+WholeNumber);

        boolean result1 = WholeNumber.remove(5, "Five");
        System.out.println("Removed element is "+result1);

        // Replace TreeMap element - 2 parameter
        WholeNumber.replace(1, "Ten");
        System.out.println("After Replace : "+WholeNumber);

        // replace with 3 parameter
        WholeNumber.replace(4, "Four", "Forty Four");
        
        // using replaceAll 
        WholeNumber.replaceAll((key,oldvalue)-> oldvalue + " Hundred");
        System.out.println("After replaceAll() : "+WholeNumber);

        // Method for Navigation 
        int firstKey = WholeNumber.firstKey();
        System.out.println("First Key of WholeNumber : "+firstKey);

        System.out.println("First Entry : "+WholeNumber.firstEntry());

        int lastKey = WholeNumber.lastKey();
        System.out.println("Last Key : "+lastKey);

        System.out.println("Last Entry : "+WholeNumber.lastEntry());

        // pollFirstEntry() and pollLastEntry()
        System.out.println("PollFirstEntry() : "+WholeNumber.pollFirstEntry());

        System.out.println("pollLastEntry() : "+WholeNumber.pollLastEntry());

        System.out.println("After poll method : "+WholeNumber);

        WholeNumber.put(4,"Four");
        WholeNumber.put(10,"Ten");
        WholeNumber.put(12,"Twelve");
        WholeNumber.put(16,"Sixteen");

        // Using higher()
        System.out.println("Using higher() : "+WholeNumber.higherKey(4));

        System.out.println("Using higherEntry() : "+WholeNumber.higherEntry(10));

        // Using lower()
        System.out.println("Using Lower() : "+WholeNumber.lowerKey(12));

        System.out.println("using lowerEntry() : "+WholeNumber.lowerEntry(12));

        // HeadMap(),TailMap() and SubMap() - part of the map

        // using headMap() - without boolean value
        System.out.println("Without boolean value : "+WholeNumber.headMap(12));

        // using headMap() - with boolean value
        System.out.println("With boolean Value : "+WholeNumber.headMap(12, true));

        // tailMap()
        System.out.println("Using tailMap() without boolean value : "+WholeNumber.tailMap(10));

        System.out.println("Using tailMap() with boolean value :"+WholeNumber.tailMap(10, false));
    }
}