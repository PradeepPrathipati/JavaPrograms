import java.util.Scanner;
class Cricket
{
	public void info()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" WELCOME TO SUPER OVER MATCH ");
		System.out.println();
		System.out.println(" Enter 1 for Selecting Team = ");
		
		System.out.println();
		System.out.print("Enter your choice = ");
		int choice=scan.nextInt();
		switch (choice)
		{
		case 1:
			{
			System.out.println("Select the Your Team ");
			System.out.println("");
			System.out.println("1 INDIA ");
			System.out.println("2 PAKISTAN ");
			System.out.println("3 SRI LANKA ");
			System.out.println("4 AFGHANISTAN");
			System.out.println("5 BANGLADESH");
			System.out.println("");

			System.out.print("Enter Your Team = ");
			int ch1=scan.nextInt();
			switch (ch1)
			{
			case 1: 
				{
				System.out.println("YOUR TEAM IS INDIA");
				System.out.println("OPPOSITE TEAM IS PAKISTAN");
				System.out.println("");
				System.out.println("Choose one Head or Tail");
				System.out.println("");
				System.out.println("Enter 1 for Head");
				System.out.println("Enter 2 for Tail");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				int toss=scan.nextInt();
				switch (toss)

					{
					case 1:
					case 2:
						{
						System.out.println("");
						System.out.println("PAKISTAN WON THE TOSS AND OPT TO BAT");
						System.out.println("");
						System.out.println("ENTER 1 FOR TO START THE MATCH ");
						System.out.println("ENTER 2 FOR LEAVE THE MATCH");
						System.out.println("");
						System.out.println("");
						int start=scan.nextInt();
						switch (start)
							{
							case 1:
								{
								System.out.println("PAKISTAN SCORE");
								System.out.println("---------------");
								System.out.println("PAK-13/2");
								System.out.println("");
								System.out.println("IND TARGET IS 14-RUNS TO WIN AND LEFT 6-BALLS");
								System.out.println("");
								System.out.println("ENTER 1 FOR TO START BATTING INDIA");
								System.out.println("ENTER 2 FOR EXIT MATCH");
								int st2=scan.nextInt();
								if (st2==1)
								{
									System.out.println("");
									System.out.println("Batting");
									System.out.println("Virat Kohil ");
									System.out.println("Suresh raina*");
									System.out.println("");
									System.out.println("ENTER 1 FOR TO START 1ST BALL");
									System.out.println("ENTER 2 FOR EXIT");
									int St1=scan.nextInt();
									switch (St1)
									{
									case 1:
										{
										
										System.out.println("");
										
										System.out.println("SELECT RUNS");
										System.out.println("Enter 1 for 1-run");
										System.out.println("Enter 2 for 2-runs");
										System.out.println("Enter 3 for !! 4-runs !!");
										System.out.println("Enter 4 for !! 6-runs !!");
										int run=scan.nextInt();
										if (run==1||run==2||run==4||run==3)
											{
											System.out.println("BALL IS NO BAT");
											System.out.println("PAK GO FOR REVIEW");
											System.out.println("ENTER FOR 1 TO SEE FOR EMPIRE DECITION");
							
											int ch=scan.nextInt();
											switch (ch)
												{
												case 1:
													{
													System.out.println(" Suresh Raina is OUT (lbw)!!");
													System.out.println("");

													System.out.println("Next To bat DHONI");
													System.out.println("Enter 1 for 2nd ball");
													System.out.println("Enter 2 for Skip Ball");

													System.out.println("");
													int ball=scan.nextInt();
													if (ball==1)
														{
														System.out.println("SELECT RUNS");
														System.out.println("");
														System.out.println("Enter 1 for 1-run");
														System.out.println("Enter 2 for 2-runs");
														System.out.println("Enter 3 for !! 4 !!");
														System.out.println("Enter 4 for !! 6 !!");
														System.out.println("");
														int b1=scan.nextInt();
														if (b1==1||b1==2||b1==4)
															{
															System.out.println("");
															System.out.println("!! 2-runs !!");
															System.out.println("Score: IND-2-1");
															System.out.println("");
															System.out.println("Dhoni-1(2)           Virat-0(0)*");
															System.out.println("");
															}
															else if (b1==3)
															{
															System.out.println("");
															System.out.println("!! Six..!!");
															System.out.println("Score: IND-6-1");
															System.out.println("");
															System.out.println("Dhoni-6(1)           Virat-0(0)*");
															System.out.println("");
															}
														}
													}
													case 2:
													{
														System.out.println("Enter 1 for 3rd ball");
														System.out.println("Enter 2 for Skip Ball");
	
														System.out.println("");
														int b3=scan.nextInt();
														if (b3==1)
															{
															System.out.println("SELECT RUNS");
															System.out.println("");
															System.out.println("Enter 1 for 1-run");
															System.out.println("Enter 2 for 2-runs");
															System.out.println("Enter 3 for !! 4 !!");
															System.out.println("Enter 4 for !! 6 !!");
															System.out.println("");
														
															int b1=scan.nextInt();
															if (b1==1||b1==2||b1==4)
																{
																System.out.println("");
																System.out.println("!! Four !!");
																System.out.println("Score: IND-6-1");
																System.out.println("");
																System.out.println("Dhoni-2(1)           Virat-4(1)*");
																System.out.println("");
																}
																else if (b1==3)
																	{
																	System.out.println("");
																	System.out.println("!! 2-runs..!!");
																	System.out.println("Score: IND-4-1");
																	System.out.println("");
																	System.out.println("Dhoni-2(1)           Virat-2(1)*");
																	System.out.println("");
																	}
															}
													}




													case 3:
													{
														System.out.println("Enter 1 for 4th ball");
														System.out.println("Enter 2 for Skip Ball");
	
														System.out.println("");
														int b4=scan.nextInt();
														if (b4==1)
															{
															System.out.println("SELECT RUNS");
															System.out.println("");
															System.out.println("Enter 1 for 1-run");
															System.out.println("Enter 2 for 2-runs");
															System.out.println("Enter 3 for !! 4 !!");
															System.out.println("Enter 4 for !! 6 !!");
															System.out.println("");
														
															int b1=scan.nextInt();
															if (b4==1||b4==2||b1==4)
																{
																System.out.println("");
																System.out.println("!! 2-runs !!");
																System.out.println("Score: IND-8-1");
																System.out.println("");
																System.out.println("Dhoni-2(1)           Virat-6(2)*");
																System.out.println("");
																}
																else if (b4==3)
																	{
																	System.out.println("");
																	System.out.println("!! Six..!!");
																	System.out.println("Score: IND-10-1");
																	System.out.println("");
																	System.out.println("Dhoni-2(1)           Virat-8(2)*");
																	System.out.println("");
																	}
																}
													}






													case 4:
													{
														System.out.println("Enter 1 for 5th ball");
														System.out.println("Enter 2 for Skip Ball");
	
														System.out.println("");
														int b51=scan.nextInt();
														if (b51==1)
															{
															System.out.println("SELECT RUNS");
															System.out.println("");
															System.out.println("Enter 1 for 1-run");
															System.out.println("Enter 2 for 2-runs");
															System.out.println("Enter 3 for !! 4 !!");
															System.out.println("Enter 4 for !! 6 !!");
															System.out.println("");
														
															int b5=scan.nextInt();
															if (b5==1||b5==2||b5==4)
																{
																System.out.println("");
																System.out.println("!! Wicket (c) !!");
																System.out.println("Score: IND-8-2");
																System.out.println("");
																System.out.println("Dhoni-2(1)           Virat-6(2)*");
																System.out.println("");
																}
																else if (b5==3)
																	{
																	System.out.println("");
																	System.out.println("!! Wicket !!");
																	System.out.println("Score: IND-4-2");
																	System.out.println("");
																	System.out.println("Dhoni-2*(1)          ");
																	System.out.println("");
																	}
																}
													}





													case 5:
													{
														System.out.println("Enter 1 for Last ball");
														System.out.println("Enter 2 Skip Ball");
	
														System.out.println("");
														int b4=scan.nextInt();
														if (b4==1)
															{
															System.out.println("SELECT RUNS");
															System.out.println("");
															System.out.println("Enter 1 for 1-run");
															System.out.println("Enter 2 for 2-runs");
															System.out.println("Enter 3 for !! 4 !!");
															System.out.println("Enter 4 for !! 6 !!");
															
															System.out.println("");
														
															int b6=scan.nextInt();
															if (b6==4)
																{
																System.out.println("");
																System.out.println("!! Sixer !!");
																System.out.println("Score: IND-14-2");
																System.out.println("");
																System.out.println("Dhoni-8*(2)           DK-0(0)*");
																System.out.println("");
																System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * * *                                               * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * *                                                   * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * *                                                       * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * *                                                           * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * *                                                               * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * *                         IND WON BY 8-WICKETS                      * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * *                                                                       * * * * * * * * * *");
																	System.out.println("* * * * * * * * *                                                                           * * * * * * * * *");
																	System.out.println("* * * * * * * *                                                                               * * * * * * * *");
																	System.out.println("* * * * * * *                                                                                   * * * * * * *");
																	System.out.println("* * * * * *                                                                                       * * * * * *");
																	System.out.println("* * * * *                                                                                           * * * * *");
																	System.out.println("* * * *                                                                                               * * * *");
																	System.out.println("* * *                                                                                                   * * *");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
													}
																else if (b6==3||b6==1||b6==2)
																{
																	System.out.println("");
																	System.out.println("!! Four..!!");
																	System.out.println("Score: IND-12-2");
																	System.out.println("");
																	System.out.println("Dhoni-6(2)           DK-0(0)");
																	System.out.println("");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * * *                                               * * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * * *                                                   * * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * * *                                                       * * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * * *                                                           * * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * * *                                                               * * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * * *                           PAK WON BY 1-RUN                        * * * * * * * * * * *");
																	System.out.println("* * * * * * * * * *                                                                       * * * * * * * * * *");
																	System.out.println("* * * * * * * * *                                                                           * * * * * * * * *");
																	System.out.println("* * * * * * * *                                                                               * * * * * * * *");
																	System.out.println("* * * * * * *                                                                                   * * * * * * *");
																	System.out.println("* * * * * *                                                                                       * * * * * *");
																	System.out.println("* * * * *                                                                                           * * * * *");
																	System.out.println("* * * *                                                                                               * * * *");
																	System.out.println("* * *                                                                                                   * * *");
																	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
																	

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
																	
																}
													}















													



























													}
												}
											}



















										}
									}














								}
							}




					    }


















					}
				}
				
				
			
					
					
			
			
			
			
			
			
			
			
			
			
			}
			
			
			}

		break;












		case 2:
			{
			// same operation like case 1
			}
			default : System.out.println("Enter invalid input");
		}

	}
}
