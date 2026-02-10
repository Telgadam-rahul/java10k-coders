package com.overriding;
class Person{
	protected void display() {
		System.out.println("i am a person");
	}
}
class Student extends Person{
	public void display() {
		System.out.println("I am a student");
	}
}
public class Tak3 {

	public static void main(String[] args) {
		Person obj1 = new Student();
		obj1.display();
		

	}

}
