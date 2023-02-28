package com.cognizant.tax;


abstract class Shape{   //super class
	abstract void calculateArea();   //abstract method
}
 class Circle1 extends Shape{   //sub class
	void calculateArea() {
		
		System.out.println("Area of circle");
	}
}
  class Rectangle1 extends Shape{
	void calculateArea() {
		System.out.println(" Area of Rectangle");
}}
 public class Question {   //main class

	public static void main(String[] args) {//main method
		Circle1 cir=new Circle1();   //object of Circle class
		cir.calculateArea();  
Rectangle1 rect=new Rectangle1();   //object of rectangle class
rect.calculateArea();
	}

 }

