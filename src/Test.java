/**
 * 
 * @author Jiaxin Lu
 *
 *Test class represents the scenario that 2 threads try to deposit into the debit card
 *(assume there are card owner and supplement card)
 *
 */

public class Test {
	
	public static void main(String[] args) {
		/**
		 * This main method tests the synchronization feature
		 */
		/**
		Transaction transaction = new Transaction();  //Create a transaction object
				
		//Create and initialize ThreadDemo object
		ThreadDemo T1 = new ThreadDemo("Thread - 1", transaction);
		ThreadDemo T2 = new ThreadDemo("Thread - 2", transaction);
		
		T1.start();  //this calls the start() method of Thread class
		T2.start();
	
		
	


	
		/**
		 * This main method tests the inter-thread communication, 
		 * which allows synchronized methods to communicate with each other
		 */
		///**
		final DebitCard card = new DebitCard(12345, 5000);
		new Thread(){
			public void run(){
				card.withdraw(9000);  //withdrawing 9000 causes current thread to release the lock and waiting for deposit
			}
		}.start();

		new Thread(){
			public void run(){
				card.deposit(5000);
			}
		}.start();	
		
		System.out.println("Balance is " + card.getBalance());
		//**/
		

	}

}
