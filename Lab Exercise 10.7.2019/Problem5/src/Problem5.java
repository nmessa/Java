/**
 * @(#)Problem5.java
 *
 * Problem5 application
 *
 * @Author:  
 * @version 1.00 2019/10/7
 */
import java.util.*;

public class Problem5 {
    static int numbers[] = {1,2,3,4,5,6,7,8,0,1,2,3,4,5,0,7,0,9,2,
    3,4,5,6,7,8,9};
    	
    static int multipliers[] = {8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
    
    public static void main(String[] args) {
    	//Create a Scanner object
    	Scanner sc = new Scanner(System.in);
    	
    	//Get input from user
    	//System.out.print("Enter the VIN: ");
    	//String vin = sc.next();
    	String vin = "JHMCB7658LC056658";  //Test code should return true
    	System.out.println(isValid(vin));
    }
    
    public static boolean isValid(String v)
    {
    	//Declare variables
    	int check = 0;
    	int num;
    	int checkSum;
    	
    	//Process characters 0 to 7
    	for (int i = 0; i < 8; i++)
    	{
    		//If a digit subtract 48 from character ASCII value and add to num
    		//Add code here
    		
    		
    		//If a letter subtract 65 from character ASCII value and add to num	
    		//Add code here
    		
    		
    		//mulitiply num by multiplier and add to check	
    		//Add code here
    		
    		
    	}
    	
    	//Process characters 9 to 16
    	for (int i = 9; i < 17; i++)
    	{
    		//Add code here
    		
    		
    	}
    	
    	//Calculate checksum
    	//Add code here
    		
    	
    	//Check for valid checksum
    	//if valid return true
    	//Be sure to handle the case where character 8 is X
    	//Add code here
    		
    		
    		
    	//if not valid return false
    	//Add code here
    		
    }
}
