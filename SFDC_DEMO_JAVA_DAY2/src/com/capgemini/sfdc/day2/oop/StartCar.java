package com.capgemini.sfdc.day2.oop;


class Car
{
	 void Start() {}
	
	void Accelarate(){};
	
	void Brake(){}
}
class Audi extends Car
{
	void Start() {
		System.out.println("Audi Starts");
	}
	void Accelarate() {
		System.out.println("Audi Accelarate");
	}
	void Brake() {
		System.out.println("Audi Stoped");
	}
	
}
class Driver{
	Car C;
	Driver(Car C){
		this.C=C;
	}
	void Key() {
		C.Start();
		C.Accelarate();
		C.Brake();
	}
}
public class StartCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver D1=new Driver(new Audi());
		D1.Key();
	}

}
