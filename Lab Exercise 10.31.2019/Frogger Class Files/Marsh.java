//Marsh.java
//Author: nmessa
//Date: 10/15/2010

import javax.swing.*;

public class Marsh
{
	public String[][] myMarsh;
	private Frog myFrog;
	public int size = 30;
	
	public Marsh()
	{
		myMarsh = new String[size][size];
		initializeMarsh();
		myFrog = new Frog();
	}
	
	public Marsh(Frog f)
	{
		myMarsh = new String[size][size];
		initializeMarsh();
		myFrog = f;
		Location temp = myFrog.getPosition();
		myMarsh[temp.x][temp.y] = "F";
	}
	
	private void initializeMarsh()
	{
		int row, col;
		for (row = 0; row < size; row++)
			for (col = 0; col < size; col++)
				myMarsh[row][col] = "_";
	}
	
	public void updateFrog(Frog f, String str)
	{
		Location temp = new Location();
		myFrog = f;
		temp = myFrog.getPosition();
		myMarsh[temp.x][temp.y] = str;
	}
	
	public void displayMarsh()
	{
		int row, col;
		String output = "";
		for (row = 0; row < size; row++)
		{
			for (col = 0; col < size; col++)
				output += myMarsh[row][col] + "  ";
			output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}
}