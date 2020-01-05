/*Frame class definition
 *Holds all state information for the frame
 *Author: nmessa
 *Date: 1.7.2015
 **/
 
class Frame {
	//Frame state variables
	//Public to avoid writing many accessor methods
	public int one;
	public int two;
	public int rolls;
	public boolean closed;
	public boolean strike;
	public boolean spare;
	public int frameScore;
	public int frameNumber;
	
	//Frame constructor
	public Frame(int num)
	{
		rolls = 0;
		closed = false;
		strike = false;
		spare = false;
		frameScore = 0;
		frameNumber = num;
	}
	
	//Process each roll according to the rules of bowling
	public void roll(int value)
	{
		switch (rolls)
		{
			case 0:
				one = value;
				rolls++;
				if (value == 10)
				{
					closed = true;
					strike = true;	
				}
				break;
			case 1:
				two = value;
				rolls++;
				closed = true;
				if (one + two == 10)
					spare = true;
				break;
		}
	}
	
	//Prints the state of a frame
	public void printFrame()
	{
		System.out.println("Frame Number " + frameNumber);
		System.out.println("One = " + one);
		System.out.println("Two = " + two);
		System.out.println("Rolls = " + rolls);
		System.out.println("Closed = " + closed);
		System.out.println("Strike = " + strike);
		System.out.println("Spare = " + spare);
		System.out.println("Frame Score = " + frameScore);
		System.out.println();
	}
}
