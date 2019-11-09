/**
 * @(#)ChangingColors.java
 *
 *
 * @Author:  
 * @version 1.00 2019/11/12
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ChangingColors extends JFrame implements ItemListener{
	private Container contents;
 	private JRadioButton red, green, blue;
 	private ButtonGroup colorGroup;
 	private JLabel label;
 	private Color selectedColor = Color.RED;

    public ChangingColors() {
    	//Add code here
    	
    	
    }
    
    public void itemStateChanged( ItemEvent ie )
  	{
  		//Add code here
  		
  		
  	}

 	public static void main( String [] args )
 	{
  		ChangingColors cc = new ChangingColors( );
  		cc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 	}
}