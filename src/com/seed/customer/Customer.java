package com.seed.customer;

public class Customer {
	private int customerId;
	private String customerName;
	private boolean loanAvailed;

	public Customer(int customerId, String customerName, boolean loanAvailed) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.loanAvailed = loanAvailed;
	}

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 
	 * <h3>Description :</h3> The getter method for the customer
	 * 
	 * loan status * @return the loanAvailed
	 * 
	 */

	public boolean isLoanAvailed() {
		return loanAvailed;
	}

	/**
	 * 
	 * <h3>Description :</h3> The setter method for the customer
	 * 
	 * loan status * @param loanAvailed the loanAvailed to set
	 * 
	 */

	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}

}
