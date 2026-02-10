package com.overloading;

class Rahul{
	public void print(int a) {
		System.out.println("short");
	}
	
}
class Sunny extends Rahul{
	public void print(byte a) {
		System.out.println("byte");
	}
}
public class Animal {

	public static void main(String[] args) {
		
		Rahul obj2 = new Sunny();
		Sunny obj3=(Sunny)obj2;
		obj3.print(2);
	}

}
