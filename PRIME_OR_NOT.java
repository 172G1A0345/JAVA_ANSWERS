package com.capgemini.sfdc;

import java.util.Scanner;
public class PRIME_OR_NOT {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n%2==0)
		{
			System.out.println("its not prime");
		}
		else
		{
			System.out.println("its  prime");
		}
		
	}
}
