//Crypto.java
//Author: 
//Date: 9.26.2019
//Crypto Class that can encrypt and decrypt strings

class Crypto {
	
	//Constructor that informs the user the an object has been created.
	public Crypto()
	{
		System.out.println("Cryptological Object Created");
	}
	
	//Encrypt method
	public String encrypt(String str)
	{
		String s = "";
		for (int i = 0; i < str.length(); i++)
		{
			switch (str.charAt(i))
			{
				case 'v': s += "ag',r";
							break;
				case 'V': s += "ag',r";
							break;
				case 'm': s += "ssad";
							break;
				case 'M': s += "ssad";
							break;
				case 'g': s += "jeb..w";
							break;
				case 'G': s += "jeb..w";
							break;
				case 'b': s += "dug>?/";
							break;
				case 'B': s += "dug>?/";
							break;
				default: s += str.charAt(i);			
			}
		}
		return s;
	}
	
	//decrypt method
	public String decrypt(String str)
	{
		str = str.replaceAll("ag',r", "v");
		str = str.replaceAll("ssad", "m");
		str = str.replaceAll("jeb..w", "g");
		//str = str.replaceAll("dug>?/", "b"); - does not work
		while (str.contains("dug>?/"))
			str = str.replace("dug>?/", "b");
		return str;
	}
}
