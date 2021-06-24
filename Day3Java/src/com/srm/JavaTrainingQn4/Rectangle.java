package com.srm.JavaTrainingQn4;

public class Rectangle  {;

	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	void area(int length,int breadth) {
		int result=length*breadth;
		System.out.println("Area of Rectangle: "+result);
	}
	
	void Perimeter(int length, int breadth) {
		int peri=2*(length+breadth);
		System.out.println("Perimeter of Rectangle: "+peri);
	}

}
