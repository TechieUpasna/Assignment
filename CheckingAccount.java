package com.cognizant.tax;
abstract class BankAccount{  //super class
	int account_number,balance;
	//abstract methods
	abstract void deposit();
	abstract void withdraw();
}

public class CheckingAccount extends BankAccount {         //sub class
void deposit() {      //implementing abstract method
	account_number=1018;
	int deposit=1000+balance;
	System.out.println("account no.:"+account_number);
	System.out.println("previous balance:"+balance);
	System.out.println("deposit balance is:"+deposit);
}
void withdraw() {   //implement the parent class abstract method
	account_number=1025;
	int withdraw=balance-1000;
	System.out.println("account no.:"+account_number);
	System.out.println("previous balance:"+balance);
	System.out.println("withdraw balance is:"+withdraw);
}
	public static void main(String[] args) {//main method
		CheckingAccount ch= new CheckingAccount();//object of child class
	ch.deposit();
	ch.withdraw();
}
}

	


