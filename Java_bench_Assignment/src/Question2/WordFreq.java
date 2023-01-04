package Question2;

import java.io.*;
import java.util.*;


public class WordFreq {
	
	public static void main(String args[]) throws IOException
	{
		String path="C://Users//prashant04//eclipse-workspace//Java_bench_Assignment//src//Question2//input.txt";
		FileReader f = new FileReader(path);
		BufferedReader br = new BufferedReader(f);
		
		ArrayList<String> arr = new ArrayList<String>();
		Map<String,Integer>a = new HashMap<String,Integer>();
		String Line;
		
		while((Line = br.readLine())!=null)
		{
			String words[] = Line.split(" ");
			for(int i=0;i<words.length;i++)
			{
				arr.add(words[i]);
			}
		}
		
		for(String w:arr)
		{
			int count = Collections.frequency(arr,w);
			a.put(w, count);
			
		}
		
		for(String key:a.keySet())
		{
			System.out.println(key+" = "+a.get(key));
		}
		br.close();
	}
}
