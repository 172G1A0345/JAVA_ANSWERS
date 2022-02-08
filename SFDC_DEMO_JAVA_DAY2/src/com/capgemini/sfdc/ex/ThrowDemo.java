package com.capgemini.sfdc.ex;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Election.....");
		checkEligibility(20);
	}
	static void checkEligibility(int age) {
		if(age<18) {
			throw new ArithmeticException("can not vote.");
		}else {
			System.out.println("vote for india");
		}
		
	}

}
