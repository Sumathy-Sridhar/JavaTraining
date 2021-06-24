package com.srm.JavaTrainingQn2;

public class CD extends Publication {
	private double playingTime;
	CD(String title, float price, double playingTime) {
		super(title, price);
		this.playingTime=playingTime;
	}
	void putData()
	{
		super.putData();
		System.out.println("The Playing time of CD : "+playingTime);
	}	
}
