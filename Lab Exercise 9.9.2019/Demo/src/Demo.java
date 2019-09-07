/**
 * @(#)Demo.java
 *
 * Demo application
 *
 * @nmessa 
 * @version 1.00 2016/9/12
 */
import java.util.*;

public class Demo {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	Scanner reader = new Scanner(System.in);
    	int intNumber;
    	double dblNumber;
    	String s;
    	
    	System.out.println("Enter an phrase");
    	s = reader.nextLine();
    	
    	System.out.println("Enter an integer");
    	intNumber = reader.nextInt();
    	
    	System.out.println("Enter a floating point number");
    	dblNumber = reader.nextDouble();
    	

    	System.out.println(s);
    	System.out.println(intNumber);
    	System.out.println(dblNumber);
    	
    }
}
