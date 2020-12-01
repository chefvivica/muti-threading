package exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(){
		//calling the parent constructor 
		super("Insuffient Balance in the account");

		}
}



