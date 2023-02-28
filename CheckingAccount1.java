package com.cognizant.tax;
interface BankAccount1{
	void deposit1();
	void withdraw1();
}
public class CheckingAccount1 implements BankAccount1 {
	public void deposit1() {
	System.out.println("hello");
  
}
	public void withdraw1() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
	CheckingAccount1 ch=new CheckingAccount1();
	ch.deposit1();
	ch.withdraw1();

	}

}
