public class PrimePrinterThread extends Thread{

	private static final int LOWER_LIMIT = 2;
	private static final int UPPER_LIMIT = 10;

	//signature and method type and definition has to be
	@Override
	public void run()
	{
			System.out.println("Printing all the prime nunmbers(from 2 to 10) for Thread =>  "+ Thread.currentThread().getName());
			
			for(int j = LOWER_LIMIT; j<=UPPER_LIMIT; j++)
			{
				boolean isPrime = PrimeChecker.isPrime(j);
				if(isPrime)
				{
					System.out.println("Prime Number : "+ j + " for Person Thread =>  "+Thread.currentThread().getName());
				}

			}
			
			System.out.println("Printing is over for Thread =>  "+ Thread.currentThread().getName());
	}

}
