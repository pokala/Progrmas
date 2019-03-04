package com.interview;

public class StrRevFun {

	public static void main(String[] args) {
		String str="Our";
        char[] strs = str.toCharArray();
        int n = strs.length;
        int start = 0;
        for(int i = 0; i < n; i++) {
            if(strs[i] ==  ' ' && i > 0) {
                reverse(strs, start, i-1);
                start = i+1;
            } else if(i == n-1) {
                reverse(strs, start, i);
            }
        }
        System.out.println(strs);
    }
    private static void reverse(char[] str, int start, int end) {
         while(start < end) {
        	 char tmp = str[start];
             str[start] = str[end];
             str[end] = tmp;
            start++;
            end--;
        }
    }
}
