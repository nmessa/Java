/**
 * @(#)Tester.java
 * @Author: 
 * @version 1.00 2014/11/20
 */
import java.io.*; 
import java.util.*;

public class Tester {

    public static void main(String[] args) throws IOException{
    	//Create Scanner object tied to file MatrixData.txt
        Scanner sf = new Scanner(new File("MatrixData.txt"));
		
		int maxIndx = -1; //Keeps track of text array index
		String text[] = new String[100]; //declare more than we need
		
		//Read data from files and store in text array
		while(sf.hasNext( ))
		{
			//Add code here
        
		}
		sf.close( ); 
			
		//Get the dimensions of the a and b matrix
		int matrixCount = 0, rowCount = 0, colCount = 0;
		int aRows = 0, aCols = 0, bRows = 0, bCols = 0;
		
		//Parse each line of text
		for (int j = 0; j <= maxIndx; j++)
		{
			if(text[j].equals("matrix"))
			{
				//Increment matrixCount
				//Add code here
        
				
				//if matrixCount is 2 then aRows and bRows are rowCount and colCount
				//Add code here
        
        
				
				//Reset rowCount and colCount to 0 to get ready to count 
				//rows and cols of next matrix
				//Add code here
        
			}
			else if(text[j].equals("row")) //this counts the rows
			{
				//increment rowCount and set colCount to 0
				//Add code here
        
        
			}
			else  //This counts the columns
			{
				//Increment colCount
				//Add code here
        
			}	
		}
		//Set bRows and bCols to rowCount and colCount
		//Add code here
        
		
		//Construct a and b arrays
		//Add code here
        

		//Fill the a and b matrices
		matrixCount = 0;
		int rowIndx = -1, colIndx = -1;
		
		//Parse the text file
		for (int j = 0; j <= maxIndx; j++)
		{
			if(text[j].equals("matrix"))
			{
				//Increment matrixCount and set rowIndex and colIndex to -1
				//Add code here
        
			}
			else if(text[j].equals("row"))
			{
				//increment rowIndx and set colIndx to -1
				//Add code here
        
			}
			else
			{
				//Increment colIndex
				//Add code here
        
				
				
				//If matrixCount is 1, store text[j] in matrix a
				//else store in matrix b using rowIndx and colIndx
				//Be sure to convert from string to integer
				//Add code here
        
			}
		}
		
		//Multiply the a and b matrices
		
		//Create 2D array reference
		int product[][]; //answer goes in product
		
		//Call mult method and store 2D array returned in product[][]
        //Add code here
        
        
        //Print the 2D array
        //Add code here
        
        
    }
}
