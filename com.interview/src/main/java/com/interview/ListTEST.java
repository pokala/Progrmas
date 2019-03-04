package com.interview;
import java.util.HashMap;


public class ListTEST {
	public static HashMap<String, String> dbvalue = new HashMap<String, String>();

	public static void T32(String key,String values)
	{
		if(dbvalue.get(key)!=null)
		{
			System.out.println(dbvalue.get(key));
//			dbvalue.remove(key);
			dbvalue.put(key, values);
			System.out.println(dbvalue.get(key));
		}else{
			dbvalue.put(key, values);
		}
	}
	
	public static void main(String[] args)
	{
		T32("test","1");
		T32("test","2");
		T32("test","3");
	}
	
}
