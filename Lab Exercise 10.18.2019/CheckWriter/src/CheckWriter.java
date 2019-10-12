/**
 * @(#)CheckWriter.java
 *
 * CheckWriter application
 *
 * @Author:  
 * @version 1.00 2019/10/18
 */
import java.util.*;
 
public class CheckWriter {
    
    public static void main(String[] args) {
    	//Conversion array
    	String converter[] = {"zero", "one", "two", "three", "four", "five", "six",
    	"seven", "eight", "nine" };
    	
    	//Declare variables
    	String strDollars = "", strCents = "";
    	double amount;
    	int dollars, cents, thousands, hundreds, tens, ones, dimes, pennies, numTeens;
    	
    	//Create a Scanner object to read from keyboard
    	//Add code here
    	
    	
    	//Get monetary amount from user
    	//Add code here
    	
    	
    	//extract dollars from amount by typecasting to int and store in dollars
    	//Add code here
    	
    	
    	//Extract cents from amount by subtracting dollars and multiplying by 100
    	//Add 0.005 to compensate for rounding errors
    	//Typecast result to an int
    	//Add code here
    	
    	
    	
    	//Break apart dollars into thousands, hundreds, tens, and ones
    	//Add code here
    	
    	
    	
    	//Break apart cents into dimes and pennies
    	//Add code here
    	
    	
    	
    	//Build strDollars
    	//Add code here
    	
    	
    	
    	
    	
    	//Build strCents
    	//Add code here
    	
    	
    	
    	
    	
    	
    	//Print output
    	System.out.println(strDollars + " dollars and " + strCents + " cents");
    } //end of main
} //end of class

/*Sample output
Enter a monetary amount: 
1234.56
one thousand, two hundred, thirty four dollars and fifty six cents*/

