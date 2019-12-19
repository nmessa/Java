//BingoCard class
//Author: 

import java.util.*;

public class BingoCard {
	//Class instance variables
	private ArrayList<Integer> B;
	private ArrayList<Integer> I;
	private ArrayList<Integer> N;
	private ArrayList<Integer> G;
	private ArrayList<Integer> O;
	
	//Constructor
	public BingoCard()
	{
		//Construct ArrayLists B, I, N, G, and O
		B = new ArrayList<Integer>();
		I = new ArrayList<Integer>();
		N = new ArrayList<Integer>();
		G = new ArrayList<Integer>();
		O = new ArrayList<Integer>();
		
		//Create a Random object
		Random rnd = new Random();
		
		//Fill the B array list with random integers from 1 to 15
		while (B.size() < 5)
		{
			int r = 1 + rnd.nextInt(15);
			if (B.contains(r))
				continue;
			else
				B.add(r);
		}
		
		//Fill the I array list with random integers from 16 to 30
		//Add code here
		
		
		//Fill the N array list with random integers from 31 to 45
		while (N.size() < 5)
		{
			//Add code here
			if (N.size() == 2)  //Special case for free space
			{
				N.add(0);
				continue;
			}
			//Add code here
			
			
		}
		
		//Fill the G array list with random integers from 46 to 60
		//Add code here
		
		
		//Fill the O array list with random integers from 61 to 75
		//Add code here
		
		
	}
	
	//Print out Bingo Card
	public void printCard()
	{
		System.out.println("B\t I\t N\t G\t O");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(B.get(i) + "\t" + I.get(i) + "\t" + 
				N.get(i) + "\t"  + G.get(i) + "\t" + O.get(i));
		}
		System.out.println();
	}
	
	//Update Bingo card for drawn numbers
	public void updateCard(String s)
	{
		//Break string into column and number
		char ch = s.charAt(0);
		int number = Integer.parseInt(s.substring(1));
		
		//Update Bingo card if number found
		switch (ch)
		{
			case 'B':
				if (B.contains(number))
				{
					B.set(B.indexOf(number), 0);
					break;
				}
				else
					break;
					
			case 'I':
				//Add code here
		
			
			case 'N':
				//Add code here
		
					
			case 'G':
				//Add code here
		
					
			case 'O':
				//Add code here
		
		}
	}
	
	public boolean checkRowWin()
	{
		//Add code here
		
		
	}
	
	public boolean checkColWin()
	{
		//Add code here
		
	}
	
	public boolean checkDiagWin()
	{
		//Add code here
		
	}
	
}
