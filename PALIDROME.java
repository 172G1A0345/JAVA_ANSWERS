package com.capgemini.sfdc;

public class PALIDROME {

	public static void main(String[] args) {
		
		int n=1213;
		int d=0;
		int temp=n;
		int rev = 0;
		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("it is palidrome");
		}
		else {
			System.out.println("it is not palidrome");
		}
		
	}	
}
