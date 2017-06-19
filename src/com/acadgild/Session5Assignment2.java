package com.acadgild;

/**
 * 
 * Main class to find the area and perimeter of Circle, Square and Rectangle
 *
 */

public class Session5Assignment2 {

	public static void main(String[] args) {

		// Get the area and perimeter of Circle
		Circle c = new Circle(3);
		c.findArea();
		c.findPerimeter();

		System.out.println("************************************");

		// Get the area and perimeter of Square
		Square s = new Square(3);
		s.findArea();
		s.findPerimeter();

		System.out.println("************************************");

		// Get the area and perimeter of Rectangle
		Rectangle r = new Rectangle(3, 2);
		r.findArea();
		r.findPerimeter();
	}

}
