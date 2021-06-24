package com.srm.JavaTrainingQn2;

public class Publication {
	  private String title;
	  private float price;
	   Publication(String title,float price)
	   {
	   this.title=title;
	   this.price=price;
	   }
	  void putData()
	   {
	   System.out.println("\nTitle:"+title);
	   System.out.println("Price:"+price);
	   }
	}
