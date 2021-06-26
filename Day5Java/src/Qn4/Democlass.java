package Qn4;

public class Democlass implements Runnable {
    public void run() {
    	Thread t = Thread.currentThread();
        System.out.println("Thread started: "+t.getName());
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: "+t.getName());    
    }

}
