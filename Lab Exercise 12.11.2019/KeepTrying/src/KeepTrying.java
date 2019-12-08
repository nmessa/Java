/**
 * @(#)KeepTrying.java
 *
 * KeepTrying application
 *
 * @Author: 
 * @version 1.00 2019/12/11
 */
import java.io.*; //needed for IOException
import java.util.*; //Needed for Scanner

public class KeepTrying
{
	public static void main(String args[])
	{
		//Create a Scanner object to read from keyboard
		Scanner kbReader = new Scanner(System.in);
		
		//Declare variables
		String fileName;
		boolean fileReadOK;
		
		//Read in the filename
		do
		{
			//Get filename from user
			//Add code here
			
			
			//Set flag variable fileReadOK to false
			//Add code here
			
			
			//If filename is "EXIT" leave the loop
			//Add code here
			
			
			//Attempt to read the file.  If successful, set fileReadOK to true
			//if not successful, catch the exception
			try
			{
				//Add code here
			
			
			}
			catch(IOException e)
			{
				//Add code here
			
			}
		}while(!fileReadOK);
		
		
		//Display message if the exception handler worked or not
		//Add code here
		
		
	} //end of main
} //end of class

//Output
//Enter the file name (Enter the word exit to abort): test.text
//Try a different file name
//
//Enter the file name (Enter the word exit to abort): test.txt
//Jack be nimble
//Jack be quick
//Jack jumped over the candle stick
//and caught fire
//It worked