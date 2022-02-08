package com.capgemini.sfdc.day2;

public class CalcDemo {

	static void printNum() {
	int num=10;
		System.out.println(num);
	}
	static void printSum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	static int returnNum(int num3) {
		return num3;
	}
	static int PrintSum(int num4,int num5) {
		int num6=num4+num5;
		return num6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
		printSum(10,10);
		int output=returnNum(10);
		System.out.println(output);
		int output2=PrintSum(10,20);
		System.out.println(output2);
	}

}
