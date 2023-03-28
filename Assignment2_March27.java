package thread;

public class Assignment2_March27 {

	public static void main(String[] args) {
		//reference variables
		Thread t=new Thread("Even");
		Thread u=new Thread("Odd");
		
		//first thread
		System.out.println(t.getName());
		t.start();
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		} 
		
		System.out.println();
		
		//second thread
		System.out.println(u.getName());
		u.start();
		for(int i=1;i<100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		

	}

}
