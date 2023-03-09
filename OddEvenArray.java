package homeAssignment;
//Write a Java program to find the duplicate values of an array
import java.util.Scanner;
public class OddEvenArray {

	public static void main(String[] args) {
		int a[]=new int[5];   //array initializing
Scanner sc=new Scanner(System.in);  //scanner variable
System.out.println("Enter the elements in array: ");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();  //taking input
}
for(int i=0;i<a.length;i++) {
	if(a[i]%2==0) {
		System.out.println(a[i]+" is even");
	}
	else {
		System.out.println(a[i]+" is odd");
	}
}
	}

}
