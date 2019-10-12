/**
 * @(#)StringTokenizerDemo.java
 *
 * StringTokenizerDemo application
 *
 * @author 
 * @version 1.00 2019/10/11
 */
import java.util.*;

public class StringTokenizerDemo {
    
    public static void main(String[] args) {
    	
    	String str = "17,587,345,789,893";
        String ary[] = {"Trillion ", "Billion ", "Millon ", "Thousand "};
        StringTokenizer t = new StringTokenizer(str, ",");
        int tokens = t.countTokens();
        for (int i = 0; i < tokens-1; i++)
        	System.out.print( t.nextToken() + " " + ary[i]);
        System.out.println( t.nextToken());
    }
}
