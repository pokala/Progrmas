package com.interview;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class DuplicateWordsInString {

	public static void main(String[] args)
	{
		String str="Hello world Hello world";
		String[] words=str.split(" ");
		HashMap<String,Integer> duplicatWord= new HashMap<String,Integer>();
		for(String word: words)
		{
			if(duplicatWord.get(word)!= null)
				duplicatWord.put(word, duplicatWord.get(word)+1);
			else
				duplicatWord.put(word, 1);
		}
		Set<String> keys=duplicatWord.keySet();
		for(String key: keys)
			if(duplicatWord.get(key)>1)
				System.out.println(key);
		
	}
}
