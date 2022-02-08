package com.capgemini.sfdc.day3.oop;

class Veg
{
	
}
	class Carrot extends Veg
	{
		void Halwa() {System.out.print("Halwa Is Ready");}
	}
		
	class Pottato extends Veg
	{
		void fried() {
			
		}
	}
	
	class VegShop
	{
		Veg Shell(String VegName){
			if(VegName.equals("Pottato"))return new Pottato();
			if(VegName.equals("Carrot"))return new Carrot();
			System.out.println("Item Is Available");
			return null;
		}
	}
public class TEST1 {

	public static void main(String[] args) {
		VegShop Shop=new VegShop();
		
		Veg V=Shop.Shell("Carrot");
		
		((Carrot)V).Halwa();

	}
}
