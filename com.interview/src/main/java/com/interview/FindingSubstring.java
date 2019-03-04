package com.interview;

public class FindingSubstring {
	public static void main(String[] args) {
	    String apple = "ITC";
	    String webapple = "ITC Infotech";
	    char[] webappleArray = webapple.toCharArray();
	    char[] appleArray = apple.toCharArray();
	    System.out.println(isPresent(appleArray,webappleArray));
	}

	public static boolean isPresent(char[] apple, char[] webapple) {
	    for (int i = 0; i < webapple.length - apple.length+1; i++) {
	        for (int j = 0; j < apple.length; j++) {
	            if (webapple[i + j] == apple[j]) {
	                if (j == apple.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}

}
