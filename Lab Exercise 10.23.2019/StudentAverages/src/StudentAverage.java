/**
 * @(#)StudentAverage.java
 *
 *
 * @Author: 
 * @Lab Exercise 10/23/2019
 */
import java.util.*;
import java.io.*;

public class StudentAverage {
	//Declare state variables
	private String name;
	private Scanner reader;
	private FileWriter fw;
	private PrintWriter output;
	private String str;
	private int count, sum;
	private double average;
	
	
	//Note: Any method that accesses a file must throw an IOException
	//Constructor
    public StudentAverage() throws IOException{
    	//Create a Scanner object to access the file StudentScores.in
    	//Add code here
    	
    	
    	
    	//Create a FileWriter object to access StudentScores.out
    	//Add code here
    	
    	
    	
    	//Create a PrintWriter object associated with the FileWriter object
    	//Add code here
    	
    }
    
    //used for console output
    public void readLines()
    {
    	while (reader.hasNext())
    	{
    		//Add code here
    	
    	
    	}
    }
    
    //Used for file output
    public void readAndWriteLines() throws IOException
    {
    	while (reader.hasNext())
    	{
    		//Add code here
    	
    	
    	}
    	
    	//Close the PrintWriter
    	//Add code here
    	
    	
    	//Close the FileWriter
    	//Add code here
    	
    }  
}