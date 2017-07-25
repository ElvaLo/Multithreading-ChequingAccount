/**
 * 
 * @author Jiaxin Lu
 *
 *ThreadDemo class extends the Thread class
 *It creates threads and starts running them
 */

public class ThreadDemo extends Thread{
	private Thread T;
	private String threadName;
	Transaction ts;
	
	/* ThreadDemo constructor*/
	ThreadDemo(String name, Transaction transaction){
		threadName = name;
		ts = transaction;
	}
	
	public void run(){
		//synchronized() here makes the transaction isolated
		//if synchronized is absent here, thread 1 and tread 2 will compete 
		synchronized(ts){    
			ts.transaction1();	                //call the transactiion1 method to mimic a sequent transaction 		
		}		
		System.out.println ("===" + threadName + " exiting" + "===");
	}
	
	/*start() method overrides the Thread class*/
	 public void start () {
	    System.out.println("===" + "Starting " +  threadName + "===");
	    if (T == null) {
	       T = new Thread (this, threadName);   //instantiate a Thread object
	       T.start ();                          //start() method executes a call to run() method*/
	    }
	 }

}
