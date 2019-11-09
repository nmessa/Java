/**
 * @(#)Login.java
 *
 *
 * @Author: 
 * @version 1.00 2019/11/12
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame implements ActionListener{
	private Container contents;
 	private JLabel idLabel, passwordLabel, message;
 	private JTextField id;
 	private JPasswordField password;
 	private JTextArea legal;

    public Login() {
    	//Add code here
    	
    	
    }
    
    public void actionPerformed(ActionEvent e)
  	{
   		//Add code here
   		
   		
  	}

 	public static void main(String [] args)
 	{
  		Login login = new Login();
  		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
}