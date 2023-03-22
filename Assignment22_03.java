package exceptionHandling;
import java.util.Scanner;
public class Assignment22_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//outer try
			try {
		
			//1st inner block
			try {
			//null pointer
			String s=null;
			System.out.println(s.length());}
			
			catch(NullPointerException e) {
				System.out.println(e);
				System.out.println("Null pointer exception");
			}
			
			//2nd inner block
			try {
			//ArrayIndexOutOfBound Exception
			int arr[]=new int [5];
			arr[7]=10;}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("Array Index Out Of Bound Exception");
			}
			try {
			//number format exception
			String b="Upasna";
				int n=Integer.parseInt(b);
			System.out.println(b);}
			
			catch(Exception e) {
				System.out.println(e);}
			
			//Mismatch input
			try {
				System.out.println("Enter a number:");
				int val=sc.nextInt();   //taking input
			}
			catch(Exception e) {
				System.out.println(e);
				System.out.println("it should be a number");
			}
			
			//Arithmetic Exception
			int p=50/0;
			System.out.println(p);
			}
			
			
			//outer catch block
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("Arithmetic exception");}
			
			finally {
				System.out.println("Program executed!");
			}
	}
}
