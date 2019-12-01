/**
 * @(#)ComplexTester.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2019/12/4
 */

public class ComplexTester {
    public static void main(String[] args) {
        Complex a = new Complex(3.0, 2.0);       // complex number 3 + i1
      	Complex b = new Complex(2.0,1.0);       // complex number 1 - i1
     	System.out.println(a);                   // print a using a.toString()
      	System.out.println(b);                   // print b using b.toString()
      	Complex sum = b.add(a);                  // add a to b
      	System.out.println("Sum = " + sum);                 // print sum
      	Complex product = b.multiply(a);         // multiply b by a
      	System.out.println("Product = " + product);             // print product
      	Complex quotient = a.divide(b);
      	System.out.println("Quotient = " + quotient);
      	Complex difference = a.subtract(b);
      	System.out.println("Difference = " + difference);
    }
}

/*
Output
3.0 + 2.0i
2.0 + 1.0i
Sum = 5.0 + 3.0i
Product = 4.0 + 7.0i
Quotient = 1.6 + 0.2i
Difference = 1.0 + 1.0i
*/