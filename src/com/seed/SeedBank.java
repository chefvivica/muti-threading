package com.seed;
import com.seed.account.Account;
import com.seed.customer.Customer;
import com.seed.transaction.DepositTransaction;
import com.seed.transaction.WithdrawTransaction;

public class SeedBank {
	public static void main(String[] args) {

		Customer firstCustomer=new Customer(1001,"Raj");
		Account firstAccount=new Account(2001,firstCustomer,20000);
		Customer secondCustomer=new Customer(1002,"Narayan");
		Account secondAccount=new Account(2001,secondCustomer,20000);

		DepositTransaction firstDeposit=new DepositTransaction(9001, secondAccount, 5001, 4000);

		DepositTransaction secondDeposit=new DepositTransaction(9002, firstAccount, 5002, 7000);
		
		secondDeposit.start();

		WithdrawTransaction secondWithdrawTransaction=new WithdrawTransaction(9004,firstAccount, secondCustomer,500);

		Thread secondWithdraw=new Thread(secondWithdrawTransaction);

		secondWithdraw.start();// this transaction must fail
	
		WithdrawTransaction firstWithdrawTransaction=new WithdrawTransaction(9003,firstAccount, firstCustomer, 500); 
		Thread firstWithdrawal = new Thread(firstWithdrawTransaction);
			firstWithdrawal.start();
		}
}
