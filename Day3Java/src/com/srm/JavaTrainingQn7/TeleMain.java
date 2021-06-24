package com.srm.JavaTrainingQn7;

public class TeleMain {

	public static void main(String[] args) {
	Telephone st=new SmartTelephone();
	System.out.println("call of abstract method lift():");
		st.lift();
		System.out.println();
		System.out.println("call of abstract method disconnected():");
		st.disconnected();
		System.out.println();
		

	}

}
