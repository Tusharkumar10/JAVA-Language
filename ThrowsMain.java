package tushar;

class Voter
{
   int age;
   Voter(int age)
   {
	   this.age=age;
   }
           
   boolean checkAge()throws Exception
   {
	   if(age<18)
	   {
		   throw new Exception("You are not eligible to vote ");
		  
	   }
	   else
	   {
		   return true;
	   }
   }
   void checkValidity() throws Exception
   {
	   if(checkAge())
	   {
		   System.out.println("You can vote");
	   }
   }
}

public class ThrowsMain
{
	public static void main(String[]args) 
	{
	
	Voter obj = new Voter(17);
	
	try {
		obj.checkValidity();
		
	}
	catch (Exception e){
		 System.out.println(e);
	}
}}
