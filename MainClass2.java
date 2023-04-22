import java.util.Scanner;
class MainClass2
{

	public void display()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Welcome to Pradeep Adda");
		System.out.println();
		System.out.println("Enter 1 for to play super over match");
		System.out.println("Enter 2 for to go for atm");
		System.out.println("Enter 3 for booking tickets");
		System.out.println("Enter 4 for booking tickets-2");
		System.out.println();
		int choice=scan.nextInt();
		if (choice==1)
		{
			Cricket c1= new Cricket();
			c1.info();
		}
		else if (choice==2)
		{
			Atm_project a1=new Atm_project();
			a1.atmDetails();
		}
		else if (choice==3)
		{
			Booking_Tickets b1=new Booking_Tickets();
			b1.bookDetails();
		}
		else if (choice==4)
		{
			Booking_Tickets2 b1=new Booking_Tickets2();
			b1.bookDetails();
		}
		else 
		{
			System.out.println("Enter valid input");
			
		}
		System.out.println("Thank you for visiting ");
	}
}