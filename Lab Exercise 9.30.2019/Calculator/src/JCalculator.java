/**
 * @(#)JCalculator.java
 *
 * JCalculator Applet application
 *
 * @Author:  
 * @version 1.00 2019/9/30
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCalculator extends JFrame implements ActionListener 
{
	//Declare variables
	
	
	//Constructor
	public JCalculator() {
		super("My Calculator");
		//Construct components
		
		
		
		//Align JTextField to right alignment
		//Add code here
        
		
		//Set the size to 220 x 300
		//Add code here
        
		
		//Set the default close operation
		//Add code here
        
		
		//Set window to visible
		//Add code here
        
		
		
		// Add actionListeners
		//Add code here
        
        
      	
      	// Create container
		//Add code here
        
		
		//Set flow layout for the container
      	//Add code here
        
      	
      	//Create a Box to hold the JTextField
      	//Add code here
        
      	
      	// add components
      	//box should use NORTH border layout and everything else should be CENTER
      	//Add code here
        

	}
	
	//What happens when you click on buttons
	public void actionPerformed(ActionEvent event){
		//Declare vaiable to hold answer
		double answer = 0.0;
		
		//If it is the first number you are entering
		if (firstNumber)
		{
			//Add code here
			
			
			
        
		} //end of first number if
		
		//If it is not the first number you are entering
		if (!firstNumber)
		{
			//Add code here
        
        
        
		} //end of not first number if
		
		//Clear button event
		//Add code here
        
        
        
	}//end of actionPerformed
}//end of JCalculator class