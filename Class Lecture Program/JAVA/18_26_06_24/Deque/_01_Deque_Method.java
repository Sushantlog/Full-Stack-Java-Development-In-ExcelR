import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.LinkedList;

public class _01_Deque_Method {
    public static void main(String[] args) {
        // Array Implementation of Deque
        Deque<String> animal1 = new ArrayDeque<>();

        // linked list implementation of deque
        // Deque<String> animal2 = new LinkedList<>();

        // add element to deque 
        animal1.offer("Dog");
        animal1.offerFirst("Cat");
        animal1.offerLast("Lion");
        animal1.offerFirst("Tiger");

        System.out.println("Deque : "+ animal1);

        // access element from deque
        String firstElement = animal1.peekFirst();
        System.out.println("First Element : "+firstElement);

        String lastElement = animal1.peekLast();
        System.out.println("Last Element : "+lastElement);

        // Remove Element from both ends
        String removedStr = animal1.pollFirst();
        System.out.println(removedStr);

        String removedString1 = animal1.pollLast();
        System.out.println(removedString1);

        System.out.println(animal1);
    }
}
