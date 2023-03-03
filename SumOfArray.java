package pattern;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {     //main method
		Scanner sc=new Scanner(System.in);   //scanner variable
		int sum=0;
int array[]=new int [5];  //array declared
System.out.println("Enter elements of array: ");
for(int i=0;i<5;i++) {
	array[i]=sc.nextInt(); //taking input
}
for(int i=0;i<array.length;i++) {    //for loop
	sum=array[i]+sum;
}
System.out.println("sum= "+sum);
	}

}
