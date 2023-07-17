package jobito;

public class ThreaDemo extends Thread{       //   Thread by extends 
	
	public void run() {                      // we use the run method
		
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		ThreaDemo td=new ThreaDemo();                   // Thread is create a new 
		td.start();                               // start to 
	}
}
