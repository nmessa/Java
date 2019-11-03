/**
 * @(#)ParameterPassing.java
 *
 * ParameterPassing application
 *
 * @nmessa 
 * @version 1.00 2016/11/7
 */
 
public class ParameterPassing {
    
    public static void main(String[] args) {
    	
    	int number1, number2;
		number1 = 100;
		number2 = 200;
    	int numbers[] = {1,2,3,4,5};
    	BankAccount joe = new BankAccount();
    	joe.balance = 1000;
    	swap(number1, number2);		//Pass by value
    	doubleNumbers(numbers);		//Pass by reference
    	doubleBalance(joe);			//Pass by reference
    	System.out.println("Number 1 = " + number1);
    	System.out.println("Number 2 = " + number2);
    	for (int i = 0; i < numbers.length; i++)
    	{
    		System.out.print(numbers[i] + " ");
    	}
    	System.out.println();
    	System.out.println(joe.balance);
    }
    
    public static void swap(int num1, int num2)
    {
    	int temp;
    	temp = num1;
    	num1 = num2;
    	num2 = temp;
    }
    
    public static void doubleNumbers(int a[])
    {
    	for (int i = 0; i < a.length; i++)
    	{
    		a[i] *= 2;
    	}
    }
    
    public static void doubleBalance(BankAccount person)
    {
    	person.balance *= 2;
    }
}
