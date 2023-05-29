package tushar;

class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	{
		super(str);
		
	}
}

public class UdeMain 
{
	public static void main(String[]args) 
	{
		try 
		{
			throw new UserDefinedException("This is User Defined Exception");
		}
		catch(UserDefinedException u)
		{
			System.out.println(u);
		}
	}
}
