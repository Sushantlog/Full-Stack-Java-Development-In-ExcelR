// ABC class implements interface Runnable

class ABC implements Runnable{
    public void run(){
        try {
            // moving thread to timed waiting state
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
            // TODO: handle exception
        }


        System.out.println("The state of thread t1 while it invoked join() on thread t2 - "+_02_Thread_State.t1.getClass());
    
        try{
            Thread.sleep(200);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

public class _02_Thread_State implements Runnable {
    public static Thread t1;

    public static _02_Thread_State obj;

    public static void main(String[] args) {
        // creating object of the class _02_Thread_State
        obj = new _02_Thread_State();
        t1 = new Thread();

        // The Thread t1 is currenty in the state 
        System.out.println("The state of thread t1 is : "+t1.getState());

        // invoke start() on t1 Thread 
        System.out.println("The state of t1 thread after invoking start() method : "+t1.getState());

    }

    public void run(){
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        // Thread t2 created and currently in new state
        System.out.println("The state of thread t2 is : "+t2.getState());

        // invoking thread t2 with start()
        t2.start();

        try{
            Thread.sleep(200);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after invoking sleep() "+t2.getState());

        try{
            // Waiting for thread t2 completed its execution
            t2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The State of thread t2 when it has completed its execution "+t2.getState());
    }
}
