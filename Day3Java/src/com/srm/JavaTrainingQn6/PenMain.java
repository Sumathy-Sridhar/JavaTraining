package com.srm.JavaTrainingQn6;

public class PenMain {

	public static void main(String[] args) {
		Fountainpen fp=new Fountainpen();
		System.out.println("Call of write() from Abstract class Pen: ");
		fp.write();
		System.out.println();
		System.out.println("Call of refill() from Abstract class Pen: ");
		fp.refill();
		System.out.println();
		System.out.println("Call of change_Nib() from concrete class Fountainpen: ");
		fp.change_Nib();

	}

}
