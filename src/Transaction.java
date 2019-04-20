/**
 * 
 * @author Jiaxin Lu
 *
 *Transaction class illustrates the activity when actions in a sequence
 *are taken on the debit card
 */

public class Transaction{

	public DebitCard card = new DebitCard(12345, 5000);  //initialize a debit card instance
	
	/*transation1 method is a sequence of deposit activities
	 * which used to form concurrent transactions with other thread*/
	public void transaction1(){
		try{
			for (int i = 5; i > 0; i--){
				card.withdraw(500);
				System.out.println("Balance is " + card.getBalance());
			}
		}catch (Exception e){
			System.out.println("Thread interrupted");
		}
	}

	/*transation2 method is a sequence of withdraw activities
	 * which used to form concurrent transactions with other thread*/
	public void transaction2(){
		try{
			for (int i = 10; i > 0; i--){
				card.withdraw(20);
			}
		}catch (Exception e){
			System.out.println("Thread interrupted");
		}
	}
	
	
}