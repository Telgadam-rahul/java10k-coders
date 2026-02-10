package com.abstraction;
abstract class User{
	String username;
	String emailid;
	String role;
	public User(String username,String emailid,String role) {
		this.username=username;
		this.emailid= emailid;
		this.role=role;
		
	}
	public abstract void accessDashboard();
	public void login() {
		System.out.println("login successfull");
}
	public void logout() {
		System.out.println("logout successfull");
	}
	public void updateProfile() {
		System.out.println("Profile updated successfully.");
	}
}
class Student extends User{
	
	String enrolledcourses;
	double grade;
	public Student(String username,String emailid,String enrolledcourses,double grade) {
		super(username,emailid,"Student");
		this.enrolledcourses=enrolledcourses;
		this.grade=grade;
	}
	public void accessDashboard() {
		System.out.println("Accessing student dashboard: Enrolled courses:"+enrolledcourses+"grades:"+grade);
	}

}
class Instructor extends User{
	String createdCourses;
	String studentSubmission;
	public Instructor(String username, String emailid, String createdCourses,String studentSubmission) {
		super(username, emailid,"instructor");
		this.createdCourses=createdCourses;
		this.studentSubmission=studentSubmission;
		
	}
	
	public void accessDashboard() {
		System.out.println("Accessing instructor dashboard: Enrolledcourses"+createdCourses+"student submissions:"+studentSubmission);
	}
}
class Admin extends User{
	String siteanalytics;
	String userManagementTools;
	public Admin(String username, String emailid, String siteanalytics,String userManagementTools) {
		super(username, emailid,"admin");
	   this.siteanalytics=	siteanalytics;
	   this.userManagementTools=userManagementTools;
	}
	public void accessDashboard() {
		System.out.println("Accessing admin dashboard:"+"siteanalytics"+siteanalytics+"usermanagementtools:"+userManagementTools);
	}
}
 
	
public class Example5 {
	public static void main(String [] args) {
	User obj1 = new Student("telgadamrahul","telgadamrahul@gmail.com","java ,html " ,90);
	obj1.accessDashboard();
    obj1.login();
    obj1.logout();
    obj1.updateProfile();

}
}

