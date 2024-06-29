import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class _01_ArrayBlocking_Queue {

    public static void main(String[] args) {
        // creating blocking Queue using array
        BlockingQueue<String> animal = new ArrayBlockingQueue<>(5);

        try{
            // Insert element to blocking queue
            animal.put("Dog");
            animal.put("Cat");
            animal.put("Tiger");

            System.out.println("Blocking Queue : "+animal);

            // Remove the elements from blocking queue
            String str = animal.take();
            System.out.println("Removed Element : "+str);

            System.out.println("Blocking Queue : "+animal);
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}