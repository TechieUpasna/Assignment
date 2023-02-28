package com.cognizant.tax;
interface Person{
	void speak();
}
class Student implements Person{
	public void speak() {
		System.out.println("Student");
	}
}
class Teacher implements Person{
	public void speak() {
		System.out.println("Teacher");
	}
}
public class Question4 {

	public static void main(String[] args) {
		Student st=new Student();
		st.speak();
		Teacher t=new Teacher();
		t.speak();

	}

}
