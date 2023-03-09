package homeAssignment;
//Write a Java program to insert an element (specific position) into an array. 
import java.util.Scanner;
public class InsertionOfElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //scanner variable
		int a[]=new int[5];  //array initialization
		//taking inputs
		System.out.println("Enter the number that to be inserted");
		int num=sc.nextInt();  
		System.out.println("Enter the index number at which the number to be inerted:");
		int index=sc.nextInt();
		a[index]=num;
		//updated array
		System.out.println("Updated array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
