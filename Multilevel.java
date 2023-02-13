package controlstatement;
class And{
	int a=96;
	int b=85;
}
class Bat extends And{
		int add=a+b;
}
class C extends Bat{
void display() {
	System.out.println("The sum of two numbers: "+add);
}
}
public class Multilevel {

	public static void main(String[] args) {
		C c=new C();
		c.display();

	}

}
