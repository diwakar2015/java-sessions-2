
public class ThreadExample {

	public static void main(String[] args) {
		
/*		// 10 person -> prime numbers are present in between 1 to 20
		System.out.println("Started at : "+ Calendar.getInstance().getTime().toString());
		long startTime = Calendar.getInstance().getTimeInMillis();
		new PrimePrinterThread().printPrimerNumbers();
		System.out.println("Finished at : "+ Calendar.getInstance().getTime().toString());
		long endTime = Calendar.getInstance().getTimeInMillis();
		
		long timeDiff = endTime - startTime;
		double seconds = timeDiff/1000.0;
		System.out.println("Time taken to print all these numbers for all the persons : "+ seconds+ " seconds");*/
		
		Thread pt1 = new PrimePrinterThread();
		pt1.setName("PersonThread-1");
		
		Thread pt2 = new PrimePrinterThread();
		pt2.setName("PersonThread-2");
		
		Thread pt3 = new PrimePrinterThread();
		pt3.setName("PersonThread-3");
		
		Thread pt4 = new PrimePrinterThread();
		pt4.setName("PersonThread-4");
		
		Thread pt5= new PrimePrinterThread();
		pt5.setName("PersonThread-5");
		
		
		//allocate to Thread Scheduler
		// all threads moves to Runnable state
		pt1.start();
		pt2.start(); 
		pt3.start();
		pt4.start();
		pt5.start();
		
		
		//TS -> pt1, pt2,pt3,pt4,pt5
		// TS ->  allocate to the COre processoer to carry out the work -> means calling the run methd and that parictaulr thtead will move to Running state 1 to 10
		
		
		
		
		
	}

}
