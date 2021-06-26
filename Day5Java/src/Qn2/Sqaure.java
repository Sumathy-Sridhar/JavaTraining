package Qn2;
 
public class Sqaure extends Thread {
	int num;
	Sqaure(int n){
		num=n;
	}
	public void run() {
		int sqr=num*num;
		System.out.println("Sqaure of "+num+ " is : "+ sqr);
	}
}	
