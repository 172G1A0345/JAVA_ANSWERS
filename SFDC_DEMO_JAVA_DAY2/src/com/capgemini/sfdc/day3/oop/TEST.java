package com.capgemini.sfdc.day3.oop;

import com.capgemini.sfdc.day2.oop.override;

abstract class Sim
{
	abstract void ConnectCall();
}
class AirtelSim extends Sim
{
	@override
	void ConnectCall()
	{
		System.out.println("Call Connected Using Airtel Sim");
	}
}
class IdeaSim extends Sim
{
	@override
	void ConnectCall() {
		System.out.println("Call Connected using Idea Sim");
	}
}
class Phone
{
	Sim s;
	Phone(Sim s){
	this.s=s;
}
	void Speck() {
		
		s.ConnectCall();
	}
}
public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone P1=new Phone(new AirtelSim());
		Phone P2=new Phone(new IdeaSim());
		P1.Speck();
		
	}

}
