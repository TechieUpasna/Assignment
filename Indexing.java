package pattern;
import java.util.Scanner;
public class Indexing {

	public static void main(String[] args) {   //main method
		int a[]=new int[5];  //array declaration
		Scanner sc=new Scanner(System.in);  //scanner reference variable
System.out.println("Enter the elements: ");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt(); //taking input
}
System.out.println("Enter the element to be searched: ");
int x=sc.nextInt();
for(int i=0;i<a.length;i++) {
if(x==a[i]) {
	System.out.println("Index position is: "+i);
}
}
}
	}


