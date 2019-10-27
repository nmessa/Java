/**
 * @(#)BitManip_Demo.java
 *
 * BitManip_Demo application
 *
 * @Author: nmessa 
 * @version 1.00 2019/10/28
 */
 
public class BitManip_Demo {
    
    public static void main(String[] args) {
    	
    	int j = 79, k = 82, p = 112, q = 99;
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("k = " + Integer.toBinaryString(k));
        System.out.println("p = " + Integer.toBinaryString(p));
        
        System.out.println("q = \t " + Integer.toBinaryString(q));
        System.out.println("137 = \t" + Integer.toBinaryString(137));
        System.out.println("235 = \t" + Integer.toBinaryString(235));
        System.out.println("137 | q = " + (137 | q));
        
        System.out.println("137 = \t" + Integer.toBinaryString(137));
        System.out.println("121 = \t " + Integer.toBinaryString(121));
        System.out.println("9 = \t    " + Integer.toBinaryString(9));
        System.out.println("137 & 121 = " + (137 & 121));
        
        System.out.println("137 = \t" + Integer.toBinaryString(137));
        System.out.println("121 = \t " + Integer.toBinaryString(121));
        System.out.println("240 = \t" + Integer.toBinaryString(240));
        System.out.println("137 ^ 121 = " + (137^121));
    }
}

//Output
//j = 1001111
//k = 1010010
//p = 1110000
//q =      1100011
//137 =   10001001
//235 =   11101011
//137 | q = 235
//137 =   10001001
//121 =    1111001
//9 =         1001
//137 & 121 = 9
//137 =   10001001
//121 =    1111001
//240 =   11110000
//137 ^ 121 = 240
