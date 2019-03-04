package com.interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

// How to find repeated/duplicated words in a string using Java6
public class DuplicateWords {

     

    public static void main(String[] args) throws Exception {

//        System.out.print("Enter string to analyse:");
//        Scanner sn = new Scanner(System.in);
    	FileInputStream fis=new FileInputStream("D:\\test.xls");
		Workbook wb=new HSSFWorkbook(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cell=row.getCell(0);
		System.out.println(cell);
		String cellval=cell.getStringCellValue();

        String input ="";// sn.nextLine();
        int Count =0;
        String[] lines = cellval.split("");
        for(int j=0;j<lines.length;j++){
        	String[] words=lines[j].split(" ");
        Map<String,String> wordMap = new HashMap<String,String>();
        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); // for case insensitive comparison
            System.out.println("word:"+word);
            if(wordMap.get(word)!=null) {
            	if((word.equalsIgnoreCase("USD"))){
            	Count=i;
            	System.out.println("Count:"+Count);
            	}
            	System.out.println(word);
            }else {
                wordMap.put(word, word);
            }
        }
        System.out.println(words[Count]+" "+ words[Count+1]);
        }
    }  
}
