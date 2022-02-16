package com.concept.oops;
abstract class Animal{  
	  abstract void eat();  
	}

	//Inheritance
	class DomesticAnimal extends Animal{  
	void eat()
	{
		System.out.println("eating...");}  
	}  
	class Dog extends Animal{  
	void bark()
	{
		System.out.println("barking...");
	} 
	}  
	//multiple inheritance and polymorphism too
	class Cattle extends DomesticAnimal{
	void eat()
	{
		System.out.println("Cattle eating grass...");}
	}

public class Main {
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.bark();    
		Cattle c=new Cattle();
		c.eat();

}
}
