package com.srm.JavaTrainingQn7;

public class SmartTelephone extends Telephone{

	@Override
	public void lift() {
		System.out.println("lift phone has battery backup that provides power to telephone line in the event of a power outage.");
		
	}

	@Override
	public void disconnected() {
		System.out.println("We're sorry; you have reached a number that has been disconnected or is no longer in service. ");
		
	}
	
	
	
}
