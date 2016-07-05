import java.util.*;
class bank_info
{
	private String accnt;
	private int deposit;
	private String name;
	
	
	bank_info()//default constructor
	{
		deposit=0;
		
		}
		
		//function to get the account information
		void get_info()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your Name:");
			if(sc.hasNext())
				name=sc.next();
			System.out.print("Enter your Account No:");
			if(sc.hasNext())
				accnt=sc.next();
				
			
		}
		
		//function to display information
		void display_info()
		{
			System.out.println("Name :"+ name);
			System.out.println("Account number :"+ accnt);
			System.out.println("Deposit :"+ deposit);
		}
		
			//function to deposit money
			int deposit_amount()
			{
				System.out.println("Enter the amount you want to deposit");
				Scanner sc=new Scanner(System.in);
				deposit=deposit+sc.nextInt();
				return deposit;
				}
				
				//function to withdraw money
				int withdraw_amount()
				{
				System.out.println("Enter the amount you want to withdraw");
				Scanner sc=new Scanner(System.in);
				
				if(deposit>sc.nextInt())
				{
					deposit=deposit-sc.nextInt();
					return deposit;
				}
				else
					return 0;
				
				}
	}
	public class atm
	{
		public static void main(String []a)
		{
			
			int opt=0;
			bank_info bi=new bank_info();
			bi.get_info();
			int i=0;
			
			while(true)
			{
			System.out.print("\nEnter 1 for Balance enquiry\nEnter 2 to Deposit amount\nEnter 3 to withdraw amount\nEnter 4 to exit\n");
			Scanner sc1=new Scanner(System.in);
			if(sc1.hasNextInt())
			opt=sc1.nextInt();
			else
			{
			System.out.println("Invalid Input-Please follow the instruction shown below");
			continue;
			}
			switch(opt)
			{
				case 1 : bi.display_info();
						break;
				case 2 : System.out.println("New Balance in your account is :"+bi.deposit_amount());
						break;
				case 3 : System.out.println(bi.withdraw_amount()>0?("New Balance in your account is :"+bi.withdraw_amount()):"Insufficient Balance");
						break;
				case 4: System.out.println("Have a nice day");
						return;
						
				default : System.out.println("Invalid Option");
			 }
				
			
			
		}
		
		}
	}
