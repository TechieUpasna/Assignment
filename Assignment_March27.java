package thread;


//creating two threads 
public class Assignment_March27 extends Thread{
public void run() {
	System.out.println("Hi...I'm a thread");
}
//main method
	public static void main(String[] args) {
		//reference variables
		 Assignment_March27 t=new  Assignment_March27();
		 Assignment_March27 t1=new  Assignment_March27();
		 
		 //first thread
		    t.start();
			t.setName("First Thread");
			String s=t.getName();
			System.out.println(s);
			
			
			//second Thread
			t1.start();
			t1.setName("Second Thread");
			String s1=t1.getName();
			System.out.println(s1);
			
			
			
	}

}
