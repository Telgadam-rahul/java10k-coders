package com.abstraction;
 abstract class Payment{	 
	 public abstract void processPayment();
	 public abstract void validateTransaction();
	 public abstract void displaydetails();
	 public void  generateTransactionId() {	 
	 }
}
 class CreditCardPayment  extends Payment{
	 String cardnumber;
	 String expiryDate;
	 int cvv;
	 public CreditCardPayment(String cardnumber,
	 String expiryDate,
	 int cvv) {
		 this.cardnumber=cardnumber;
		 this.expiryDate=expiryDate;
		 this.cvv=cvv;
	 }
	 public void processPayment() {
		 System.out.println( "Processing credit card payment.");
	 }
	 public void validateTransaction() {
		 System.out.println("Validating card number, expiry, and CVV.");
		 
	 }
	 public void displaydetails() {
		 System.out.println("Cardnumber is:"+cardnumber+"\n"+"expirydate:"+expiryDate+"\n"+"cvv is:"+cvv);
	 }
	 public void generateTransactionId() {
		 System.out.println("Generated transaction ID: 123456789");
		 System.out.println("-----------------------------");
	 } 	 
 }
 class UPIPayment extends Payment{
	 String upiId;
	 String phonenumber;
	 public UPIPayment(String upiId,
	 String phonenumber) {
		 this.upiId=upiId;
		 this.phonenumber=phonenumber;
	 }
	 public void processPayment() {
		 System.out.println( "Processing UPI payment.");
	 }
	 public void validateTransaction() {
		 System.out.println("Validating UPI ID and phonenumber");
	 }
	 public void displaydetails() {
		 System.out.println("UpiId is:"+upiId+"\n"+"phonenumber:"+phonenumber);
	 }
	 public void generateTransactionId() {
		 System.out.println("Generated transaction ID: 123456789");
		 System.out.println("-----------------------------");
	 } 	 
 }
	 class PayPalPayment extends Payment{
		 String Emailid;
		 String autotoken;
		 public PayPalPayment(String Emailid,
		 String autotoken) {
			 this.Emailid=Emailid;
			 this.autotoken=autotoken;
		 }
		 public void processPayment() {
			 System.out.println( "Processing Paypal payment.");
		 }
		 public void validateTransaction() {
			 System.out.println("Validating EMAILID and authentication");
			 
		 }
		 public void displaydetails() {
			 System.out.println("emailId is:"+Emailid);
		 }
		 public void generateTransactionId() {
			 System.out.println("Generated transaction ID: 123456789");
			 System.out.println("-----------------------------");
		 } 	 
	 }

public class Example2 {
	public static void main(String[] args) { 
		Payment obj1 = new CreditCardPayment("453487675843","12/32",345);
		obj1.displaydetails();
		obj1.processPayment();
		obj1.validateTransaction();
		obj1.generateTransactionId();
		Payment obj2 = new UPIPayment("770213422@tbl","7702168736");
		obj2.displaydetails();
		obj2.processPayment();
		obj2.validateTransaction();
		obj2.generateTransactionId();
		Payment obj3 = new PayPalPayment("telgadamrahul@gmail.com","abc124");
		obj3.displaydetails();
		obj3.processPayment();
		obj3.validateTransaction();
		obj3.generateTransactionId();
		

	}

}
