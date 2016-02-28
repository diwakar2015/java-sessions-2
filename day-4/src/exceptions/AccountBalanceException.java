package exceptions;

public class AccountBalanceException extends Exception{
	
	AccountBalanceException(String exceptionMessage)
	{
		super(exceptionMessage);
	}

}
