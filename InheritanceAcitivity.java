package com.cognizant.shapes;

public class InheritanceAcitivity {

	public static void main(String[] args) {
		Manager man = new Manager(126534,"Peter","Chennai India",237844, 65000);
		Trainee train=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		man.calculateSalary();
		train.calculateSalary();
		man.calculateTransportAllowance();
		train.calculateTransportAllowance();
		
		

	}

}
class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	Employee(long Id,String Name,String Address,long Phone){
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;}
		void calculateSalary() {
			double a=basicSalary*specialAllowance/100;
			double b=basicSalary*Hra/100;
	double salary=basicSalary+a+b;
	System.out.println(salary);
		}
		void calculateTransportAllowance() {
			double transportAllowance=10*basicSalary/100;
			System.out.println(employeeName+ "'s Transport Allowance is: "+transportAllowance);
		}
	}
class Manager extends Employee{
	public Manager(long Id,String Name,String Address,long Phone, double Salary){
		super(Id, Name, Address, Phone);
		super.basicSalary=Salary;
		
	}
	void calculateTransportAllowance() {
		double transportAllowance=15*basicSalary/100;
		System.out.println(employeeName+ "'s Transport Allowance is: "+transportAllowance);}
}
class Trainee extends Employee{
	Trainee(long Id,String Name,String Address,long Phone, double Salary){
		super(Id, Name, Address, Phone);
		super.basicSalary=Salary;
	}
}