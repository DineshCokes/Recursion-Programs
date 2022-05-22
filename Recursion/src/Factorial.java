
public class Factorial 
{
	public static int fact(int a)
	{
		if(a==1)
		{
			return 1;
		}
		else
		{
			return a*fact(a-1);
		}
		
	}
	public static void main(String args[])
	{
		int result=fact(5);
		System.out.println(result);
		
	}

}
