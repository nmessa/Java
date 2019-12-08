/*Scoresheet class definition
 *Holds scoresheet for a single player
 *Author: 
 *Date: 12.12.2019
 */

import java.util.*;
import java.io.*;

class Scoresheet  {
	//class members an array of Frame objects
	private Frame scores[];
	
	//Constructor function
	public Scoresheet()
	{
		//Declare an array of 12 frames
		//Add code here
			
		
		//Construct Frame objects and put in scores array
		//Add code here
			
	}
	
	//Load data into frames
	public void loadScores()throws IOException
	{
		//Declare variables
		int r = 0, f = 0;
		
		//Create a Scanner object associated with the file scores.txt
		Scanner reader = new Scanner(new File("scores.txt"));
		
		//Read in each roll value
		while(reader.hasNext())
		{
			//Get roll value
			//Add code here
			
			
			//Apply roll value to frame using frame roll method
			//Add code here
			
			
			//if the frame is closed, go to next frame
			//Add code here
			
		}
		//Close the frame
		//Add code here
			
	}
	
	//Print the contents of each frame using the Frame class printFrame method
	public void printFrames()
	{
		//Add code here
			
	}
	
	
	//Calculates all of the frame scores and total score
	public void calcScore()
	{
	
		//process frames
		for (int f = 0; f < 10; f++)
		{
			if (scores[f].strike)
			{
				//Add code here
			
			
			}
			else 
			{
				if (scores[f].spare)
					//Add code here
			
				else
					//Add code here
			
			}
		}
		
		//Add up the frame scores
		for (int f = 1; f < 10; f++)
		{
			//Add code here
			
		}
		
		//return totalScore;
	}
	
	//Prints the scoresheet
	public void printScoresheet()
	{
		System.out.println("\t\t\t\tFrame");
		for (int f = 0; f < 10; f++)
		{
			System.out.print((f+1) + "\t");
		}
		
		System.out.println();
		for (int f = 0; f < 10; f++)
		{
			System.out.print(scores[f].frameScore + "\t");
		}	
	}
}
