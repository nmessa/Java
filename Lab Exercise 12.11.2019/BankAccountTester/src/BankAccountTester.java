/**
 * @(#)BankAccountTester.java
 *
 * BankAccountTester application
 *
 * @author 
 * @version 1.00 2019/12/11
 */

import java.util.*;

public class BankAccountTester {
    
    public static void main(String[] args) {
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Declare variables
    	String userName;
    	double balance;
    	double amount;
    	boolean ok = false;
    	
    	//Get account information
    	System.out.print("Enter the account holder: ");
    	userName = reader.nextLine();
    	System.out.print("Enter the amount of your initial balance: ");
    	balance = reader.nextDouble();
    	
    	//Construct a BankAccount object
    	BankAccount myAccount = new BankAccount(userName, balance);
    	
    	//Make a deposit
    	myAccount.deposit(505.22);
    	System.out.println("Your current balance is: " + myAccount.getBalance());
    	
    	//Attempt to make a withdrawal
    	while (!ok)
    	{
    		try
    		{
    			System.out.print("Enter the amount to withdraw: ");
    			amount = reader.nextDouble();
    			myAccount.withdraw(amount);
    			ok = true;
    		}
    		catch(IllegalArgumentException e)
    		{
    			System.out.println("You do not have enough money");
    			System.out.println("Your current balance is " + 
    				myAccount.getBalance());
    		}
    	}
    	
    	System.out.println("The " + userName + 
    		" account balance is $" + myAccount.getBalance());
    }
}
//Sample Output
//Enter the account holder: Betty Jones
//Enter the amount of your initial balance: 1000
//Your current balance is: 1505.22
//Enter the amount to withdraw: 2000
//You do not have enough money
//Your current balance is 1505.22
//Enter the amount to withdraw: 500
//The Betty Jones account balance is $1005.22