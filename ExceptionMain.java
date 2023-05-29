package tushar;

public class ExceptionMain
{
	public static void main(String[]args) 
	{
	
	 try
      {
		int a=3/0;
		System.out.println("Try block");
		System.out.println(a);
 	 
	  }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Catch block");
		 System.out.println(e);
	 }
	 finally
	 {
		 int a=10,b=20;
		 System.out.println("Finally block will be execute either exception arrise or not ");
		 System.out.println("Sum = "+(a+b));
	 }
   }
}
