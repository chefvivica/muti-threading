package com.seed.security;
import com.seed.account.Account;
import com.seed.customer.Customer;
import exception.UnAuthorizedWithdrawTransactionException;


public class Security {
	public void authorization(Account account,Customer customer)

		throws UnAuthorizedWithdrawTransactionException{

		/*

		* Testing if the customerId of the customer and the

		* customerId of the customer to whom the account belongs

		* are the same

		*/

			if(account.getCustomer().getCustomerId()!=customer.getCustomerId()){

		/* Throwing an exception if the customer Id's doesn't

		* match

		*/

				throw new UnAuthorizedWithdrawTransactionException();

		}

	}
}
