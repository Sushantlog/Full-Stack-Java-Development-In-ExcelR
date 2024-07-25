import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.*;

public class _04_ThreadOperations {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Multithreading Operations Menu:");
            System.out.println("1. Create and start multiple threads");
            System.out.println("2. Synchronize threads to avoid race conditions");
            System.out.println("3. Use wait() and notify() for thread communication");
            System.out.println("4. Use sleep() to pause threads");
            System.out.println("5. Demonstrate thread interruption and termination");
            System.out.println("6. Use thread pools to manage threads");
            System.out.println("7. Implement thread synchronization using locks and conditions");
            System.out.println("8. Demonstrate deadlock and ways to avoid it");
            System.out.println("9. Use thread-local variables");
            System.out.println("10. Implement producer-consumer problem");
            System.out.println("11. Use Executors and Callable for parallel computation");
            System.out.println("12. Exit");
            System.out.print("Choose an option (1-12): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    createAndStartThreads();
                    break;
                case 2:
                    demonstrateSynchronization();
                    break;
                case 3:
                    demonstrateWaitNotify();
                    break;
                case 4:
                    demonstrateSleep();
                    break;
                case 5:
                    demonstrateThreadInterruption();
                    break;
                case 6:
                    demonstrateThreadPools();
                    break;
                case 7:
                    demonstrateLocksAndConditions();
                    break;
                case 8:
                    demonstrateDeadlock();
                    break;
                case 9:
                    demonstrateThreadLocalVariables();
                    break;
                case 10:
                    demonstrateProducerConsumer();
                    break;
                case 11:
                    demonstrateExecutorsAndCallable();
                    break;
                case 12:
                    continueProgram = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-12).");
                    break;
            }

            System.out.println();
        }
    }

    private static void createAndStartThreads() {
        class MyThread extends Thread {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running.");
            }
        }

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }

    private static void demonstrateSynchronization() {
        class Counter {
            private int count = 0;

            public synchronized void increment() {
                count++;
            }

            public int getCount() {
                return count;
            }
        }

        Counter counter = new Counter();

        class CounterThread extends Thread {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }

        CounterThread t1 = new CounterThread();
        CounterThread t2 = new CounterThread();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Final count: " + counter.getCount());
    }

    private static void demonstrateWaitNotify() {
        class SharedResource {
            private boolean available = false;

            public synchronized void produce() {
                while (available) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                available = true;
                System.out.println("Produced");
                notify();
            }

            public synchronized void consume() {
                while (!available) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                available = false;
                System.out.println("Consumed");
                notify();
            }
        }

        SharedResource resource = new SharedResource();

        class Producer extends Thread {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                }
            }
        }

        class Consumer extends Thread {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                }
            }
        }

        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    private static void demonstrateSleep() {
        class SleepThread extends Thread {
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " is going to sleep.");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " woke up.");
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }

        SleepThread t1 = new SleepThread();
        t1.start();
    }

    private static void demonstrateThreadInterruption() {
        class InterruptionThread extends Thread {
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " is running.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted.");
                    }
                }
            }
        }

        InterruptionThread t1 = new InterruptionThread();
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        t1.interrupt();
    }

    private static void demonstrateThreadPools() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        class Task implements Runnable {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is executing a task.");
            }
        }

        for (int i = 0; i < 5; i++) {
            executor.submit(new Task());
        }

        executor.shutdown();
    }

    private static void demonstrateLocksAndConditions() {
        class SharedResource {
            private final Lock lock = new ReentrantLock();
            private final Condition condition = lock.newCondition();
            private boolean available = false;

            public void produce() {
                lock.lock();
                try {
                    while (available) {
                        condition.await();
                    }
                    available = true;
                    System.out.println("Produced");
                    condition.signal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            }

            public void consume() {
                lock.lock();
                try {
                    while (!available) {
                        condition.await();
                    }
                    available = false;
                    System.out.println("Consumed");
                    condition.signal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            }
        }

        SharedResource resource = new SharedResource();

        class Producer extends Thread {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                }
            }
        }

        class Consumer extends Thread {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                }
            }
        }

        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    private static void demonstrateDeadlock() {
        class Resource {
            private final String name;

            public Resource(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        final Resource resource1 = new Resource("Resource 1");
        final Resource resource2 = new Resource("Resource 2");

        class Thread1 extends Thread {
            public void run() {
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
                    }
                }
            }
        }

        class Thread2 extends Thread {
            public void run() {
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                    synchronized (resource1) {
                        System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());
                    }
                }
            }
        }

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

    private static void demonstrateThreadLocalVariables() {
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

        class ThreadLocalThread extends Thread {
            public void run() {
                threadLocal.set(threadLocal.get() + 1);
                System.out.println(Thread.currentThread().getName() + " ThreadLocal value: " + threadLocal.get());
            }
        }

        ThreadLocalThread t1 = new ThreadLocalThread();
        ThreadLocalThread t2 = new ThreadLocalThread();
        t1.start();
        t2.start();
    }

    private static void demonstrateProducerConsumer() {
        class Buffer {
            private final Queue<Integer> queue = new LinkedList<>();
            private final int capacity;

            public Buffer(int capacity) {
                this.capacity = capacity;
            }

            public synchronized void produce(int value) throws InterruptedException {
                while (queue.size() == capacity) {
                    wait();
                }
                queue.add(value);
                System.out.println("Produced: " + value);
                notifyAll();
            }

            public synchronized int consume() throws InterruptedException {
                while (queue.isEmpty()) {
                    wait();
                }
                int value = queue.poll();
                System.out.println("Consumed: " + value);
                notifyAll();
                return value;
            }
        }

        Buffer buffer = new Buffer(5);

        class Producer extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.produce(i);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        class Consumer extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.consume();
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    private static void demonstrateExecutorsAndCallable() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        class Task implements Callable<String> {
            private final int taskId;

            public Task(int taskId) {
                this.taskId = taskId;
            }

            @Override
            public String call() throws Exception {
                return "Result of Task " + taskId;
            }
        }

        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            futures.add(executor.submit(new Task(i)));
        }

        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        executor.shutdown();
    }
}
