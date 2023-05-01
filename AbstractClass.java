package tushar;
import java.util.Scanner;

abstract class Bank1
{
	static int BankIFSC = 1001001;
	static String BankName = "Axis Bank";
     int AccountNumber ;
     String AccHoldName;
    
	abstract void accountDetails();
	void getData()
	{
		
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Account Holder Name.");
         AccHoldName=sc.nextLine();
         System.out.println("Enter the Account Number.");
         AccountNumber=sc.nextInt();
		
	}
}

class Bank2 extends Bank1
{
	void accountDetails()
	{
		System.out.println("Account Holder Name = "+AccHoldName);
		System.out.println("Enter the Account Number = "+AccountNumber);
		System.out.println("Bank name = "+BankName);
		System.out.println("Bank IFSC code = "+BankIFSC);
		
	}
	
}

public class AbstractClass 
{
	public static void main(String[]args) 
	{
		Bank2 obj=new Bank2();
		obj.getData();
		obj.accountDetails();
	}
	

}
