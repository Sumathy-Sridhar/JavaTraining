package Qn4;

public class JoinDemo {
	public static void main(String[] args) {
    Thread th1 = new Thread(new Democlass(), "th1");
    Thread th2 = new Thread(new Democlass(), "th2");
    Thread th3 = new Thread(new Democlass(), "th3");
       
    th1.start();
      try {
        th1.join();
    } 
     catch (InterruptedException ie) {
        ie.printStackTrace();
      }
    th2.start();
       try {
        th2.join();
    }
       catch (InterruptedException ie) {
         ie.printStackTrace();
      }
    th3.start();
    try {
        th3.join();
    }
    catch (InterruptedException ie) {
          ie.printStackTrace();
      }  
    System.out.println("All three threads have finished execution");
 }

 }

