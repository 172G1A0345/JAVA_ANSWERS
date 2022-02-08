package com.capgemini.sfdc.day2.oop;

class Animal{
	void makeSound(){
		System.out.println("MAKE SOUND of Animal");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("bow bow");
	}
}
class cat extends Animal{
	void makeSound(){
		System.out.println("mow moew");
	}
	static void m1() {
		System.out.println("Ashok");
	}
}
	class cage{
		Animal a;
		cage(Animal a){
			this.a=a;
		}
		void hit(){
			cat.m1();
			a.makeSound();
		}
	}
public class CageTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cage c1=new cage(new Dog());
		cage c2=new cage(new cat());
		c1.hit();
		c2.hit();
	}

}
