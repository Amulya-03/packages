package com.bank.app;
import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class BankApp {
	public static void main(String[] args) 
	{
		BankAccount b = new BankAccount();
		b.setAccountNumber("ATR0000000342");
		b.setbalance(25000);
		

		Customer c = new Customer();
		c.setCustomerName("Archana");
		c.setCustomerId(121);

		b.showAccountDetails();
		System.out.println();
		c.showCustomerDetails();
	}
}

