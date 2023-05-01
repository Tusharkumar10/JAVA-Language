package tushar;

interface Bike
{
	 void speed();
}

interface SportsBike
{
	void speed1();
}

class Auto implements Bike,SportsBike
{
	public void speed()
	{
		System.out.println("Bike is created\n");
	}
	public void speed1()
	{
		System.out.println("Running Safely");
	}
	
	
}
public class MultipleInheritance extends Auto  {
	public static void main(String[]args)
	{
	MultipleInheritance  m1=new MultipleInheritance();
	m1.speed();
	m1.speed1();	
	Auto a1=new Auto();
	a1.speed();
	a1.speed1();
		
	}

}
