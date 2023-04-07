package collection;
import java.util.*;
public class Assignment_7April {
	ArrayList<Integer>A1=new ArrayList<Integer>();
	ArrayList<Integer> A2=new ArrayList<Integer>();
public void storeEvenNumber(int N) {
	
	System.out.println("ArrayList (A1) is created");
	for(int i=0;i<=N;i++) {
		if(i%2==0) {
			A1.add(i);
		}
	}
}
public void printEvenNumber() {
	Iterator itr=A1.iterator();
	System.out.println("ArrayList (A2) is created");
	for(int i=0;i<A1.size();i++) {
		int j=2*i;
		A2.add(j);
	}
	System.out.println(A2);
}
public void retrieveEvenNumber(int N) {
	if(A1.contains(N)) {
		System.out.println(N);
	}
	else {
		System.out.println(0);
	}
}
	public static void main(String[] args) {
		Assignment_7April a=new Assignment_7April();
		a.storeEvenNumber(10);
		a.printEvenNumber();
		a.retrieveEvenNumber(100);
	}

}
