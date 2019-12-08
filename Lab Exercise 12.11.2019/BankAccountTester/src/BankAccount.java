//BankAccount Class
//Author: nmessa
//Date: 12/11/2019

public class BankAccount {
	private String name = "";
	private double balance = 0;	
	
	public BankAccount(String n, double b)
	{
		name = n;
		balance = b;
	}	

	public void deposit(double amt) {
		balance += amt;
	}

	//The withdraw method will throw an IllegalArgumentException
	//if you attempt to overdraw your account
	public void withdraw(double amt)throws IllegalArgumentException {
		if (balance < amt)
		{
			String s = "Withdrawal amount must be greater than 0 and " + 
				"can’t exceed the balance.";
			IllegalArgumentException e = new IllegalArgumentException(s);
			throw e;
		}
		else
		{
			balance -= amt;
		}
			
	}
	
	public double getBalance()	
	{
		return balance;
	}
}
