package com.capgemini.sfdc.day2.oop;


class EnDemo{
	String Name;
	int phone;
	int aadhaar;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(int aadhaar) {
		this.aadhaar = aadhaar;
	}
}

	public class EnTest{
		
	public static void main(String[] args) {
		
		EnDemo obj=new EnDemo();
		obj.setName("Ashok");
		obj.setAadhaar(15454);
		obj.setPhone(99894533);
		System.out.println("name: "+ obj.getName());
		System.out.println("Aadhaar: "+ obj.getAadhaar());
		System.out.println("Phone :"+ obj.getPhone());
	}
	}

