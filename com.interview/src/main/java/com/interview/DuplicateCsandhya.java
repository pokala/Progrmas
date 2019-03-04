package com.interview;


	import java.util.HashMap;
	import java.util.Set;

	public class DuplicateCsandhya {
		
		public void returnDuplicatechars(String data){
			char[] chars = data.toCharArray();
			for(int i =0;i<chars.length;i++){
				int count=1;
				if(chars[i]== ' '|| chars[i]== '.'){
					continue;
				}
				else{
				for(int j=0;j<chars.length;j++){
					if(i!=j){
						
						if(chars[i]==chars[j]){
							count=count+1;
							chars[j] = ' ';
						}					
					}
						
				}
					
				}
				if(count>1){
					System.out.println(chars[i] + "  no.of times present " + count);
				}
		}
			
		} 


//	       public void returnDuplicatechars(String data){
//	              char[] chars = data.toCharArray();
//	              char dot = '.';
//	              char spacechar = ' ';
//
//	              for(int i =0;i<chars.length;i++){
//	                     int count=1;
//	                     for(int j=0;j<chars.length;j++){
//	                           if(i!=j){
//	                                  if(chars[i]!=dot && chars[i]!=spacechar){
//	                                  if(chars[i]==chars[j]){
//	                                         count=count+1;
//	                                  }
//	                                  
//	                           }
//	                     }
//	              }
//	              System.out.println(chars[i] + "  no.of times present " + count);
//	       }
//	       }
	       public static void main(String[] args){
	              String line = "hello 123. hello 124.";
	              DuplicateCsandhya rw = new DuplicateCsandhya();
	              rw.returnDuplicatechars(line);
	              //rw.reverseLine();
	       }
	}


