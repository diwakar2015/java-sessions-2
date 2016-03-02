public class AccountManager {

	public static void main(String[] args) {

		Account account = new Account();
		
		//a1
		WithDrawer diwakar = new WithDrawer();
		diwakar.account = account;	
		diwakar.start();
		diwakar.setName("Diwakar-Thread");
		
		//a2
		WithDrawer shireesh = new WithDrawer();
		shireesh.account = account;	
		shireesh.start();
		shireesh.setName("Shireesh-Thread");
		
		//a3
		WithDrawer lavanya = new WithDrawer();
		lavanya.account = account;	
		lavanya.start();
		lavanya.setName("Lavanya-Thread");
		
		//a4
		WithDrawer xyz = new WithDrawer();
		xyz.account = account;	
		xyz.start();
		xyz.setName("XYZ-Thread");
		
		//a5
		WithDrawer mon = new WithDrawer();
		mon.account = account;	
		mon.start();
		mon.setName("MON-Thread");
		

		/*for(int i=1; i<=5; i++)
		{
			WithDrawer userThread = new WithDrawer();
			userThread.account = account;	
			userThread.start();
			userThread.setName("AccountHolder-"+i);
		}*/
	}
}
