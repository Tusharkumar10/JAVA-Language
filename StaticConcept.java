package tushar;

class Bank{
	static String BankName;         // Static variable
	static int BankIfscCode;        // Static variable
	int accNo;                      //Instance variable
	String userName;                //Instance variable
	
	public static void account(String s,int n)  // Static method
	{
	    BankName=s;
		BankIfscCode=n;
	}
	
	public void getData(int n, String s)   //Instance method
	{
		accNo=n;
	    userName=s;
	}
	
	public void putData()      //Instance method
	{
		System.out.println(" Account Number = " +accNo);
		System.out.println(" User Name = " +userName);
		System.out.println(" Bank Name = " +BankName);
		System.out.println(" Bank IFSC Code = " +BankIfscCode);
	}
}

public class StaticConcept {
	
	static String CollegeName;    // Static variable
	int rollNo;                   //Instance variable
	String name;                  //Instance variable
	
	StaticConcept(int r,String n)   //Instance method
	{
		 rollNo=r;
		 name=n;
	}
	
	public void disp()          //Instance method
	{
		System.out.println(" Roll_no = " +rollNo);
		System.out.println(" Name = " +name);
		System.out.println(" College Name = " +CollegeName);
		
	}
	
	static     // Static block
	{
		
	}
	
	
	public static void main(String[]args) {
		
		StaticConcept.CollegeName="KIET Group of Institutions";      
		StaticConcept sc1 = new 	StaticConcept(1,"Aman");
		sc1.disp();
		StaticConcept sc2 = new 	StaticConcept(2,"Bittu");
		sc2.disp();
		
	
		Bank.account("AXIS Bank", 1001);
		Bank sc4 = new Bank();
		
	//	Invoking the getData() method of Bank class 
		
		sc4.getData(1,"Tushar Kumar");
        sc4.putData();
        Bank.account("HDFC Bank", 1002);
		
		sc4.getData(2,"Ankita pandey");
        sc4.putData();
	
	}
	

}

