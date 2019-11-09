/**
 * @(#)FoodSamplings.java
 *
 *
 * @Author:  
 * @version 1.00 2019/11/12
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class FoodSamplings extends JFrame implements ListSelectionListener{
	private Container contents;
 	private JList countries;
 	private JLabel foodImage;

 	private String [] countryList = { "France", "Greece", "Italy", 
 		"Japan", "USA" };
 	private ImageIcon [] foods =
            		{  new ImageIcon( "cheese.jpg" ),
               		new ImageIcon( "fetaSalad.jpg" ),
               		new ImageIcon( "pizza.jpg" ),
               		new ImageIcon( "sushi.jpg" ),
               		new ImageIcon( "hamburger.jpg" ) };

    public FoodSamplings() {
    	//Add code here
    	
    }
    
    public void valueChanged( ListSelectionEvent lse )
  	{
   		//Add code here
   		
   		
  	}

 	public static void main( String [] args )
 	{
  		FoodSamplings fs = new FoodSamplings( );
  		fs.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 	}

    
}