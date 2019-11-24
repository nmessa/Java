/**
 * @(#)Birthday.java
 *
 * Birthday application
 *
 * @Author:  
 * @version 1.00 2019/11/25
 */
import java.util.*;

public class Birthday {
    final static int NUM_TRIALS = 1000;
    
    public static void main(String[] args) {
    		//Declare array to hold each day count
    		int days[] = new int[365];
    		
    		//Test for classroom with 2 to 50 students
    		for (int students = 2; students <= 50; students++)
    		{
    			//Initialize count to 0
    			//Add code here
    			
    			
    			//Run experiment NUM_TRIALS times
    			for (int i = 0; i < NUM_TRIALS; i++)
    			{
    				//Initialize days array
    				//Add code here
    			
    				
    				//Generate birthdays
    				//Add code here
    			
    				
    				//If duplicate exists increment the count
    				//Add code here
    			//Add code here
    			
    			}	
    			
    			//Output the result of experiment for n students (n = 2 to 50)	
    			System.out.println("The probability of " + students + 
    				" students having duplicate birthdays is " + 
    					(double)count/NUM_TRIALS);
    		}
    }
    
    //This function initializes the days array elements to 0
    public static void initialize(int[] d)
    {
    	//Add code here
    			
    }
    
    //This function generates a random birthday Jan 1 (0) to Dec 31 (364)
    //and increments the value in that array element
    public static void genBDays(int[] d, int s)
    {
    	Random rnd = new Random();
    	//Add code here
    			
    }
    
    //This function checks for duplicate birthdays (an value in days array > 1
    public static boolean duplicates(int[] d)
    {
    	//Add code here
    			
    }
}

//Output
//The probability of 2 students having duplicate birthdays is 0.004
//The probability of 3 students having duplicate birthdays is 0.009
//The probability of 4 students having duplicate birthdays is 0.018
//The probability of 5 students having duplicate birthdays is 0.028
//The probability of 6 students having duplicate birthdays is 0.043
//The probability of 7 students having duplicate birthdays is 0.054
//The probability of 8 students having duplicate birthdays is 0.065
//The probability of 9 students having duplicate birthdays is 0.093
//The probability of 10 students having duplicate birthdays is 0.114
//The probability of 11 students having duplicate birthdays is 0.128
//The probability of 12 students having duplicate birthdays is 0.17
//The probability of 13 students having duplicate birthdays is 0.203
//The probability of 14 students having duplicate birthdays is 0.22
//The probability of 15 students having duplicate birthdays is 0.257
//The probability of 16 students having duplicate birthdays is 0.286
//The probability of 17 students having duplicate birthdays is 0.299
//The probability of 18 students having duplicate birthdays is 0.377
//The probability of 19 students having duplicate birthdays is 0.385
//The probability of 20 students having duplicate birthdays is 0.395
//The probability of 21 students having duplicate birthdays is 0.421
//The probability of 22 students having duplicate birthdays is 0.514
//The probability of 23 students having duplicate birthdays is 0.51
//The probability of 24 students having duplicate birthdays is 0.553
//The probability of 25 students having duplicate birthdays is 0.571
//The probability of 26 students having duplicate birthdays is 0.576
//The probability of 27 students having duplicate birthdays is 0.631
//The probability of 28 students having duplicate birthdays is 0.66
//The probability of 29 students having duplicate birthdays is 0.662
//The probability of 30 students having duplicate birthdays is 0.719
//The probability of 31 students having duplicate birthdays is 0.741
//The probability of 32 students having duplicate birthdays is 0.742
//The probability of 33 students having duplicate birthdays is 0.781
//The probability of 34 students having duplicate birthdays is 0.792
//The probability of 35 students having duplicate birthdays is 0.804
//The probability of 36 students having duplicate birthdays is 0.845
//The probability of 37 students having duplicate birthdays is 0.851
//The probability of 38 students having duplicate birthdays is 0.869
//The probability of 39 students having duplicate birthdays is 0.876
//The probability of 40 students having duplicate birthdays is 0.892
//The probability of 41 students having duplicate birthdays is 0.897
//The probability of 42 students having duplicate birthdays is 0.917
//The probability of 43 students having duplicate birthdays is 0.934
//The probability of 44 students having duplicate birthdays is 0.941
//The probability of 45 students having duplicate birthdays is 0.947
//The probability of 46 students having duplicate birthdays is 0.955
//The probability of 47 students having duplicate birthdays is 0.962
//The probability of 48 students having duplicate birthdays is 0.962
//The probability of 49 students having duplicate birthdays is 0.969
//The probability of 50 students having duplicate birthdays is 0.966