package com.capgemini.sfdc.ex;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("Start");
		int[] marksarray= {84,54,25,64};
		try (Scanner scn = new Scanner(System.in)) {
			int n=scn.nextInt();
			
			try
			{
				System.out.println(marksarray[n]);
			}
			catch(ArrayIndexOutOfBoundsException a) {
				a.printStackTrace();
				System.out.println("wrong index");
			}
		}
	}

}
