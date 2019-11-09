/**
 * @(#)MixingColors.java
 *
 *
 * @Author:  
 * @version 1.00 2019/11/12
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MixingColors extends JFrame implements ItemListener {
	private Container contents;
 	private JCheckBox red, green, blue;
 	private int redValue, greenValue, blueValue;
 	private JLabel label;

    public MixingColors() {
    	//Add code here
    	
    	
    }
    
    public void itemStateChanged( ItemEvent ie )
  	{
   		//Add code here
   		
   		
  	}

 	public static void main( String [] args )
 	{
  		MixingColors mc = new MixingColors( );
  		mc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 	}

}