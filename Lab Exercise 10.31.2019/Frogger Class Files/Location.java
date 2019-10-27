//Location.java
//Author: nmessa
//Date: 10/15/2010

public class Location
{
	public int x;
	public int y;
	
	public Location()
	{
		x = 15;
		y = 15;
	}
	
	public Location(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public String toString()
	{
		String output;
		output = "(" + x + ", " + y + ")";
		return output;
	}
}