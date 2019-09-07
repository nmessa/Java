/**
 * @(#)SwitchDemo.java
 *
 * SwitchDemo application
 *
 * @nmessa 
 * @version 1.00 2015/9/22
 */
import java.util.*;

public class SwitchDemo {
    
    public static void main(String[] args) {
    	
    	int number;
    	Scanner kb = new Scanner(System.in);
    	System.out.print("Enter a number from 1 - 4: ");
    	number = kb.nextInt();
    	switch (number)
    	{
    		case 1: System.out.println("One");
    				break;	
    		case 2: System.out.println("Two");
    				break;
    		case 3: System.out.println("Three");
    				break;
    		case 4: System.out.println("Four");
    				break;
    		default: System.out.println("You can not follow " +
    			"instructions");
    	}
    }
}
