/* Fraction class using static methods
 * Author: nmessa
 * Date: 10/12/2014
 */

public class Fraction
{
	private int myNumerator;
	private int myDenominator;
	private double myDecimal;
	
	Fraction()
	{
		myNumerator = 0;
		myDenominator = 1;
		myDecimal = 0.0;
	}
	
	Fraction(int n, int d)
	{
		myNumerator = n;
		myDenominator = d;
		myDecimal = (double)n/(double)d;
		reduce();
	}
	
	public int getNumerator()
	{
		return myNumerator;
	}
	
	public int getDenominator()
	{
		return myDenominator;
	}
	
	public void setNumerator(int n)
	{
		myNumerator = n;
	}
	
	public void setDenominator(int d)
	{
		myDenominator = d;
	}

	public double getDecimal()
	{
		return myDecimal;
	}
	
	public static Fraction add(Fraction a, Fraction b)
	{
		Fraction temp;
		int num, den;
		num = a.myNumerator * b.getDenominator() + b.getNumerator() * a.myDenominator;
		den = a.myDenominator * b.getDenominator();
		temp = new Fraction(num, den);
		return temp;
	}
	
	public static Fraction subtract(Fraction a, Fraction b)
	{
		Fraction temp;
		int num, den;
		num = a.myNumerator * b.getDenominator() - b.getNumerator() * a.myDenominator;
		den = a.myDenominator * b.getDenominator();
		temp = new Fraction(num, den);
		return temp;
	}
	
	public static Fraction multiply(Fraction a, Fraction b)
	{
		Fraction temp;
		int num, den;
		num = a.myNumerator * b.getNumerator();
		den = a.myDenominator * b.getDenominator();
		temp = new Fraction(num, den);
		return temp;
	}
	
	public static Fraction divide(Fraction a, Fraction b)
	{
		Fraction temp;
		int num, den;
		num = a.myNumerator * b.getDenominator();
		den = a.myDenominator * b.getNumerator();
		temp = new Fraction(num, den);
		return temp;
	}
	
	public void recipricate()
	{
		int temp;
		temp = myNumerator ;
		myNumerator = myDenominator;
		myDenominator = temp;
		myDecimal = (double)myNumerator/(double)myDenominator;
	}
	
	private int gcd(int a, int b)
	{
		int remainder;
		remainder = a % b;
		while (remainder != 0)
		{
			a = b;
			b = remainder;
			remainder = a % b;
		}
		return b;	
	}
	
	private void reduce()
	{
		int g;
		g = gcd(myNumerator, myDenominator);
		myNumerator /= g;
		myDenominator /= g;	
	}

	public void print()
	{
		System.out.print(myNumerator + "/" + myDenominator);
	}
}