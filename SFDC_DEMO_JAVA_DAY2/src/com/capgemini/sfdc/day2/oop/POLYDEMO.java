package com.capgemini.sfdc.day2.oop;


class Calc{
	static void addnums(int i,int j) {
	System.out.println(i+j);
}
	static void addnums(int i,int j,int k) {
		System.out.println(i+j+k);
	}

}
public class POLYDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc.addnums(10,20);
		Calc.addnums(10,20,30);
	}

}
