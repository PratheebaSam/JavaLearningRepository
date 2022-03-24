package com.tyss.assignmentsbyprathi.areacalculationusingabstract;

public class Area extends Shape{

	@Override
	public void RectangleArea(double a, double b) {
		System.out.println("Area of the rectangle : "+a*b);
		
	}

	@Override
	public void SquareArea(double a) {
		System.out.println("Area of the Triangle : "+a*a);
		
	}

	@Override
	public void CircleArea(double a) {
		System.out.println("Area of the Circle : "+3.14*a*a);
		
	}
	
}
