package com.seed.account;
import com.seed.customer.Customer;

public class Account {
	private int accountNo;

	/*
	 * 
	 * The customer Id of the customer to whom the account belongs
	 * 
	 * to.
	 * 
	 */

	private Customer customer;

	/*
	 * 
	 * The bank balance of the account
	 * 
	 */

	protected double balance;

	/**
	 * 
	 * <h3>Description :</h3> The parameterized constructor if the
	 * 
	 * Account class * @param accountNo the account Number of the account * @param
	 * custId the customer Id to whom the account belongs * @param balance the
	 * account balance
	 * 
	 */

	public Account(int accountNo, Customer customer, double balance) {

		this.accountNo = accountNo;

		this.balance = balance;

		this.customer = customer;

	}

	/**
	 * 
	 * <h3>Description :</h3> The no-arg constructor for Account
	 * 
	 */

	public Account() {
	}

	/**
	 * 
	 * <h3>Description :</h3> The getter method for the Account
	 * 
	 * number * @return the accountNo
	 * 
	 */

	public int getAccountNo() {

		return accountNo;

	}

	/**
	 * 
	 * <h3>Description :</h3> The setter method for the Account
	 * 
	 * ER/CORP/CRS/ED112/007 CONFIDENTIAL Version No. 1.0 17 of 32
	 * 
	 * Asreet-Tech.com Limited Lab Guide for <Co urse Nam e>
	 * 
	 * number * @param accountNo the accountNo to set
	 * 
	 */

	public void setAccountNo(int accountNo) {

		this.accountNo = accountNo;

	}

	/**
	 * 
	 * <h3>Description :</h3> The getter method for the Account
	 * 
	 * balance * @return the balance
	 * 
	 */

	public double getBalance() {

		return balance;

	}

	/**
	 * 
	 * <h3>Description :</h3> The setter method for the Account
	 * 
	 * balance * @param balance the balance to set
	 * 
	 */

	public void setBalance(double balance) {

		this.balance = balance;

	}

	/**
	 * 
	 * <h3>Description :</h3> The getter method for the Account's
	 * 
	 * customer * @return the customer
	 * 
	 */

	public Customer getCustomer() {

		return customer;

	}

	/**
	 * 
	 * <h3>Description :</h3> The setter method for the Account's
	 * 
	 * customer * @param customer the customer to set
	 * 
	 */

	public void setCustomer(Customer customer) {

		this.customer = customer;

	}
}
