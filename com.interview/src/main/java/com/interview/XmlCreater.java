package com.interview;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class XmlCreater {
	
	public static void main(String[] args) throws Exception
	{
		PrintWriter writer = new PrintWriter("the-file-name.xml", "UTF-8");
    	 writer.println("Last");
    	 writer.close();
	}

}
