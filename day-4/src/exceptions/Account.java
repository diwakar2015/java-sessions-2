package exceptions;

import java.util.Calendar;
import java.util.UUID;

public class Account {

	int balance = 100;

	public void withDraw(int amount) 
	{
		try
		{
			if(amount > balance)
			{

				throw new AccountBalanceException("Withdwaral amount is more than balance.");


			}
			else
			{
				this.balance = this.balance - amount;
				System.out.println("Amount withDrwan "+ amount
						+ " and now Balance  is : "+ this.balance);
			}
		}
		
		catch (AccountBalanceException e) {
			
		}
		
		catch (NullPointerException e) {
			
		}
	
		catch(Exception e)
		{
          System.out.println("Exception caught : "+ e);
		}
		
		finally
		{
			System.out.println("I will be called every time..");
			String transactionId = UUID.randomUUID().toString();
			System.out.println("Storing record : closing connnection "+ "Transaction Id : "+ transactionId);
			System.out.println("Transaction occured at : "+ Calendar.getInstance().getTime().toString());
		}


	}

}
