package com.capgemini.sfdc.day2.oop;

 class Parent {
	 int num2;
 }
 class Child extends Parent{
	int num;
 }
public class Inheritance{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.num=10;
		System.out.println(ch.num);
		ch.num2=20;
		System.out.println(ch.num2);

	}

}
