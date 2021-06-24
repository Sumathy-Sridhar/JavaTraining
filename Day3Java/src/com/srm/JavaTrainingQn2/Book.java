package com.srm.JavaTrainingQn2;

public class Book extends Publication {
	private int pages;
    Book(String title,float price,int pages)
     {
    super(title,price);
    this.pages=pages;
     }
   void putData()
    {
    super.putData();
    System.out.println("No of Pages:"+pages);
    }

}
