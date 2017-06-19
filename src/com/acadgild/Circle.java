package com.acadgild;

/**
 * 
 * Circle class extending Figure class and defining its abstract methods
 * findArea and findMethod
 *
 */

public class Circle extends Figure {
	int radius;

	// Constructor to set the radius of the circle
	Circle(int radius) {
		this.radius = radius;
	}

	// Override the findArea method
	void findArea() {
		System.out.println("Calculating area of Circle");
		System.out.println("Area = " + 3.14 * radius * radius);
	}

	// Override the findPerimeter method
	void findPerimeter() {
		System.out.println("Calculating perimeter of Circle");
		System.out.println("Perimeter = " + 2 * 3.14 * radius);
	}
}
