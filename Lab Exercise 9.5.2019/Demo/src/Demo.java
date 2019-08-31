/**
 * @(#)Demo.java
 *
 * Demo application
 *
 * @nmessa 
 * @version 1.00 2019/9/5
 */
import javax.swing.JOptionPane;

public class Demo {
    
    public static void main(String[] args) {
    	
    	//Declare variables
    	String strNumber;
    	int number;
    	
    	//Get user input
    	strNumber= JOptionPane.showInputDialog("Please input a value");
      	number = Integer.parseInt(strNumber);
      	
      	//Build output string
      	String result;
      	result = "You entered " + number;
      	
      	
      	JOptionPane.showMessageDialog( null, result, "JOptionPane Demo", 
      		JOptionPane.INFORMATION_MESSAGE );

      	System.exit( 0 );
    }
}
