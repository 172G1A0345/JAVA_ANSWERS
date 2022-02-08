package com.capgemini.sfdc.str;

import java.util.ArrayList;

public class Wrappaer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100";
		String str2 = "200";
		String str3;

		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		int num3 = num1 + num2;
		str3 = Integer.toString(num3);
		System.out.println(str3);
		
		int a=10;
		Integer i=Integer.valueOf(a);
				Integer i1=a;
				System.out.println(a+" "+i+" "+i1);
				
				ArrayList<Integer>arraylist=new ArrayList<Integer>();
				arraylist.add(16);
				arraylist.add(35);
				System.out.println(arraylist.get(0));
				System.out.println(arraylist.get(1));
				
				ArrayList<String>arraylist1=new ArrayList<String>();
				arraylist1.add("Ashok");
				System.out.println(arraylist1.get(0));
				
	}


}
