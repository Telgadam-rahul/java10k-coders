package com.interfaces;

public interface Task1 {
	void displayDetails();
	void getdetails();
	default void ramu();
	
}
class Task2 implements Task1{
	public void displayDetails() {
		System.out.println("qwedfrgthyju");
	}
	@Override
	public void getdetails() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ramu() {
		System.out.println("sdfvgb");
	}
	
	
}
