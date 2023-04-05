package io;
import java.io.*;
import java.util.Scanner;

//Question 2
public class Assignment2_5April {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //scanner object
		System.out.println("Choose a number from 1 or 2:- ");
		System.out.println("PRESS 1 if you want to store the data or PRESS 2 to read the content of the data");
		int num=sc.nextInt();
		if(num==1) {
		try {
			FileOutputStream f=new FileOutputStream("D:\\store.txt");  //destination
			System.out.println("Enter the data that to be stored in the file: ");
			String s=sc.next();  //taking input
			byte b[]=s.getBytes();  //converting string into byte
			f.write(b);
			f.close();
			sc.close();
			System.out.println("Done!");
		}
		catch(Exception e) {
			System.out.println(e);
		}}
		else {
			try {
				FileInputStream f=new FileInputStream("D:\\store.txt");
				int i=0;
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
				f.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

	}

}
