package com.inheritence.task;
//class Animal{
//	public void display(){
//		System.out.println("this is a animal");
//	}
//}
//class Dog extends Animal{
//	
//	}
//  class Vehicle{
//	  void run() {
//		  System.out.println("vehicle is running");
//	  }
//  }
//   class Car extends Vehicle{
//	   void speed() {
//			System.out.println("moving at 60 kms per hour");
//		}
//   }
//class Parent{
//	public Parent() {
//		System.out.println("person object created");
//	}
//}
//class Student extends Parent {
//	public Student() {
//		super();
//		System.out.println("Student object is created");
//	}
//} 
// class Employee{
//	 int salary=5000;
//	 public Employee(int salary) {
//		 this.salary = salary;
//	 }
//	 
//	 
// }
// class Manager extends Employee{
//	 int bonus=2000;
//	 public Manager(int salary,int bonus) {
//		super(salary);
//		this.bonus = bonus;
//	 } 
//	 public void displaysalary() {
//		 System.out.println("total salary:"+(salary+bonus));
//	 }	 
// } 
     class Computer{
    	 void showBrand() {
    		 System.out.println("Brand: dell");
    	 }
     }
     class Laptop extends Computer{
    	 void showModel() {
    		 System.out.println("model: XPS 15");
    	 }
    	 
     }
public class Task3  {
	public static void main(String[] args) {
		Laptop obj1  = new Laptop();
	obj1.showBrand();
	obj1.showModel();
	
		 
		
		
		
		
		
		
		
	}

}
