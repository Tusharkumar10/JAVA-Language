package tushar;

class Number
{
private double num;
Number(double num)
{
this.num=num;	
}

public boolean isZero()
{
	if(num==0)
	{
	return true;
	}
	else return false;
}
public boolean isPositive()
{
	if(num>0)
	return true;
	else 
		return false;
}
public boolean isNegative()
{
	if(num<0)
		return true;
		else 
			return false;
}
public boolean isOdd()
{
	if(num%2!=0)
		return true;
		else 
			return false;
}
public boolean isEven()
{
	if(num%2==0)
		return true;
		else 
			return false;
}
public boolean isPrime()
{
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
			return false;
	}
	
	return true;
		
}
public boolean isArmstrong()
{
	double temp=num,rem,sum=0;
	 while(temp>0)
	 {
		 rem=temp%10;
		 sum=sum+rem*rem*rem;
		 temp=temp/10;
	 }
	 if(sum==num)
		 return true;
	 else 
		 return false;
}
}


public class NumberMain
{
	public static void main(String[]args)
	{
	   
	    Number obj=new Number(153);
		
		System.out.println("Zero = "+obj.isZero());
		System.out.println("Positive = "+obj.isPositive());
		System.out.println("Negative = "+obj.isNegative());
		System.out.println("Odd = "+obj.isOdd());
		System.out.println("Even = "+obj.isEven());
		System.out.println("Prime = "+obj.isPrime());
		System.out.println("Armstrong = "+obj.isArmstrong());
		
	
	}
}
	

