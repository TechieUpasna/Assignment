package exceptionHandling;
import java.util.Scanner;
public class NestingOfTryBlock {
public void nesting() {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		try {
		int b[]=new int [a];
		System.out.println("Enter a value :");
		b[50]=sc.nextInt();}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch(Exception e) {
			System.out.println("Input mismatch");
		}
		try {
		int c=a+96/0+45;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Error resolved!");
		}
		}
	catch(Exception e) {
		System.out.println("Input Mismatch");
	}
	finally{
		System.out.println("Finally....I did it!");
	}
	}
	


	public static void main(String[] args) {
		NestingOfTryBlock obj=new NestingOfTryBlock();
		obj.nesting();

	}

}
