/**
 * 
 * @author Jiaxin Lu
 *
 *DevitCard class represents a debit card 
 *that has 2 simple functions withdraw money and deposit money
 */

public class DebitCard {
	private int accountNum;
	private double balance;
	
	/*CreditCard constructor */
	public DebitCard (int accountNum1){
		this.accountNum = accountNum1;
		balance= 0;
	}
	
	/*CreditCard constructor */
	public DebitCard (int accountNum2, double amount){
		this.accountNum = accountNum2;
		balance = amount;
	}
	
	/*The withdraw method is one of the debit card activity */
	//debit card object requires a lock when calling this method
	public synchronized void withdraw (double amount){
		if (balance - amount < 0){                      //check if balance is sufficient
			System.out.println("Balance Insufficient; waiting for deposit...");	
			try{
				wait();     //cause the current thread to release the lock                            
			}catch(Exception e){}
		}
		
			balance = balance - amount;
			System.out.println("withdraw completed...");
			//System.out.println("Balance is " + this.getBalance());
		

	}
	
	/*The withdraw method is one of the debit card activity */
	//debit card object requires a lock when calling this method
	public synchronized void deposit (double amount){		
		balance = balance + amount;
		System.out.println("Deposit complete successfully...");
		notify();  //wakes up the thread that waiting on the object
	}
	
	/*displayDetails() method prints the details of a DebitCard instance*/
	public void displayDetails(){
		System.out.println ("Account number is " + accountNum);
		System.out.println ("Balance is " + balance);
	}
	
	/*getAccountNum() method returns the account number*/
	public int getAccountNum(){
		return accountNum;
	}
	
	/*getAccountNum() method returns the account balance*/
	public double getBalance(){
		return balance;
	}
	

}
