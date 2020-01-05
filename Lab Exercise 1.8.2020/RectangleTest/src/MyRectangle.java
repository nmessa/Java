// Rectangle.java
// Lab Exercise 1.8.2020
// Author: 

class MyRectangle {
	private int top, bottom, left, right;
	
	public MyRectangle(int l, int r, int t, int b)
	{
		//Add code here
		
	}
	
	public MyRectangle(MyRectangle other)
	{
		//Add code here
		
	}
	
	public boolean isEmpty()
	{
		//Add code here
		
	}
	
	public boolean isInside(int x, int y, int r)
	{
		//Add code here
		
	}
	
	public boolean isInside(int x, int y)
	{
		//Add code here
		
	}
	
	public String toString()
	{
		String s = "";
		s += "Left = " + Integer.toString(left) + "\n";
		s += "Right = " + Integer.toString(right) + "\n";
		s += "Top = " + Integer.toString(top) + "\n";
		s += "Bottom = " + Integer.toString(bottom) + "\n";
		return s;
	}		
}
