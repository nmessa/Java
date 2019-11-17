/**
 * @(#)TTT.java
 *
 * TTT application
 *
 * @Author:  
 * @version 1.00 2019/11/19
 */
import java.util.*;

public class TTT {
    
    public static char board[][]= new char[3][3];
  
    public static void main(String[] args) {
    	int row, col, num;
    	Random rnd = new Random();
    		
    	//Fill the board with random X and O for testing checkX and checkO functions
    	for (row = 0; row < 3; row++)
    	{
    		for (col = 0; col < 3; col++)
    		{
    			if(rnd.nextInt(2) == 0)
    				board[row][col] = 'X';
    			else
    				board[row][col] = 'O';
    		}
    	}
    	//Display the board
    	System.out.println("Generated Test Board");
    	for (row = 0; row < 3; row++)
    	{
    		for (col = 0; col < 3; col++)
    		{
    			System.out.print(board[row][col] + " ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    	System.out.println();
    	
    	//Test the checkX and checkO functions
    	System.out.println("checkX result: " + checkX());
    	System.out.println("checkO result: " + checkO());
    }
    
    
    public static boolean checkX()
    {
    	int row, col, rowcol;
    	//Check the rows
    	//Add code here
    	
    	
    	//Check the cols
    	//Add code here
    	
    	
    	
    	//Check the diagonals

    	//Add code here
    	
    	
    	return false; //no winner yet
    }
    
    public static boolean checkO()
    {
    	int row, col, rowcol;
    	//Check the rows
    	//Add code here
    	
    	
    	//Check the cols
    	//Add code here
    	
    	
    	//Check the diagonals

    	//Add code here
    	
    	return false;   //No winner yet
    }
}

//Output
//Generated Test Board
//X O O 
//X O O 
//X X X 
//
//
//checkX result: true
//checkO result: false