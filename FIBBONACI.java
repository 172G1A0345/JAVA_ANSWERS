package com.capgemini.sfdc;


public class FIBBONACI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0;
		for(int i=1;i<=5;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
