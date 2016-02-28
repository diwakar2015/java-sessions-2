package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserDefinedException {
	
	public static void main(String[] args) {
	
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		 Account acc = new Account();
		while(true)
		{
			
			try
			{
			System.out.println("Account Balance Is : "+ acc.balance);
		    System.out.println("Enter the amount to withdraw");
		    int amount = Integer.parseInt(br.readLine());
		    acc.withDraw(amount);
		  	
			}
			catch(Exception e)
			{
				System.out.println("Exception : "+ e);
				break;
			}
			
			
			
		}
		
	}
	
	

}
