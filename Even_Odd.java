package controlstatement;
import java.util.Scanner;
public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		int  a= sc.nextInt();
		if(a%2==0) {
		System.out.println("True");	
		}
		else {
			System.out.println("False");
		}
	}

}
