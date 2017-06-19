package com.acadgild;

/**
 * 
 * Rectangle class extending Figure class and defining its abstract methods
 * findArea and findMethod
 *
 */

public class Rectangle extends Figure {
	int length, breadth;

	// Constructor to set the length and breadth of Rectangle
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Override the findArea method
	void findArea() {
		System.out.println("Calculating area of Rectangle");
		System.out.println("Area = " + length * breadth);
	}

	// Override the findPerimeter method
	void findPerimeter() {
		System.out.println("Calculating perimeter of Rectangle");
		System.out.println("Perimeter = " + 2 * (length + breadth));
	}
}
