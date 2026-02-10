package com.abstraction;
import java.util.Arrays;
@SuppressWarnings("unused")
abstract class   Gamechanger {
	String name;
	int level;
	String healthPoints;
	
	
		
	public Gamechanger(String name, int level, String healthPoints) {
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
		System.out.println("-----------------------------");
	}
	public abstract void attack();
	public void chooseTarget() {
		System.out.println("Target selected");
		
	}
	

	public void animalAttack() {
		System.out.println("Animal animation played");
		System.out.println("------------------------");
	}	
	public abstract void displaydetails();
	
}
class Warrior extends Gamechanger{
	String weapontype;
    String [] weapontype2;
	public Warrior(String name, int level, String healthPoints,String weapontype,String [] weapontype2) {
		super(name, level, healthPoints);
		this.weapontype=weapontype;
		this.weapontype2= weapontype2;
	}
	public  void attack() {
		System.out.println("Casting spell: fireball");
		
	}
	public void displaydetails() {
		System.out.println("name:"+name+"\n"+"level:"+level+"\n"+"healthpoints:"+healthPoints+"\n"+"weapontype:"
	+weapontype+"\n"+"weapontype2:"+Arrays.toString(weapontype2));
		
	}
}
class Archer extends Gamechanger{
	String arrowtype;

	public Archer(String name, int level, String healthPoints,String arrowtype) {
		super(name, level, healthPoints);
		this.arrowtype=arrowtype;
	}
	public  void attack() {
		System.out.println( "Performing melee attack with Sword.");	
	}
	public void displaydetails() {
		System.out.println("name:"+name+"\n"+"level:"+level+"\n"+"healthpoints:"+healthPoints+"\n"+"arrowtype:"+arrowtype);
		
	}
	
	
}
  class Mage extends Gamechanger{
	  String spelltype;

	  public Mage(String name, int level, String healthPoints, String spelltype) {
		super(name, level, healthPoints);
		this.spelltype=spelltype;
		
	  }
	  public  void attack() {
			System.out.println( "Performing melee attack with Sword.");
	  }		
	  public void displaydetails() {
			System.out.println("name:"+name+"\n"+"level:"+level+"\n"+"healthpoints:"+healthPoints+"\n"+"spelltype:"+spelltype);
			
		}
  }
public class Example8 {	
	public static void main(String[] args) {
		String weapontype2 [] = new String[] {"shakti","pasupastr"};
		Gamechanger obj1 = new Warrior("animal", 4, "93", "kadga", weapontype2);
		obj1.displaydetails();
		obj1.attack(); 
		obj1.chooseTarget(); 
	    obj1.animalAttack();
	    Gamechanger obj2 = new Archer("asphalt", 4, "94 medium","bramhasatra");
		obj2.displaydetails();
		obj2.attack(); 
		obj2.chooseTarget(); 
	    obj2.animalAttack();
	    Gamechanger obj3 = new Archer("AGHTS", 4, "94 High","bramhasatra");
		obj3.displaydetails();
		obj3.attack(); 
		obj3.chooseTarget(); 
	    obj3.animalAttack();
	   
	}

}
