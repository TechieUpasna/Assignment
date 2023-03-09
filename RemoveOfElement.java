package homeAssignment;
//Write a Java program to remove a specific element from an array.
import java.util.Scanner;
public class RemoveOfElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //scanner variable
		int a[]= {50,25,36,96,45};
		System.out.println("Array: ");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Enter the element from the array that to be removed: ");
int num=sc.nextInt();
for(int i=0;i<a.length;i++) {
	if(a[i]==num) {
		a[i]=a[i]-num;
	}
}
//updated array
System.out.println("Updated array:-");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
	}

}
