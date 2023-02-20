package com.cognizant.shapes;
class Parent{
	Parent(int Eg){
	 Eg=50;
	System.out.println("Parent class eg value: "+Eg);
	}
}
public class SuperEg2 extends Parent {  //main class
 SuperEg2(int Eg) {
	 super(Eg);
	System.out.println("Child class Eg value: "+Eg);
}
	public static void main(String[] args) { //main method
		SuperEg2 obj =new SuperEg2(52);
		

	}

}
