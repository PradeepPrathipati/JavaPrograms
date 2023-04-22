import java.util.Scanner;
class Booking_Tickets2
{
	public static void bookDetails() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO ARJUN REDDY RAILWAY SERVICES");
		System.out.println();
		System.out.println("1 Enter the RailWay Services");
		System.out.println("2 Enter the Air Services");
		System.out.println("3 Enter the Road Services");
		System.out.println();
		System.out.println("Please Enter Your Services");
		System.out.println();
		int choice=scan.nextInt();
		if (choice==1 ||choice==2||choice==3)
		{
			System.out.println("Welcome to RailWay Services");
			System.out.println("");
			System.out.println("Starting point is Hyderbad");
			System.out.println("Select your Destination point");
			
			System.out.println("1 Vijayawada");
			System.out.println("2 Vizag");
			System.out.println("3 Chennai");
			
			
			System.out.println("");
			System.out.println("Choose Your Destination Piont");
			int ep=scan.nextInt();

			if (ep==1)
			{
				System.out.println("your Starting Point is Hyderbad");
				System.out.println("your Destinstion Point is Vijayawada");
				System.out.println("");
				System.out.println("Enter How Many tickets you Want");
				int ticket=scan.nextInt();
				
				if (true)
				{
					System.out.print("Enter Your Name = ");
					String name=scan.next();
					System.out.println("Enter Your Mobile Number = ");
					long mobile=scan.nextLong();
					System.out.println("Total Ticket Cost is "+(ticket*500)+" Rupes");
					System.out.print("Pay the Amount in rupes = ");
					int Amount=scan.nextInt();
					if (Amount==(ticket*500))
					{
						System.out.println("Your Payment is Done");
						System.out.println("");
						System.out.println("Ticket Details");
						System.out.println("");
						System.out.println("Passenger Name: "+name);
						System.out.println("Total Number of Tickets: "+ticket);
						System.out.println("PNR: 610873635");
						System.out.println("Transaction ID: 1000073635225");
						System.out.println("Boarding: Hyderbad");
						System.out.println("Destination: Vijayawada");
						System.out.println("Mobile No: "+mobile);
						System.out.println("Total Distance is = 350.0 km ");
						System.out.println("Time taken by distance is = 6 hr 5min ");
						System.out.println();

						System.out.println("Enter 1 for continue our services");
						System.out.println("Enter 2 for exit");
						System.out.println();

						int services=scan.nextInt();
						if (services==1)
						{
							MainClass2 m1=new MainClass2();
							m1.display();
						}
					}
					else
					{
						System.out.println("Please Enter correct Amount and Retry......");						}
					}			
	} 

			///Hyd to Vizag
			
			
			
			else if (ep==2)
			{
				System.out.println("your Starting Point is Hyderbad");
					System.out.println("your Destinstion Point is Vizag");
					System.out.println("");
					System.out.println("Enter How Many tickets you Want");
					int ticket=scan.nextInt();
					if (true)
					{
						System.out.print("Enter Your Name = ");
						String name=scan.next();
						System.out.println("Enter Your Mobile Number = ");
						long mobile=scan.nextLong();
						System.out.println("Total Ticket Cost is "+(ticket*500)+" Rupes");
						System.out.print("Pay the Amount in rupes = ");
						int Amount=scan.nextInt();
						if (Amount==(ticket*500))
						{
							System.out.println("Your Transection is Done");
							System.out.println("");
							System.out.println("Ticket Details");
							System.out.println("");
							System.out.println("PNR: 610873635");
							System.out.println("Passenger Name: "+name);
							System.out.println("Total Number of Tickets: "+ticket);
							System.out.println("Transaction ID: 1000073635225");
							System.out.println("Boarding: Hyderbad");
							System.out.println("Destination: Vizag");
							System.out.println("Mobile No: "+mobile);
							System.out.println("Total Distance is = 700.4.0 km ");
							System.out.println("Destination Time is = 12 hr 25min ");
							System.out.println();

							System.out.println("Enter 1 for continue our services");
							System.out.println("Enter 2 for exit");
							System.out.println();

							int services=scan.nextInt();
							if (services==1)
							{
								MainClass2 m1=new MainClass2();
								m1.display();
							}
						}
						else
						{
							System.out.println("Please Enter correct Amount and Retry......");
						}
					}
			}

			//// Hyd to Chennia

			else if (ep==3)
			{
				System.out.println("your Starting Point is Hyderbad");
					System.out.println("your Destinstion Point is Chennia");
					System.out.println("");
					System.out.println("Enter How Many tickets you Want");
					int ticket=scan.nextInt();
					
					if (true)
					{
						System.out.print("Enter Your Name = ");
						String name=scan.next();
						System.out.println("Enter Your Mobile Number = ");
						long mobile=scan.nextLong();
						System.out.println("Total Ticket Cost is "+(ticket*500)+" Rupes");
						System.out.print("Pay the Amount in rupes = ");
						int Amount=scan.nextInt();
						if (Amount==(ticket*500))
						{
							System.out.println("Your Transection is Done");
							System.out.println("");
							System.out.println("Ticket Details");
							System.out.println("");
							System.out.println("PNR: 610873635");
							System.out.println("Passenger Name: "+name);
							System.out.println("Total Number of Tickets: "+ticket);
							System.out.println("Transaction ID: 1000073635225");
							System.out.println("Boarding: Hyderbad");
							System.out.println("Destination: Chennia");
							System.out.println("Mobile No: "+mobile);
							System.out.println("Total Distance is = 1337.4.0 km ");
							System.out.println("Destination Time is = 18 hr 26min ");
							System.out.println();

							System.out.println("Enter 1 for continue our services");
							System.out.println("Enter 2 for exit");
							System.out.println();

							int services=scan.nextInt();
							if (services==1)
							{
								MainClass2 m1=new MainClass2();
								m1.display();
							}
						}
						else
						{
							System.out.println("Please Enter correct Amount and Retry......");
						}
					}	
		
			}
		}
		else if (choice==2)
		{
			System.out.println("Tickets are NOT AVALIABLE......");
		}
		else if (choice==3)
		{
			System.out.println("Tickets are NOT AVALIABLE Sorry for that :)");
		}
		else 
		{
			System.out.println("Enter valid input");

		}

	}
}