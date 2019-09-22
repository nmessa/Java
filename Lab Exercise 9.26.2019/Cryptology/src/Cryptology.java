/**
 * @(#)Cryptology.java
 *
 * Cryptology application
 *
 * @Author:  
 * @version 1.00 2019/9/24
 */
import java.util.*;

public class Cryptology {
    
    public static void main(String[] args) {
    	//Declare variables
    	String encryptSentence, decryptSentence;
    	//Create a Crypto object
    	Crypto myCryptObject = new Crypto();
    	
    	//Create a Scanner object
        Scanner reader = new Scanner(System.in);
        
        //Get the phrase to encrypt ("This is a very big morning.")
        System.out.println("Enter a sentence that is to be encrypted: ");
        String sentence = reader.nextLine();
        
        //Encrypt the sentence and store it in a variable
        encryptSentence = myCryptObject.encrypt(sentence);
        
        //Print the encrypted sentence
        System.out.println("Encrypted sentence = " + encryptSentence);
        
        //Decrypt the sentence and store it in a variable
        decryptSentence = myCryptObject.decrypt(encryptSentence);
        
        //Print the decrypted sentence
        System.out.println("Decrypted sentence = " + decryptSentence);
    }
}

//Output
//Cryptological Object Created
//Enter a sentence that is to be encrypted: 
//This is a very big morning.
//Encrypted sentence = This is a ag',rery dug>?/ijeb..w ssadorninjeb..w.
//Decrypted sentence = This is a very big morning.
