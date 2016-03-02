class Account 
{
	int balance = 5000;
	
	private static final Object LOCK = new Object();

	public  void withdraw(int amount) throws InSufficientBalanceException, InterruptedException
	{
		//2nd thread will movoed to blocked state pr waiting state
		synchronized (LOCK) {
			
			int diff = balance - amount;
			if(diff>0)
			{

				balance = balance- amount;
				System.out.println("Withdrew amount : "+amount +  " and now balance is : "+  balance + " by "+ Thread.currentThread().getName());
			
				
				if(balance<0)
				{
					throw new InSufficientBalanceException("Balance can not be negative.");
				}
			}
		
			
		}
		
	}

}