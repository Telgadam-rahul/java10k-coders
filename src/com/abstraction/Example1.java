package com.abstraction;
abstract class Vehicle{
	String modelname;
	int vehiclenumber;
	String company;
	public Vehicle(String modelname,int vehiclenumber,
	String company) {
		this.modelname=modelname;
		this.vehiclenumber=vehiclenumber;
		this.company=company;
	}
	public abstract void startEngine();
	public abstract void displaydetails();
	 public void fuelType() {
		 System.out.println("Fuel type is:petrol");
		 
	 }
	 
}
class Car extends Vehicle{
	int numberofdoors;
	boolean hasSunroof;
	public Car( String modelname,int vehiclenumber,
			String company,int numberofdoors,boolean hasSunroof) {
		super(modelname,vehiclenumber,company);
		this.numberofdoors =numberofdoors;
		this.hasSunroof=hasSunroof;
		
		
	}
	public void startEngine() {
		System.out.println("start with key ignition");
		
	}
	public void displaydetails() {
		System.out.println("Vehicle name:Car" +"\n"+ "modelname:" +modelname+"\n"+"vehiclenumber:"+vehiclenumber+"\n"+"company:"+company+ "\n"+"Number of doors:"+numberofdoors+"\n"
				+"hasSunroof:"+(hasSunroof? "yes":"no"));
	
	System.out.println(".............................");
	}
	public void fuelType() {
		System.out.println("fuel type is :petrol");
	}
	
}
class Bike extends Vehicle{
	boolean hasSidecar;
	public Bike( String modelname,int vehiclenumber,
			String company,boolean hasSidecar) {
		super(modelname,vehiclenumber,company);
		this.hasSidecar=hasSidecar;
	}
	public void startEngine() {
		System.out.println("start with kick or self");
		
	}
	public void displaydetails() {
		System.out.println("Vehicle name : Bike " +"\n"+ "modelname"+modelname+"\n"+"vehiclenumber"+vehiclenumber+"\n"+"company :"+company+"\n"+
				"hasSidecar:"+(hasSidecar? "yes":"no"));
		System.out.println(".............................");
		
	}
	public void fuelType() {
		System.out.println("fuel type is :petrol");
	}	
		
	}
class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String modelname,int vehiclenumber,
	String company,int cargoCapacity) {
super(modelname,vehiclenumber,company);
}
	public void startEngine() {
		System.out.println("heavy-load engine warm-up");
		}
	public void displaydetails() {
		System.out.println("Vehicle name :Truck:"+"\n"+"modelname"+modelname+"vehiclenumber:"+vehiclenumber+"company"+company+"cargoCapacity:"+cargoCapacity);
		
	}
	
	public void fuelType() {
		System.out.println("fuel type is :Diesel");
	}	
	 
}

public class Example1 {
	public static void main(String[] args) {
		 Vehicle v1 = new Car("Tata", 4534, "Tata Motors", 4, true);
	       Vehicle v2 = new Bike("Pulsar", 1111, "Bajaj", false);
	       Vehicle v3 = new Truck("Ashok Leyland", 9099, "AL", 5000);

	        v1.startEngine();
	        v1.fuelType();
	        v1.displaydetails();
	        v2.startEngine();
	        v2.fuelType();
	        v2.displaydetails();
	        v3.startEngine();
	        v3.fuelType();
	        v3.displaydetails();
	        

	    }
}
