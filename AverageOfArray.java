package pattern;
import java.util.Scanner;
public class AverageOfArray {

	public static void main(String[] args) {
		int[] arr=new int[5];   //array declared
		int sum=0;
		Scanner sc=new Scanner(System.in);  //scanner reference variable
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt(); //taking input
		}
for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}
int avg=sum/arr.length;
System.out.println("average="+avg);
	}

}
