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
	public void withdraw (double amount){
		if (balance - amount < 0){                      //check if balance is sufficient
			System.out.println("Balance Insufficient");			
		}
		else balance = balance - amount;
	}
	
	/*The withdraw method is one of the debit card activity */
	public void deposit (double amount){		
		balance = balance + amount;
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
