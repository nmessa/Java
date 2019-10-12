/**
 * @(#)Censor.java
 *
 * Censor application
 *
 * @Author:  
 * @version 1.00 2019/10/15
 */
import java.util.*;
 
public class Censor {
    
    public static void main(String[] args) {
    	//Create an array of censored words
    	//Add code here
    	
    	 
    	//Create a Scanner object
    	//Add code here
    	
    	//Declare variables
    	StringTokenizer t;
    	String sentence, lcSentence;
    	Boolean valid;
    	String token;
    	
    	
    	do
    	{
    		//Read in a sentence
    		//Add code here
    		
    		
    		//Convert sentence to lower case
    		//Add code here
    		
    		
    		//Set flag variable valid to true
    		//Add code here
    		
    		
    		//Tokenize the lower case sentence
    		//Add code here
    		
    		
    		//Check each token to see if sensored word
    		//Add code here
    		
    		
    		
    		//Report if sentence OK or is REJECTED
    		if (valid)
    			System.out.println(sentence + " >>> OK");
    		else
    			System.out.println(sentence + " >>> REJECTED");
    			
    	//end sentence entry if done is entered
    	}while (!sentence.equals("done"));
    }
}
