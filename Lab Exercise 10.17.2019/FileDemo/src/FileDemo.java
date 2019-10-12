/**
 * @(#)FileDemo.java
 *
 * FileDemo application
 *
 * @Author: nmessa 
 * @version 1.00 2018/10/23
 */

import java.io.*;
import java.util.*;

public class FileDemo {
    
    public static void main(String[] args) throws IOException{
    	
    	Scanner reader = new Scanner(new File("file.txt"));
        int maxIndex = -1;
        String text[] = new String[100];
        while (reader.hasNext())
        {
        	maxIndex++;
        	text[maxIndex] = reader.nextLine();
        }
        reader.close();
        
        for (int i = 0; i <= maxIndex; i++)
        {
        	System.out.println(text[i]);
        }
    }
}
