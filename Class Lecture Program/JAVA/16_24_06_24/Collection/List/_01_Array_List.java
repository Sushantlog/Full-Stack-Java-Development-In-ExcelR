import java.util.List;
import java.util.ArrayList;

public class _01_Array_List {
    public static void main(String[] args) {
        // Creating List with ArrayList Class
        List<Integer> numbers = new ArrayList<>();

        // add element to the list
        // listName.add()
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("List : "+numbers);

        // access element from the list
        int number = numbers.get(1);
        System.out.println("Accessing 1st index element : "+number);

        // Remove the element from the list
        int removeNumber = numbers.remove(2);
        System.out.println("Remove element : "+ removeNumber);
    }
}
