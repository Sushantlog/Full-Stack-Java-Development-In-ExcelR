import java.util.PriorityQueue;

public class _02_Priority_Queue {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        //using add()
        numbers.add(20);
        numbers.add(10);

        System.out.println("Priority Queue : " + numbers);

        // accessing element from head 
        int num = numbers.peek();
        System.out.println(num);

        // removing element from head - remove
        boolean result1 = numbers.remove(20);
        System.out.println("Is the element 20 is removed : "+result1);
        System.out.println("After removing queue is : "+numbers);

        // using poll()
        int num1 = numbers.poll();
        System.out.println("Removed Element : "+num1);

        System.out.println(numbers);

        // return null
        int num2 = numbers.poll();
        System.out.println("Poll() on empty queue : "+num2);

        // return Exception
        int num3 = numbers.remove();
        System.out.println("Remove() from empty queue : "+num3);

    }
}
