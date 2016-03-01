
public class PrimeChecker {
	
	public static boolean isPrime(int num)
	{
		boolean isPrime = true;

		for(int i = 2 ; i<=Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				isPrime = false;	
				break;
			}
		}
		
		return isPrime;
	}

}
