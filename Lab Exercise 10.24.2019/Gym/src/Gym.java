/**
 * @(#)Gym.java
 *
 * Gym application
 *
 * @Author: 
 * @version 1.00 2019/10/24
 */
import java.io.*;
import java.util.*;
import java.text.*; 

public class Gym {
    public static void main(String[] args) throws IOException{
    	//Setup number formatter
        //Add code here
    	
        
        //Create a Scanner object to read data from scores.in
        //Add code here
    	
        
        //Declare variables
        int maxIndex = -1;
        String text[] = new String[100];
        double scores[] = new double[10];
        double sum;
        String temp;
        double average;
        
        //Read in each line of text and store in String array
        while(sf.hasNext())
        {
        	//Add code here
    	
    	
        }
        
        //Close scores.in
        //Add code here
    	
        
        //This loop will "tokenize" each line
        for (int j = 0; j <= maxIndex; j++)
        {
        	//Use one of the following (Scanner or StringTokenizer)
        	//StringTokenizer st = new StringTokenizer(text[j], " ");
        	Scanner sc = new Scanner(text[j]);
        	
        	//Get the scores for one competitor and store in scores array
        	for (int i = 0; i < 10; i++)
        	{
        		//Add code here
        		
        		
        	}
        	
        	//Sort the scores array
        	//must sort to ignore the high and low
        	//Add code here
    	
        	
        	//Add up the 8 middle scores
        	//Add code here
    	
    	
        	
        	//Calculate the average of scores
        	//Add code here
    	
        	
        	//Format the average
        	//Add code here
    	
    	
        }
    }
}

//Output
//For competitor #1, the average is 5.8625
//For competitor #2, the average is 0.0
//For competitor #3, the average is 1.0
