class WithDrawer extends Thread
{
	Account account;

	public void run()
	{

		try {
			System.out.println("Going to withdraw money from account  "+ " by "+ Thread.currentThread().getName() + " Balance is "+ account.balance);
			account.withdraw(100);
		} catch (Exception e) {

			System.out.println("Exception :"+ e);
		}

	}

}

//TS
// a1, , , , 
//a4 -> line-9 start from line 10
//a5 -> line-9 start from line 10
//a3 -> line 12 and did not update the balance

//Running state -> Allocated to Core processor for processing the operation
//a2

