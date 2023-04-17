package tushar;
import java.util.Scanner;
public class Room {
	int roomNo;
	String roomType;
	float roomArea;
	int AcMachine;
	
	Scanner scan=new Scanner(System.in); 
	
	
	public void  SetData(){
		System.out.println("Enter the room number ");
		roomNo=scan.nextInt();
		System.out.println("Enter the room type ");
		roomType=scan.next();
		System.out.println("Enter the room area in Square feet ");
		roomArea=scan.nextFloat();
		System.out.println("How many AC machine you want in your room");
		AcMachine=scan.nextInt();
		
	}
	public void SetDisplay() {
		System.out.println("Your room number : "+roomNo);
		System.out.println("Your room type : "+roomType);
		System.out.println("Your room area : "+roomArea+" square feet");
		System.out.println("AC available in your room : "+AcMachine);
	}
	
	public static void main(String[]args) {
		Room r=new Room();
		r.SetData();
		r.SetDisplay();
		
	}
	
	
}
