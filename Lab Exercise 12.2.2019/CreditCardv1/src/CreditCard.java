/**
 * @(#)CreditCard.java
 *
 * CreditCard application
 *
 * @Author:  
 * @version 1.00 2019/12/2
 */
 
public class CreditCard {
	// function implements the checksum formula
	public static int f(int d)
	{
		//Add code here
		
	}
    
    public static void main(String[] args) {
    	//Declare variables
    	String number = "1234567891";
    	String cardNumber;
    	int checkSum = 0;
    	int checkDigit;
    	//Parse the card number and add values to checksum
    	//All odd indexes must be run through the checksum function
    	//Remember characters must be offset by 48 to get the integer value
    	for (int i = 0;i < number.length(); i++)
    	{
    		//Add code here
    		
    	}
    	
    	//Find the appropriate checkDigit
    	//Add code here
    	
    	
    	//append the checkDigit to the number to get the cardNumber 
    	//Add code here
    	
    	
    	//Print the card number
    	System.out.println(cardNumber);
    }
}

//Output
//12345678911