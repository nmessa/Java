/**
 * @(#)SquareRoot.java
 *
 * SquareRoot application
 *
 * @Author:  
 * @version 1.00 2019/12/5
 */
import java.util.*;

public class SquareRoot {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double number, guess, answer;
    	System.out.println("Enter a number take square root of: ");
    	number = sc.nextDouble();
    	System.out.println("Enter a guess: ");
    	guess = sc.nextDouble();
    	answer = squareRoot(number, guess);
    	System.out.println("The square root of " + number 
    		+ " = " + answer);
    }
    
    public static double squareRoot(double number, double guess)
    {
    	//Add code here
    	
    	
    }
}
