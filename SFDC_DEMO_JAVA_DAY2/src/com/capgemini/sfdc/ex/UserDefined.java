package com.capgemini.sfdc.ex;


class InvalidVoterException extends Exception{
	public InvalidVoterException(String s) {
		super(s);
		
	}
}
public class UserDefinedException{
	void checkAge(int age) throws InvalidVoterException{
		if (age<18) {
			throw new InvalidVoterException("not eligible");
		}
	}
}

public class UserDefined {

	public static void main(String[] args) {
		

	}

}
