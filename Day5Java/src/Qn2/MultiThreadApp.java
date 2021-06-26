package Qn2;

public class MultiThreadApp {
	public static void main(String[] args) {
		RandomNumber rn=new RandomNumber();
		rn.start();
		System.out.println("Thread : "+rn.isAlive());
	}
}
