/**
 * @(#)TreasureHunt.java
 *
 * TreasureHunt application
 *
 * @Author:  
 * @version 1.00 2019/11/18
 */
import java.util.*;
import java.io.*;

public class TreasureHunt {
    
    public static void main(String[] args) throws IOException {
    	//Create a Scanner object tied to file map.dat
    	Scanner sc = new Scanner(new File("map.dat"));
    	
    	//Declare variables
    	int map[][] = new int[5][5];
    	int r, c, row, col;
    	
    	//Read from file into 2D array
    	//Add code here
    	
    	
    	
    	//Display the map
    	//Add code here
    	
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	//search the map for treasure
    	//Treasure is found when the current row and column is the next
    	//row and column
    	
    	//Set starting point r and c to 1
    	//Add code here
    	
    	
    	//Find next destination and store in row and col
    	//Add code here
    	
    	
    	//Start searching until treasure is found
    	//Add code here
    	
    	
    	//Found the treasure
    	System.out.println("I found treasure at (" + r + ", " + c + ")");
    }
}

//Output
//Treasure Map
//34 21 32 41 25 
//14 42 43 14 31 
//54 45 52 42 23 
//33 15 51 31 35 
//21 52 33 13 23 
//
//
//
//I am at location (1, 1)
//I am at location (3, 4)
//I am at location (4, 2)
//I am at location (1, 5)
//I am at location (2, 5)
//I am at location (3, 1)
//I am at location (5, 4)
//I am at location (1, 3)
//I am at location (3, 2)
//I am at location (4, 5)
//I am at location (3, 5)
//I am at location (2, 3)
//I am at location (4, 3)
//I am at location (5, 1)
//I am at location (2, 1)
//I am at location (1, 4)
//I am at location (4, 1)
//I am at location (3, 3)
//I found treasure at (5, 2)