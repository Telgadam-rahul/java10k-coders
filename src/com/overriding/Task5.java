package com.overriding;
class Shape{
	public void draw() {
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing square");
	}
}

public class Task5 {

	public static void main(String[] args) {
	Shape s1 = new Circle();
	Shape s2 = new Square();
	s1.draw();
	s2.draw();
	}

}
