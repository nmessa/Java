/**
 * @(#)Letters.java
 *
 * Letters application
 *
 * @Author:  
 * @version 1.00 2019/11/21
 */
 
public class Letters {
    
    public static void main(String[] args) {
    	//Create a test string
        String test = "Now is the time for all good men" +
        	" to come to the aid of their country";
        
        //Create an array of integers to hold the number of vowels and consonants
        int answer [] = new int[2];
        
        //Call vowelsAndConsonants method and store returned array in answer array
        answer = vowelsAndConsonants(test);
        
        //Output result
        System.out.println("Vowels: " + answer[0]);
        System.out.println("Consonants: " + answer[1]);
    }
    
    public static int [] vowelsAndConsonants(String myString)
    {
    	//Declare variables
    	String vowels = "aeiou";
    	String consonants = "bcdfghjklmnpqrstvwxyz";
    	int numVowels = 0;
    	int numConsonants = 0;
    	int result[] = {0,0};
    	
    	//Convert the string to lower case
    	//Add code here
    	
    	
    	//Parse the string counting vowels and consonants
    	//Add code here
    	
    	
    	//Store the numVowels and numConsonants values in result array
    	//Add code here
    	
    	
    	//Return the result
    	return result;
    }
}
