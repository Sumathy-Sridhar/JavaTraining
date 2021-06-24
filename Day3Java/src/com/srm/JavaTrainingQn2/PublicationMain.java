package com.srm.JavaTrainingQn2;

public class PublicationMain {

	public static void main(String[] args) {
	    Publication p=new Book("Few Things Left Unsaid!",150.50f,300);
	    Publication p1=new Book("Can Love Happen Twice",450.00f,400);
	    Publication p2=new CD("Revolution2020",200.20f,250);
	       p.putData();
	       p1.putData();
	       p2.putData();
	   }

	}


