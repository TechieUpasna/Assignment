package controlstatement;
class A{
	int a=52;
	int b=96;
	
}
class B extends A{
	void sum() {
		int add=a+b;
		System.out.println("The sum of numbers: "+add);
	}
}
public class Single {

	public static void main(String[] args) {
		B b=new B();
		b.sum();

	}

}
