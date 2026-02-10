package com.overriding;
class Parent{
	public Number getNumber() {
	return 34;
	}
}
class Child extends Parent{
	public Integer getNumber() {
		return 100;
	}
}

public class Task3 {

	public static void main(String[] args) {
		
		Parent obj1 = new Child();
		Integer num = (Integer)obj1.getNumber();
		System.out.println(num);
		
	}

}
