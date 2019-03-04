package com.interview;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class ReadWriteTextFile {
	
	public static void main(String[] args)throws Exception
	{
		File file= new File("C:\\Users\\16273\\Desktop\\SeleniumCmd.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		BufferedWriter bw= new BufferedWriter(new FileWriter(file));
		bw.append("ajfajflkajdf");
		while((st=br.readLine())!= null)
		{
			System.out.println(st);
		}
		
		
		
	}
}
