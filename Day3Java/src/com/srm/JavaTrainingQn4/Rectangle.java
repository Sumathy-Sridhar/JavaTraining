package com.srm.JavaTrainingQn4;

public class Rectangle  {;

	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	
	void areaCalc() {
		int result=length*breadth;
		System.out.println("Area:  "+result);
	}
	
	void PerimeterCal() {
		int peri=2*(length+breadth);
		System.out.println("Perimeter:  "+peri);
	}

}
