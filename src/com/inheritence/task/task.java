package com.inheritence.task;
class vehicle{
	String make;
	String model;
	int year;
	public vehicle(String make,String model, int year) {
		 this.make=make;
         this.model=model;
	     this.year= year;
	}

	public void displayInfo() {
		System.out.println("vechile make:"+ this.make);
		System.out.println("vechile model:"+ this.model);
		System.out.println("vechile year:"+ this.year);
		
	}
}
	 class Car extends vehicle{
		int numberofdoors;
		public Car(String make,String model, int year,int numberofdoors) {
		super(make,model,year);
		this.numberofdoors = numberofdoors;
		
	}
		public void displayCardetails() {
			System.out.println("vechile make:"+ this.make);
			System.out.println("vechile model:"+ this.model);
			System.out.println("vechile year:"+ this.year);
			System.out.println("vechile numberofdoors:"+ this.numberofdoors);
			
		}
	 }
		 class 	Truck extends vehicle{
			int cargoCapacity;
			public Truck(String make,String model, int year,int cargoCapacity) {
				super(make,model,year);
				this.cargoCapacity= cargoCapacity;
			}
			public void displayTruckInfo() {
				System.out.println("vechile make:"+ this.make);
				System.out.println("vechile model:"+ this.model);
				System.out.println("vechile year:"+ this.year);
				System.out.println("vechile cargoCapacity:"+ this.cargoCapacity);
			}
		}
	
public class task {
	public static void main(String[] args) {
		vehicle vh = new Car("Tayota","corolla",2022,4);
		vh.displayInfo();
		System.out.println("-----------");
		
		Car car =(Car)vh;
		car.displayCardetails();
		System.out.println("---------");
		
		 vehicle vh2 = new Truck("Tata","407",2020,1500);
		    Truck truck = (Truck) vh2;  
		    truck.displayTruckInfo(); 
	}
}
	


