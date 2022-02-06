


package com.capgemini.sfdc;

import java.util.Scanner;


public class PRINT {

	public static void main(String[] args) {
		 int i;
		 int j;
		 Scanner obj=new Scanner(System.in);
		 
		 int n=obj.nextInt();
		 
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
