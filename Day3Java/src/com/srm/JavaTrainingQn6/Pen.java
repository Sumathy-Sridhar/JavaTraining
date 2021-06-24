package com.srm.JavaTrainingQn6;

public abstract class Pen {
	void write(){
		System.out.println("Pen is mightier than sword!");
	}
	
	void refill() {
		System.out.println("Penhouse.in provides the best pen refills..");
	}
}

 class Fountainpen extends Pen{
	void change_Nib(){
		System.out.println("LAMY Imporium is the best fountainpen nib.."); 
	 }
 }