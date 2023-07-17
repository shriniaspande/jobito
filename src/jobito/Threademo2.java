package jobito;

public class Threademo2 implements Runnable{

	@Override
	public void run() {                           // its move to runnable to running state
		// TODO Auto-generated method stub
		System.out.println("it is Runnable");
	}
       public static void main(String[] args) {
	
    	   Threademo2 td=new Threademo2();
    	   Thread th=new Thread(td);               // using the constructor thread   .1 thread created and  new state
    	   th.start();                             // thread moves  new state to runnable 

	
	}
}
