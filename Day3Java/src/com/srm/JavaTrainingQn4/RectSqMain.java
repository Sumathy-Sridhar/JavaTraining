package com.srm.JavaTrainingQn4;

public class RectSqMain {

	public static void main(String[] args) {
		Rectangle re=new Rectangle(20,30);
		Square sq=new Square(25);
		System.out.println("Area of SQUARE:");
		System.out.println();
		sq.areaCalc();
		sq.PerimeterCal();
		System.out.println("\nArea of RECTANGLE:");
		re.areaCalc();
		re.PerimeterCal();


	}
}
