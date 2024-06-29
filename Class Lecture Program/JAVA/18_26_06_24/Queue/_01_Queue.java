import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _01_Queue {
    public static void main(String[] args) {
        // creating Queue using LinkedList
        // Queue with LinkedList class
        Queue<Integer> numbIntegers = new LinkedList<>();

        // create Queue using ArrayDeque
        Queue<String> Animals = new ArrayDeque<>();

        // Priority Queue
        Queue<Integer> nums = new PriorityQueue<>();

        //offer element to the queue 
        numbIntegers.offer(10);
        numbIntegers.offer(20);
        numbIntegers.offer(30);
        System.out.println("Number Queue : " + numbIntegers);

        // access element of queue
        int accessNum = numbIntegers.peek();
        System.out.println("Access Number : " + accessNum);

        // Remove the element from the Queue
        int removedNum = numbIntegers.poll();
        System.out.println("Removed Element : " + removedNum);

        System.out.println(numbIntegers);
    }
}
