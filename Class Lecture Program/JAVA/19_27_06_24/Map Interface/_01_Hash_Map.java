import java.util.HashMap;

public class _01_Hash_Map {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String,Integer> languages = new HashMap<>();

        // add element to hashmap
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 4);

        System.out.println("HashMap of Languages : "+languages);

        // get() method to access values 
        int value = languages.get("Java");
        System.out.println(value);

        // String str = languages.get(4);  //show error
        // System.out.println(str);

        // using keySet() access the kay
        System.out.println("Key : "+languages.keySet());

        // using values() accessing the values
        System.out.println("Values : " +languages.values());

        // accessing together 
        // using entrySet()
        System.out.println("Key/Value mapping : "+languages.entrySet());

        // changing hashmap value - replace()
        languages.replace("JavaScript", 10);
        // name of the Map is Languages
        System.out.println("language (HashMap) after replace() : "+languages);

        // changing value for all - replaceAll()
        HashMap<Integer,String> languages1 = new HashMap<>();

        languages1.put(101, "C");
        languages1.put(102,"C++");
        languages1.put(103, "Python");
        languages1.put(104, "C#");
        languages1.put(105, "Java");
        System.out.println("Languages Map : "+languages1);

        // changing value for all - replaceAll()

        languages1.replaceAll((key,val)->val.toUpperCase());
        System.out.println("Update Map : "+ languages1);

        // remove Hashmap elements
        String element = languages1.remove(102);
        System.out.println("Removed Elements : "+element);

        System.out.println("After Remove() : "+languages1);
    }
}
