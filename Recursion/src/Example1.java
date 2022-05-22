
public class Example1 
{
	public static void main(String args[])
	{
		System.out.println("Factorial of number 5 using recursion "+factorial(5));
		
		
		
		

		
		
	}
	public static int factorial(int number)
	{
		if(number<=1)
		{
			return 1;
		}
		return number*factorial(number-1);
		
	}

}

