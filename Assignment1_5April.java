package io;
import java.util.Scanner;


//Question 1
class main{
	//instance variables
	int balance;
int money,amount;
Scanner sc=new Scanner(System.in);
	synchronized void deposit(int amount) {      
		this.amount=amount;
		System.out.println("Amount to deposit: ");
		amount=sc.nextInt();
balance=balance+amount;
		System.out.println("Money Deposited: "+amount);
		System.out.println("Balance: "+balance);

	}
	synchronized int withdraw(int money) {
			this.money=money;
			System.out.println("Amount to withdraw: ");
		money=sc.nextInt();
		System.out.println("Money Withdrwan: "+money);
		balance=balance-money;
		if(balance<0) {
			System.out.println("Insufficient balance!");
		}
		else {
		System.out.println("Balance: "+balance);}

		return money;

	}
}
class Thread41 extends Thread{   //thread 1
	main obj;
	Thread41(main obj){
		this.obj=obj;
	}
	public void run() {

		obj.deposit(obj.amount);
	}
}
class Thread51 extends Thread{  //thread 2
	main obj;
	Thread51(main obj){
		this.obj=obj;
	}
	public void run() {
		
			obj.withdraw(obj.money);
		
	}
}
//main class
public class Assignment1_5April {
//main method
		public static void main(String[] args)throws Exception {
			
			main obj=new main();
			Thread41 t=new Thread41(obj);
			Thread51 u=new Thread51(obj);
			t.start();
			u.start();
		}

	}

	


