/**
 * @(#)SinCos.java
 *
 * SinCos application
 *
 * @Author:  
 * @version 1.00 2019/9/12 Problem 2
 */
import java.util.*;
 
public class SinCos {
    
    public static void main(String[] args) {
    	//Declare variables
    	double angle, term, radians;
    	
    	//c1 and c2 are counters to keep track of how many terms were
    	//required to converge to the required precision
    	int c1 = 0;
    	int c2 = 0;
    	
    	//This constant is the precision that we are calculating to
    	final double EPSILON = 0.0000001;
    	
    	//Create a Scanner object
    	//Add code here
        
    	
    	//Get angle in degrees from user
    	//Add code here
        
    	
    	//Convert degrees to radians
    	//Add code here
        
    	
    	
    	//Declare and initialize variables to be used in calculation 
    	//of sine and cosine
    	double x = radians;
    	int count = 0;
    	int denom = 1;
    	double sine = 0.0;
    	double cosine = 0.0;
    	
    	//Calculate the sine of x
    	do
    	{
    		//Calculate a term
    		//Add code here
        
    		
    		//Handle alternating sign
    		//Add code here
        
    		
    		//add term to sine
    		//Add code here
        
    		
    		//add 2 to denom and 1 to count
    		//Add code here
        
    		
    		//update c1 by adding 1
    		//Add code here
        
    	}while (Math.abs(term) > EPSILON);
    	
    	//Calculate the cosine of x
    	//Reset variables x, count, denom
    	x = radians;
    	count = 0;
    	denom = 0;
    	
    	//Calculate cosine of x
    	do
    	{
    		//Calculate a term
    		//Add code here
        
    		
    		//handles alternating sign
    		//Add code here
        
    		
    		//add term to cosine
    		//Add code here
        
    		
    		//add 2 to denom and 1 to count
    		//Add code here
        
    		
    		//update c2 by adding 1
    		//Add code here
        
    	}while (Math.abs(term) > EPSILON);
    	
    	//Output the result
        System.out.println("Sine of " + angle + " degrees = " + sine);
        System.out.println(c1 + " terms to converge to a solution");
        System.out.println("Cosine of " + angle + " degrees = " + cosine);
        System.out.println(c2 + " terms to converge to a solution");
    }
    
    //Factorial function returns the factorial of an integer
    //Must be static because it is called by main 
    public static int factorial(int n){
		int fact = 1;
		if (n == 0 || n == 1)
			return 1;
		for (int i = n; i > 1; i--)
			fact *= i;
		return fact;
	}
}

//Sample Output
//Enter the angle in degrees: 30
//Sine of 30.0 degrees = 0.5000000000202799
//5 terms to converge to a solution
//Cosine of 30.0 degrees = 0.8660254037835535
//6 terms to converge to a solution