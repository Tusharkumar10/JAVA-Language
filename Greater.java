package tushar;
import java.util.Scanner;
public class Greater {
public static void main(String[]args) {
	int a,b,c;
Scanner scan=new Scanner(System.in); 
System.out.println("Enter three numbers to find which number is greater");
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
if(a>b && a>c)
	System.out.println(a+" is greater. ");
else if(b>c)
	System.out.println(b+" is greater. ");
else
	System.out.println(c+" is greater. ");


}
}
