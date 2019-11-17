/**
 * @(#)TreasureHunt.java
 *
 * TreasureHunt application
 *
 * @nmessa 
 * @version 1.00 2015/11/27
 */
import java.util.*;
import java.io.*;

public class TreasureHunt {
    
    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(new File("map.dat"));
    	int map[][] = new int[5][5];
    	//r and c are the current row and column
    	//row and col are the next row and column
    	int r, c, row,col;
    	
    	//Read from file into 2D array
    	while (sc.hasNext())
    	{
    		for (row = 0; row < 5; row++)
    			for (col = 0; col < 5; col++)
    				map[row][col] = Integer.parseInt(sc.next());
    	}
    	sc.close();
    	
    	//Display the map
    	for (row = 0; row < 5; row++)
    	{
    		for (col = 0; col < 5; col++)
    			System.out.print(map[row][col] + " ");
    		System.out.println();
    	}
    	
    	//search the map for treasure
    	//Treasure is found when the current row and column is the next
    	//row and column
    	
    	//r and c are the current row and column
    	//row and col are the next row and column
    	//Set starting point
    	//Add code here
    	
    	
    	
    	//Find next destination
    	//Add code here
    	
    	
    	
    	//Start searching
    	while (!(r == row && c == col)) //condition for found treasure
    	{
    		System.out.println("I am at location (" + r + ", " + c + ")");
    		//Add code here
    		
    		
    		
    		
    	}
    	
    	//Found the treasure
    	System.out.println("I found treasure at (" + r + ", " + c + ")");
    }
}
