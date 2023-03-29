package thread;

class ThreadClass{
	synchronized void print(int num) {
		for(int i=num;i<=10;i++) {
			System.out.println(num+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
//thread 1
class T1 extends Thread{
	ThreadClass mt;
	
	T1(ThreadClass mt){
		this.mt=mt;
	}
	public void run() {
		mt.print(5);    //5
	}
}
//thread2
class T2 extends Thread{
	ThreadClass mt;
	T2(ThreadClass mt){
		this.mt=mt;
	}
	public void run() {
		mt.print(3);        //3
	}
}
//thread3
class T3 extends Thread{
	ThreadClass mt;
	T3(ThreadClass mt){
		this.mt=mt;
	}
	public void run() {
		mt.print(4);        //4
	}
}

public class Assignment_29March {

	//main method
	public static void main(String[] args) {
		ThreadClass obj=new ThreadClass();
		T1 t1=new T1(obj);
		T2 t2=new T2(obj);
		T3 t3=new T3(obj);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
