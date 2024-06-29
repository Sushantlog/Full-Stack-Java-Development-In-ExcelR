import java.util.LinkedList;

public class _01_linked{
    public static void main(String[] args) {
        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to linkedlist
        animals.add("Dog");
        animals.add("cat");
        animals.add("Lion");
        animals.add("Tiger");
        System.out.println("Animal List : " +animals);

        // add method with index
        animals.add(1,"Horse");
        System.out.println("Animal after adding at 1st index : "+ animals);

        // accessing list elements
        String str = animals.get(1);
        System.out.println(str);

        // Change (change the value of Particular List item) element in list
        animals.set(2, "Elephant");
        System.out.println("Animals list after modification : "+animals);

        // Remove the element from list 
        String removedString = animals.remove(1);
        System.out.println("Removed str : " + removedString);

        System.out.println("Animals list after remove() : "+animals);

        // Iterating through linkedlist
        for (String animalString : animals) {
            System.out.println(animalString);
        }
    }
}