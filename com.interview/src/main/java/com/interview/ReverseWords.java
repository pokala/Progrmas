package com.interview;

public class ReverseWords {
       static String temp="";
       public String resversewordsinLine(String line){
              String revword = "";
              int len = line.length();
//              System.out.println(line);
              for(int i =len-1;i>=0;i--){
                     revword = revword+line.charAt(i);
                     
              }
//              System.out.println(revword);
              return revword;
       }
       public void getWordsFromString(String line){
              String temp1 ="";
              String rev="";
              for(int i=0;i<line.length();i++){
                     temp=temp+line.charAt(i);
                     temp1 = temp1+line.charAt(i);
                     if(temp1.equals(" ")){
                           rev = rev+resversewordsinLine(temp)+temp1;
                           temp= "";
                           
                     }else if (i==line.length()-1){
                           rev = rev+resversewordsinLine(temp);
                           temp= "";
                     }
                     temp1="";
              }
              System.out.println(rev);
       }
public static void main(String[] args){
       String line = "Hello world";
       ReverseWords rw = new ReverseWords();
       rw.getWordsFromString(line);
}
}
