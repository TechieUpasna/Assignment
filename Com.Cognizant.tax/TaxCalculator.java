package com.cognizant.tax;

public class TaxCalculator {  
	//instance variable
float basicSalary;
boolean citizenship;
int nettSalary;
float tax;
void calculatorTax() {  //method to calculate tax
	tax=30*basicSalary/100;
	System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);
}
void deductTax() {   //method to deduct tax
	nettSalary=(int) (basicSalary-tax);
	System.out.println("The nett Salary of the employee "+nettSalary);
}
void validatesalary() {
	if(basicSalary>100000) {  //if block
		citizenship=true;
		System.out.println("The salary and citizenship eligibility "+citizenship);
	}
	else {  //else block
		citizenship=false;
		System.out.println("The salary and citizenship eligibility "+citizenship);
	}
}


	}


