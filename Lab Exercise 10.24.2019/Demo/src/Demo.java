/**
 * @(#)Demo.java
 *
 * Demo application
 *
 * @nmessa 
 * @version 1.00 2017/10/25
 */
import java.util.*;
import java.text.*;
 
public class Demo {
    
    public static void main(String[] args) {
    	
    	// Rounding a number to two decimal places
        double num = 123.45678, result;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        result = Double.parseDouble(nf.format(num));
        System.out.println(num + " = " + result);
        
        
        // Currency
        num = 123.45678;
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        String str = cf.format(num);
        System.out.println(num + " = " + str);
        
        // Percent
        num = 0.45678;
        NumberFormat pf = NumberFormat.getPercentInstance();
        pf.setMaximumFractionDigits(2);
        pf.setMinimumFractionDigits(2);
        str = pf.format(num);
        System.out.println(num + " = " + str);
        
        //Precision
        num = 1234.56789;
        Formatter fmt = new Formatter();
        //System.out.println(fmt.format("%f = %9.3f", num, num));
        //System.out.println(fmt.format("%f = %9.2e", num, num));
        //System.out.println(fmt.format("%f = %.6g", num, num));
        System.out.println(fmt.format("%f = %16.20s", num, num));
    }
}

//Output
//123.45678 = 123.46
//123.45678 = $123.46
//0.45678 = 45.68%
//1234.567890 =       1234.56789
