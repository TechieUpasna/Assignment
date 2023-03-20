package exceptionHandling;

public class Assignment {
	
	//Division by zero
public void division() {
	try {
		int i=50/0;
		System.out.println(i);
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Invalid division");
	}
}
//String parsed to a numeric variable
public void StringParsed() {
	try {
	String b="Upasna";
	int n=Integer.parseInt(b);
System.out.println(b);}
catch(Exception e) {
System.out.println(e);
System.out.println("format mismatch");
}}


//accessing an invalid calculation
public void calculator(){
	try {
		
	int a=50/0+96+45/0;}
	catch(Exception e) {
		System.out.println("Calculation invalid");
		
	}
}
//Accessing an invalid index in array : Print "Array index is invalid".
public void index() {
	try {
	int arr[]=new int [5];
	arr[7]=10;}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Array index is invalid");
	}
}
//main method
	public static void main(String[] args) {
		System.out.println("Exception handling completed");
		Assignment obj=new Assignment();
		obj.division();
		obj.StringParsed();
		obj.calculator();
		obj.index();
	}

}
