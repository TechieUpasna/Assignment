package com.cognizant.shapes;
import java.util.Scanner;
 class AdvancedArithmetic {
void divisor_Sum(int n) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=input.nextInt();
	if(num<1000) {
	int sum=0;
	for(int i=1; 1<num;i++)
	{
		if(num%i==0) {
			System.out.println(" "+i);
			System.out.print("Now sum is: ");
			System.out.println(sum=sum+i);
		}
	}
}}}
class MyCalculator extends AdvancedArithmetic{
	public static void main(String[] args) {
		AdvancedArithmetic sc=new AdvancedArithmetic();
		sc.divisor_Sum(0);

	}	}


