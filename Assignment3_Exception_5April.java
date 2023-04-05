package io;
import java.util.*;

//user defined
class MyException extends Exception{
	public MyException() {  //constructor
	}
}
public class Assignment3_Exception_5April {
	
	public void display() {//method
		try {
			//Arithmetic Exception
			int i=50/0;
			System.out.println(i);}
		catch(ArithmeticException e) {
			System.out.println("Invalid division");
		}
		try {
			//null pointer
			String s=null;
			System.out.println(s.length());
			}
		catch(NullPointerException e) {
			System.out.println("Index is invalid");
		}
			try {
			//ArrayIndexOutOfBound Exception
			int arr[]=new int [5];
			arr[7]=10;}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index is invalid");
			}
			try {
			//number format exception
			String b="Upasna";
					int n=Integer.parseInt(b);
			System.out.println(b);
			}
			catch( InputMismatchException e) {
				System.out.println("Format mismatch");
			}
			
			catch(Exception e) {
				System.out.println("Exception encountered");
			}
			finally {
				System.out.println("Exception Handling Completed");
			}
	}
	public  void custom(int a)throws MyException{
		try {
			if(a>0) {
			throw new MyException();	
			}
		}
		catch(MyException pallabi) {
			System.out.println("My Exception[pallabi]");
		}
	}
	
	public static void main(String[] args) throws MyException {
		Scanner sc=new Scanner(System.in);  //scanner object
		Assignment3_Exception_5April obj=new Assignment3_Exception_5April();
		System.out.println("Enter a integer number: ");
		obj.custom(sc.nextInt());
		obj.display();
		
		

	}

}
