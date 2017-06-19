package com.acadgild;

/**
 * 
 * Square class extending Figure class and defining its abstract methods
 * findArea and findMethod
 *
 */

public class Square extends Figure {
	int length;

	// Constructor to set the length of square
	Square(int length) {
		this.length = length;
	}

	// Override the findArea method
	void findArea() {
		System.out.println("Calculating area of Square");
		System.out.println("Area = " + length * length);
	}

	// Override the findPerimeter method
	void findPerimeter() {
		System.out.println("Calculating perimeter of Square");
		System.out.println("Perimeter = " + 4 * length);
	}
}
