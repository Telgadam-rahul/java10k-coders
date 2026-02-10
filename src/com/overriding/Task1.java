package com.overriding;

class Animal{
	public void makeSound() {
		System.out.println("Animal sound");
	}
	
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark");
	
}
}
public class Task1 {

	public static void main(String[] args) {
		Animal obj2 = new Animal();
		obj2.makeSound();
		Dog obj1 = new Dog();
		obj1.makeSound();
		

	}

}
