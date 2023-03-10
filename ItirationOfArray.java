package homeAssignment;
// Write a Java program to copy an array by iterating the array. 
import java.util.Scanner;
public class ItirationOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //scanner variable
		int a[]= {50,25,36,96,45};
		System.out.println("Array: ");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
int b[]=new int[5];
for(int i=0;i<a.length;i++) {
	b[i]=a[i];
}
//new array
System.out.println();
System.out.println("New array: ");
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]+" ");
}
	}

}
