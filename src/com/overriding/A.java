package com.overriding;


class Rahul{
	static void display(int a) {
		System.out.println("dfghj");
	}
}
public class A extends Rahul{
	static void display(int a) {
		System.out.println("sdfvgb");
	}
	public static void main(String[] args) {
		A.display(10);
	}
}
