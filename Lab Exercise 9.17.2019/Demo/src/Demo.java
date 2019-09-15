/**
 * @(#)Demo.java
 *
 * Demo application
 *
 * @author 
 * @version 1.00 2017/9/19
 */
 
public class Demo {
    
    public static void main(String[] args) {
    	
    	double m = 92.801;
		int j = 0;
		do
		{
			j = j + 2;
			if (j > -100)
				continue;
			m+=3;
		}while(j < 6);
		System.out.println(m);
    }
}
