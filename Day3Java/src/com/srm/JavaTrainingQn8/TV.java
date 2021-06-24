package com.srm.JavaTrainingQn8;

public class TV implements SmartTVRemote {

	@Override
	public void use() {
		System.out.println("You could change any channel of your choice from a distance..");
		
	}

	@Override
	public void usage() {
		System.out.println("you just point at the device you want to control, and the remote's touchscreen will display the appropriate user interface to control it.." );
		
	}
	
}
