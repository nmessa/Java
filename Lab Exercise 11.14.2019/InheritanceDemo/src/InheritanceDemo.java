/**
 * @(#)InheritanceDemo.java
 *
 * InheritanceDemo application
 *
 * @Author: nmessa 
 * @version 1.00 2019/11/9
 */
import java.text.*;

public class InheritanceDemo {
    
    public static void main(String[] args) {
    	
    	NumberFormat nf = NumberFormat.getNumberInstance();
    	nf.setMaximumFractionDigits(2);
    	nf.setMinimumFractionDigits(2);
    	String balance;
        SavingsAccount myAccount = new SavingsAccount(200, 5);
        myAccount.deposit(132.14);
        myAccount.addInterest();
        balance = nf.format(myAccount.getBalance());
        System.out.println("Final balance is: $" + balance);
    }
}
