
public void run(){
    try {
        // Display thread that is running 

        System.out.println("Thread "+Thread.currentThread().getState() + " is running");
    } catch (Exception e) {
        // Thread an exception
        System.out.println("Exception is caught");
        // TODO: handle exception
    }       
}

public class _01_Multithreading{

    public static void main(String[] args){
        int n = 8; //Number of threads
        for(int i=0;i<n;i++)
    }
}