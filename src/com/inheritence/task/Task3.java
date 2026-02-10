package com.inheritence.task;
class A{
	public void getmethod(){
		System.out.println("A class object");
	}
}
class B extends A{
	public void getmethod() {
		System.out.println("B class object");
	}
}

public class Task3 {

	public static void main(String[] args) {
		A ref = new B();
		B  b = (B) ref.getmethod();
		
		
		
		
		
		
	}

}
