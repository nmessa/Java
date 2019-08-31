/**
 * @(#)ScannerDemo.java
 *
 * ScannerDemo application
 *
 * @nmessa 
 * @version 1.00 2019/9/6
 */
import java.util.*;  //required for Scanner class

public class ScannerDemo {
    
    public static void main(String[] args) {
    	//Declare variables
    	int intNumber;
    	double dblNumber;
    	String strWord, strPhrase;
    	
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Read in an integer
    	System.out.print("Enter an integer: ");
    	intNumber = reader.nextInt();
    	
    	//Read in a floating point number
    	System.out.print("Enter a floating point number: ");
    	dblNumber = reader.nextDouble();
    	
    	//Read in a single word
    	System.out.print("Enter a word: ");
    	strWord = reader.next();  //reads up to whitespace
    	
    	//strip off the newline character
    	reader.nextLine();
    	
    	//Read in an entire line of text
    	System.out.print("Enter a phrase: ");
    	strPhrase = reader.nextLine();
    	
    	//Print the variables
    	System.out.println("intNumber = " + intNumber);
    	System.out.println("dblNumber = " + dblNumber);
    	System.out.println("strWord = " + strWord);
    	System.out.println("strPhrase = " + strPhrase);
    	
    	//Double the numeric values
    	intNumber *= 2;
    	dblNumber *= 2;
    	
    	//Print the modified numeric values
    	System.out.println("2 * intNumber = " + intNumber);
    	System.out.println("2 * dblNumber = " + dblNumber);
    }
}

//Sample output
//Enter an integer: 4
//Enter a floating point number: 3.6
//Enter a word: hello
//Enter a phrase: this is a test
//intNumber = 4
//dblNumber = 3.6
//strWord = hello
//strPhrase = this is a test
//2 * intNumber = 8
//2 * dblNumber = 7.2