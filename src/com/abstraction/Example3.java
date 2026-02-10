package com.abstraction;
abstract class Employee{
	String Employeename;
	String id;
	public Employee(String Employeename,String id) {
		this.Employeename=Employeename;
		this.id= id;
	}
	public abstract void calculateSalary();
	public void applyLeave() {
}
	public void getDetails() {
		
	}
}
	class FullTimeEmployee extends Employee{	
	int basepay;
	int benefits;
	public FullTimeEmployee(String Employeename,String id,
	int basepay,int benefits) {
		super(Employeename,id);
		this.basepay=basepay;
		this.benefits=benefits;	
	}
	public void calculateSalary() {
		System.out.println("caluculating salary:"+(benefits+basepay));
		System.out.println("---------------------");
	}
	public void applyLeave() {
		System.out.println("leaves applied successfully");
}
	public void getDetails() {
		System.out.println("employeedetails:"+"Employeename:"+
	Employeename+"\n"+"id:"+id);
		
	}
		
	}
	class PartTimeEmployee extends Employee{
		int hourlyrate;
		int hoursworked;
		public PartTimeEmployee(String Employeename,String id,int hourlyrate,int hoursworked) {
			super(Employeename,id);
			
			this.hourlyrate=hourlyrate;
			this.hoursworked=hoursworked;
			
		}
		public void calculateSalary() {
	
			System.out.println("caluculating salary:"+ (hoursworked*hourlyrate));
			System.out.println("---------------------");
		}
		
		public void getDetails() {
		System.out.println("employeedetails:"+Employeename+"\n"+"id:"+id);
			
			
		}
	}
	class Freelancer extends Employee{
		int projectpayment;
		public Freelancer(String Employeename,String id,int projectpayment) {
			super(Employeename,id);
			this.projectpayment=projectpayment;
		}
		public void calculateSalary() {
			
			System.out.println("caluculating salary:"+"projectpayment:"+projectpayment);
			System.out.println("---------------------");
		}
	
		
		public void getDetails() {
		System.out.println("employeedetails:"+Employeename+"\n"+"id:"+id);
			
		}
		
		
	}
public class Example3 {
	public static void main(String[] args) {
		Employee v1 = new FullTimeEmployee("Rahul","IN22", 3000, 10000);
		v1.applyLeave();
		v1.getDetails();
		v1.calculateSalary();
	   Employee v2 = new PartTimeEmployee("sunny","IN24",1650,29);
	   v2.applyLeave();
		v2.getDetails();
		v2.calculateSalary();
		Employee v3 = new Freelancer("bunny","IN25",2000);
		   v3.applyLeave();
			v3.getDetails();
			v3.calculateSalary();
	}
	}


