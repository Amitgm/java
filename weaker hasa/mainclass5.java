class Account 
{
	public void deposit(int amt) 
	{
		System.out.println("amt is deposited to account");
	}

	public void withdraw(int amt)
		{
		System.out.println("amt is withdrawn from account");
	   }

}
	class savings extends Account	
		{
		
		public void showroi()
			{
           System.out.println("Show roi");
			}
		}
			
			class loan extends Account
			{
				public void showpendingloan()
				{
					System.out.println("show pending loan");
			  }
			}
				class mainclass5
				{
					public static void main(String[] args) 
					{
						System.out.println("program starts");
						    loan l1=new loan();
							l1.deposit(5000);
							l1.withdraw(3000);
							l1.showpendingloan();
							System.out.println(" ");
						     savings s1=new savings();
							  s1.deposit(6000);
							  s1.withdraw(2000);
							  s1.showroi();
						  System.out.println("program ends");
						  }
				}

