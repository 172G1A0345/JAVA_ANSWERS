package com.capgemini.sfdc.day2;

public class MethodDemo {

	static String returnHello() {
		return "AShok";
	}
	static void hello(String name)
	{
		System.out.println("Print="+name);
	}
	void print()
	{
		System.out.println("NONSTATIC");
	}
	public static void main(String[] args)
	{
		MethodDemo scn=new MethodDemo();
		System.out.println("main");
		String output=returnHello();
		System.out.println(output);
		hello("Ashok");
		scn.print();
	}
}
