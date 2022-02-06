package com.capgemini.sfdc;

import java.util.Scanner;

public class SUM_AND_PRODUCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=num1+num2;
		int num4=num1*num2;
	  System.out.println("SUM OF TWO NUMBERS="+num3);
	  System.out.println("PRODUCT OF TWO NUMBERS="+num4);
	}
}
