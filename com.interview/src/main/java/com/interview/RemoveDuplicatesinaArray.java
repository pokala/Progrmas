package com.interview;
import org.apache.commons.lang3.ArrayUtils;




public class RemoveDuplicatesinaArray {
	
	public static void test()
	{
		String[] arr={"a","b","c","d","a","b","c","d","e","f","g","e"};
		String[] duplicat=new String[arr.length];
		for(int i=0; i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
					arr=ArrayUtils.remove(arr, j);
		for(String str: arr)
			System.out.print(str);
		System.out.println(duplicat.length);
	}
	public static void main(String[] args)
	{
		RemoveDuplicatesinaArray.test();
					
		
	}

}
