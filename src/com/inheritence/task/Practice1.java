package com.inheritence.task;

 class Shape {
	
	public void caluculateArea() {
		System.out.println("calulate area of the shape");
	}

}
class Circle extends Shape{
	double radius;
	public Circle(double radius) { 
        this.radius = radius;
    }
	
	public void caluculateArea() {
		System.out.println("the area of circle is:"+(Math.PI*radius*radius));
	}
}
class Rectangle extends Shape {
	
	long length;
	long breadth;
	public Rectangle(long length,long breadth) {
		this.length =length;
		this.breadth = breadth;
	}
	public void caluculateArea() {
		System.out.println("the area of rectangle is:"+(length*breadth));
	}
	
}
class Triangle extends Shape{
	int base;
	int height;
	public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
	}
	public void caluculateArea() {
		System.out.println("the area of triangle is:"+(0.5*base*height));
	}
	
}

public class Practice1 {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		circle.caluculateArea();
		

	}

}
