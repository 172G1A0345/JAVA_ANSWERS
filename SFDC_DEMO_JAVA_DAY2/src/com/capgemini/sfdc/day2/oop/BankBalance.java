package com.capgemini.sfdc.day2.oop;



class Employee {
	private int empid;
	private String name;
	private double salary;
		// TODO Auto-generated method stub
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		

	}


public class BankBalance {
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void deposite(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		double withdraw = 0;
		balance=balance-withdraw;
	}

	public static void main(String[] args) {
		BankBalance B1=new BankBalance();
		B1.deposite(1000);
		B1.withdraw(300);
		System.out.println(B1.getBalance());
		B1.setBalance(10000);
		System.out.println(B1.getBalance());
	
		

	}

}
