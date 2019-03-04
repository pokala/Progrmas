package com.interview;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item;


public class MyRandom {
	 private Random randomGenerator;
	    private ArrayList<Item> catalogue;

	    public MyRandom()
	    { 
	        catalogue = new ArrayList<Item>();
	        randomGenerator = new Random();
	    }

	    public String getRandomNames(List<String> myList)
	    {
	        int index = randomGenerator.nextInt(myList.size());
	        String str = myList.get(index);
	        return str;
	    }
	    public static ArrayList<String> returnarry(String filepath) throws IOException{
	    	ArrayList<String> list = new ArrayList<String>();

	    	// New BufferedReader.
	    	BufferedReader reader = new BufferedReader(new FileReader(filepath));

	    	// Add all lines from file to ArrayList.
	    	while (true) {
	    	    String line = reader.readLine();
	    	    if (line == null) {
	    		break;
	    	    }
	    	    list.add(line);
	    	}

	    	// Close it.
	    	reader.close();

	    	// Print size of ArrayList.
//	    	System.out.println("Lines: " + list.size());
//	    	System.out.println(list);
			return list;

	    }

	public static void main(String[] args) throws Exception
	{
		MyRandom a= new MyRandom();
//		ArrayList<String> myList = returnarry("C:\\Users\\16273\\Desktop\\Testing.txt");
		for(int i=0;i<100;i++)
		{
		String s=a.getRandomNames(returnarry("C:\\Users\\16273\\Desktop\\Testing.txt"));
		System.out.println(s);
		}
		

	}
}
