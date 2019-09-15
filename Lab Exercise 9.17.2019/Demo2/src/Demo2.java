/**
 * @(#)Demo2.java
 *
 * Demo2 application
 *
 * @author 
 * @version 1.00 2017/9/19
 */
 
public class Demo2 {
    
    public static void main(String[] args) {
    	
    	int number = 11;
    	while (number < 100)
    	{
    		if (number % 10 == 0)
    			break;
    		System.out.print(number + " ");
    		number++;
    	}
    }
}
