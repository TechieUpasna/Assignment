package com.cognizant.tax;

public class EmployeeTax {  //main class

	public static void main(String[] args) {  //main method
	    TaxCalculator obj=new TaxCalculator();  //object
	    obj.basicSalary=25000;
	    obj.tax=30*obj.basicSalary/100;
		obj.calculatorTax();
		obj.deductTax();
		obj.validatesalary();
		//Second case
		 obj.basicSalary=125000;
		    obj.tax=30*obj.basicSalary/100;
			obj.calculatorTax();
			obj.deductTax();
			obj.validatesalary();
	}

}
