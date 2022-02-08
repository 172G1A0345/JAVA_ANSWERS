package com.capgemini.sfdc.str;



public class StringDemo {

	public static void main(String[] args) {
		
		String Str="suresh";
		String Str2="SURESH";
		String Str1=new String("Ashok");
		System.out.println(Str.charAt(4));
		System.out.println(Str.length());
		
		
		//Equlas method
		System.out.println(Str==Str2);
		System.out.println(Str.equalsIgnoreCase(Str2));
		System.out.println(Str.equals(Str1));
		
		//SubString
		System.out.println(Str.substring(4));
		System.out.println(Str.substring(2,4));
		
		/*SPLLIT
		String Str3="Welcome to the Capgemini";
		String arr[]=Str3.split(" ");
		char[] token;
		fo(String token:arr){
			System.out.println(token);*/
		System.out.println( Str.indexOf('s'));
		System.out.println( Str.indexOf('h'));
		System.out.println( Str.endsWith("sh"));
		System.out.println( Str.startsWith("sh"));
		}
		
	}


