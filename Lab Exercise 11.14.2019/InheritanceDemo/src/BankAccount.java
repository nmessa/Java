
public class BankAccount {
	
	private double balance;
	
	public BankAccount(double amt)
	{
		balance = amt;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double d)
	{
		balance += d;
	}
	
	public void withdraw(double d)
	{
		balance -= d;
	}
}
