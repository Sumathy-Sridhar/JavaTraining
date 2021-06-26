package Qn2;

import java.util.Random;

public class RandomNumber extends Thread {
	public void run() {
		Random rd=new Random();
		for(int i=0;i<3;i++) {
			int rint=rd.nextInt(50);
			System.out.println("Random Integer generated is : "+rint);
			if(rint%2==0) {
				Sqaure s=new Sqaure(rint);
				s.start();
				System.out.println("Is Sqaure Thread Alive: "+s.isAlive());
				System.out.println();
			}
			else {
				Cube cb=new Cube(rint);
				cb.start();
				System.out.println("Is Cube Thread Alive: "+ cb.isAlive());
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			}
		
			catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		
	}

}