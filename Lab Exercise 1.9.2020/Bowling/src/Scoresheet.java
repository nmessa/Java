/*Scoresheet class definition
 *Holds scoresheet for a single player
 *Author: nmessa
 *Date: 12.12.2015
 */

import java.util.*;
import java.io.*;

class Scoresheet  {
	//class members
	private Frame scores[];
	private String filename;
	
	//Constructor function
	public Scoresheet(String fn)
	{
		//Declare an array of 11 frames
		scores = new Frame[12];
		//Construct Frames
		for (int i = 0; i < 12; i++)
			scores[i] = new Frame(i+1);
		filename = fn;
	}
	
	//Load data into frames
	public void loadScores()throws IOException
	{
		int r = 0, f = 0;
		Scanner reader = new Scanner(new File(filename));
		while(reader.hasNext())
		{
			r = reader.nextInt();
			scores[f].roll(r);
			if (scores[f].closed)
				f++;
		}
		reader.close();
	}
	
	//Print the contents of each frame
	public void printFrames()
	{
		for (int i = 0; i < 12; i++)
		{
			scores[i].printFrame();
		}
	}
	
	//Calculates all of the frame scores and total score
	public void calcScore()
	{
	
		//process frames
		for (int f = 0; f < 10; f++)
		{
			if (scores[f].strike)
			{
				scores[f].frameScore = 10 + scores[f+1].one;
				if (scores[f+1].strike)
					scores[f].frameScore += scores[f+2].one;
				else
					scores[f].frameScore += scores[f+1].two;
			}
			else 
			{
				if (scores[f].spare)
					scores[f].frameScore = 10 + scores[f+1].one;
				else
					scores[f].frameScore = scores[f].one + scores[f].two;
			}
		}
		
		for (int f = 1; f < 10; f++)
		{
			scores[f].frameScore += scores[f-1].frameScore;
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
		System.out.println("\n\n");
	}
}
