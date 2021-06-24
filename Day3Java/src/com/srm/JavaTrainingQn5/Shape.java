package com.srm.JavaTrainingQn5;

public class Shape {
	void printShape() {
		System.out.println("This is Shape");
	}
}
class Rectangle extends Shape{
	void rectShape() {
		System.out.println("This is Rectangular Shape");
	}
}

class Circle extends Shape{
	void cirShape() {
		System.out.println("This is Circular Shape");
	}
}
class Square extends Rectangle{
	void squareShape() {
		System.out.println("This is Square Shape");
	}
}