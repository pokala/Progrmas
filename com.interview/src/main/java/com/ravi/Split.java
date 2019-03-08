package com.ravi;

public class Split {
    public  static String value ="text-anchor: middle; opacity: 0.287175; fill: rgb(0, 0, 0); font-size: 10px;";

	   public static void main(String []args){
	        
	          
	          String [] splittext = value.split(";");
	          
	          for (int i=0;i<splittext.length;i++){
	            
	        	  System.out.println(splittext[i]);
	         }
}
}