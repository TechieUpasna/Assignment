package com.cognizant.tax;

public class TaxCalculator {
float basicSalary;
boolean citizenship;
int nettSalary;
float tax;
void calculatorTax() {
	System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);
}
void deductTax() {
	nettSalary=(int) (basicSalary-tax);
	System.out.println("The nett Salary of the employee "+nettSalary);
}
void validatesalary() {
	if(basicSalary>100000) {
		citizenship=true;
		System.out.println("The salary and citizenship eligibility "+citizenship);
	}
	else {
		citizenship=false;
		System.out.println("The salary and citizenship eligibility "+citizenship);
	}
}


	}


