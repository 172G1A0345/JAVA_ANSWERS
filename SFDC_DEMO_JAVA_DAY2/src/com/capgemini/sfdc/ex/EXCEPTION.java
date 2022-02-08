package com.capgemini.sfdc.ex;

import java.util.Scanner;

public class EXCEPTION {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num1=scn.nextInt();
			System.out.println("Enter a number");
			int num2=scn.nextInt();
			int num3=0;
			
			try {
				num3 = num1/num2;
			}
			catch(ArithmeticException ae) {
				System.out.println("not divisible");
			}
			System.out.println(num3);
		}

	}

}
