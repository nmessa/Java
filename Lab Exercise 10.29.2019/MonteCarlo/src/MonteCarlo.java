/**
 * @(#)MonteCarlo.java
 *
 * MonteCarlo application
 *
 * @Author:  
 * @version 1.00 2019/10/29
 */
import java.util.*;
 
public class MonteCarlo {
    
    public static void main(String[] args) {
    	
    	 //declare variables
       Scanner reader = new Scanner(System.in);
       double h, k, r, lowerX, upperX, lowerY, upperY, x, y, pi;
       final int TRIALS = 1000000; 
       int count = 0;
       Random rndm = new Random();
       
       //Get user input
       //Add code here
       
       
       
       //Calculate the upper and lower bounds of the circle bounding box
       //Add code here
       
       
       
       //run simulation
       for (int i = 0; i < TRIALS; i++)
       {
       		//Add code here
       		
       		
       }
       
       //Calculate approximatino for pi
       //Add code here
       
       
       System.out.println("Pi = " + pi);
    }
}

//Sample Output
//Enter the x coordinate of the circle center: 4
//Enter the y coordinate of the circle center: 6
//Enter the radius of the circle center: 7
//Pi = 3.141516
