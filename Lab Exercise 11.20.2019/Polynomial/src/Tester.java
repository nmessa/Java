/**
 * @(#)Tester.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2019/11/20
 */
import java.util.*;
import java.text.*;

public class Tester {
    public static void main(String[] args) {
    	//Declare variables
    	String coeffs = "";
        double temp, start, end;
        int order;
        
    	//Create a Scanner object input
        Scanner input = new Scanner(System.in);
        
        //Setup a DecimalFormat object
        String pattern = "###.##";
		DecimalFormat df= new DecimalFormat(pattern);
		
		//Get the order of the polynomial from user
        System.out.print("Enter the order of the polynomial: ");
        order = input.nextInt();;
        
        //Enter the coefficients and add them to coeffs string seperated by "/" string
        for (int term = order; term >= 0; term--)
        {
        	System.out.print("Enter coefficient for term " + term + ": ");
        	temp = input.nextDouble();
        	coeffs += Double.toString(temp);
        	coeffs += "/";
        }
        //System.out.println(coeffs);
        
        //Construct the polynomial object fx
        Polynomial fx = new Polynomial(coeffs, order);
        
        //Print out the polynomial
        fx.printPoly();
        
        //Print out a values table
        System.out.print("Enter the starting value for your table: ");
        start = input.nextDouble();
        System.out.print("Enter the ending value for your table: ");
        end = input.nextDouble();
        
        for (double i = start; i < end + 0.1; i += 0.1)
        {
        	System.out.println("values(" + df.format(i) + ") = " + 
        		df.format(fx.eval(i)));
        }    
    }
}
//Output
//Enter the order of the polynomial: 3
//Enter coefficient for term 3: 3.6
//Enter coefficient for term 2: 4.7
//Enter coefficient for term 1: -5.1
//Enter coefficient for term 0: 6.4
//3.6X^3 + 4.7X^2 -5.1X^1 + 6.4 = 0
//Enter the starting value for your table: 0
//Enter the ending value for your table: 2
//values(0) = 6.4
//values(0.1) = 5.94
//values(0.2) = 5.6
//values(0.3) = 5.39
//values(0.4) = 5.34
//values(0.5) = 5.48
//values(0.6) = 5.81
//values(0.7) = 6.37
//values(0.8) = 7.17
//values(0.9) = 8.24
//values(1) = 9.6
//values(1.1) = 11.27
//values(1.2) = 13.27
//values(1.3) = 15.62
//values(1.4) = 18.35
//values(1.5) = 21.48
//values(1.6) = 25.02
//values(1.7) = 29
//values(1.8) = 33.44
//values(1.9) = 38.37
//values(2) = 43.8
