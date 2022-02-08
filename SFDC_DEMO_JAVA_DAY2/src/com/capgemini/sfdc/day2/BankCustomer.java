package com.capgemini.sfdc.day2;

public class BankCustomer {
		
		static String ifsc;
		int accNum;
		String CustName;
		double Balance;
}
class DemoClass{
	
	public static void main(String[] args) {
		BankCustomer obj=new BankCustomer();
		BankCustomer.ifsc="SBIN00088";
		System.out.println(BankCustomer.ifsc);
		obj.accNum=153115454;
		obj.CustName="Ashok";
		obj.Balance=255.02;
		System.out.println(obj.CustName);
		System.out.println(obj.Balance);
		System.out.println(obj.accNum);
	}

}
