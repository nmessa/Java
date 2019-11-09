
public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingsAccount(double amount, double rate)
	{
		super(amount);
		interestRate = rate;
	}
	
	public void addInterest()
	{
		double interest = getBalance() * interestRate / 100.0;
		deposit(interest);
	}
}
