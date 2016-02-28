import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;


public class MapExample {

	//Map has key value pair

	public static void main(String[] args) {

		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();


		String fileContent = "";

		try
		{

			File file = new File("C://javasession/news.txt");

			if(file.exists())
			{
				FileReader reader = new FileReader(file);
				BufferedReader brReader  = new BufferedReader(reader);

				String line = "";
				while((line = brReader.readLine())!= null)
				{
					fileContent += line;
				}

				System.out.println("File Content : "+ fileContent);

			}
			else
			{
				System.out.println("No such file is present in specified path : "+ file.getAbsolutePath());
			}


		}
		catch(Exception e)
		{
			System.out.println("Exception caught while readin the file");
		}


		// Tokenize the String by space and extract the word


		StringTokenizer tokeninzer = new StringTokenizer(fileContent, " ");

		if(tokeninzer!=null)
		{
			while(tokeninzer.hasMoreTokens())
			{

				String word = tokeninzer.nextToken();
				Integer presentCount = wordCountMap.get(word);	
				if(presentCount!=null)
				{
					presentCount ++; 
					wordCountMap.put(word, presentCount);
				}
				else
				{
					wordCountMap.put(word, 1);
				}

			}

		}


		for(Entry<String, Integer> entry : wordCountMap.entrySet())
		{
			System.out.println("Word "+ entry.getKey() + " occured : "+ entry.getValue() + " times.");
		}



	}	


}
