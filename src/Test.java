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
		Transaction transaction = new Transaction();  //Create a transaction object
		
		
		//Create and initialize ThreadDemo object
		ThreadDemo T1 = new ThreadDemo("Thread - 1", transaction);
		ThreadDemo T2 = new ThreadDemo("Thread - 2", transaction);
		
		T1.start();  //this calls the start() method of Thread class
		T2.start();

		
/**		
		DebitCard d = new DebitCard (12345, 5000);
			
		d.withdraw(500);
		System.out.println ("Print balance: " + d.getBalance());
		d.withdraw(200);
		System.out.println ("Print balance: " + d.getBalance());
		d.deposit(500);
		System.out.println ("Print balance: " + d.getBalance());
		System.out.println ();

		d.displayDetails();   
**/		
	}

}
