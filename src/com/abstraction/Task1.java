package com.abstraction;
abstract class Shape{
	public abstract void area();
}
class Circle extends Shape{
	public double radius;
	public Circle(double radius) {
		 this.radius = radius;
	}

	public void area() {
		System.out.println("Area of the circle " +(Math.PI)*(radius*radius));	
	}
}
class Rectangle  extends Shape{
	double length;
	double breadth;
	public Rectangle(double length, double breadth) {
		this.length= length;
		this.breadth= breadth;	
	}
	public void area() {
		System.out.println("area of rectangle "  +  (length*breadth));
}
}
class Square  extends Shape{
	double sides;
	public Square(double sides) {
		this.sides= sides;	
	}
	public void area() {
		System.out.println("area of Square " + (sides*sides));
	}
}
public class Task1 {

	public static void main(String[] args) {
		Shape obj1 = new Circle(5);
		obj1.area();
		Shape obj2 = new Rectangle(23.5,43.6);
		obj2.area();
		Shape obj3 = new Square(34);
		obj3.area();

	}

}
