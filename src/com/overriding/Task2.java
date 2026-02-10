package com.overriding;
class Vehicle{
	public void start() {
		System.out.println("vehicle started");
	}
}
class Car extends Vehicle{
	@Override
	public void start(){
		System.out.println("car started");
	}
	
}

public class Task2 {

	public static void main(String[] args) {
		Vehicle obj2 = new Vehicle();
		obj2.start();
		Vehicle obj1 = new Car();
		obj1.start();

	}

}
