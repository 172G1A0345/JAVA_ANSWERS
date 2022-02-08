package com.capgemini.sfdc.ex;

public class Finnaly {

	public static void main(String[] args) {
		
		try {
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block is executed");
		}
	}

}

