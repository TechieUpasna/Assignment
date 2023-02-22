package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {  
	    TaxCalculator obj=new TaxCalculator();
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
