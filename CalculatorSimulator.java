package homeAssignment;
import java.util.Scanner;


//custom exceptions
class CountryNotValidException extends Exception{
	public CountryNotValidException(String str) {  //constructor
		super (str);
	}
}

class EmployeeNameinvalidException extends Exception{
	public  EmployeeNameinvalidException(String str) 
	{  
		super (str);
	}
}
class TaxNotEligibleException extends Exception{
	public  TaxNotEligibleException(String str) {
		super (str);
	}
}


 class TaxCalculator {
	
	//method
public void calculateTax(String empName, boolean isIndian, double empSal) throws Exception{
	double taxAmount;
	//outer try block
		//1st try block

		if(isIndian!=true) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
	
	//2nd try block

		if(empName==null) {
			throw new EmployeeNameinvalidException("The employee name cannot be empty");
		}
	
	
	if(empSal > 100000 && isIndian==true) {
		taxAmount=empSal*8/100;
		System.out.println(taxAmount);    }
		
	
	else if(50000<empSal && isIndian==true) {
		if(empSal<100000) {
			taxAmount=empSal*6/100;
			System.out.println(taxAmount);
		}
	}
	else if(30000<empSal && isIndian==true) {
		if(empSal<50000) {
			taxAmount=empSal*5/100;
			System.out.println(taxAmount);}
		
	}
	else if(10000<empSal && isIndian==true) {
		if(empSal<30000) {
			taxAmount =empSal*4/100 ;
			System.out.println(taxAmount);
		}}
	
	
	else {
		throw new TaxNotEligibleException("The employee does not need to pay tax");
	}           
	
	
		

 } }
 
 //main class
public class CalculatorSimulator {
	public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);

		TaxCalculator obj=new TaxCalculator();
	try {
		obj.calculateTax("Ron",false,34000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	try {
		obj.calculateTax("Tim",true,1000);}
	catch(Exception e) {
	System.out.println(e.getMessage());	
	}
	try {
		obj.calculateTax("Jack",true,55000);}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	try {
		obj.calculateTax(null,true,30000);}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}

}}
