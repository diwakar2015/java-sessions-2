
public class ArrayExample {
	
	
	
	public static void main(String[] args) {
		
		int num [] = new int[5];
		
		int length = num.length;
		
	    for(int i=0; i<=length ; i++)
	    {
	    	num[i]= 10+i;
	    }
		
		
	    for(Integer nx : num)
		{
			System.out.println(nx);
		}
		
		
	}

}
