package me.ashish.pratice.personal.string;

public class ReplaceSpaces {
	// Replace Spaces with %20 in a string
	// Time Complexity O(n)
	public static void replaceSpaces (char[] str, int len) {
	    int spaceCount =0;
	    int newLen;
	    for(int i=0; i<len;++i) {
	        if(str[i] == ' ') {
	           spaceCount++; 
	       }
	    }
	    newLen = len + spaceCount * 2 ;
	    char[] newstr = new char[newLen+1];
	    newstr[newLen] = '\0';
	    for(int i=len - 1; i>=0;--i) {
	        if(str[i] == ' ') {
	            newstr[newLen-1] = '0';
	            newstr[newLen-2] = '2';
	            newstr[newLen-3] = '%';
	            newLen = newLen - 3;
	        }
	        else {
	            newstr[newLen - 1] = str[i];
	            newLen--;
	        }
	    }   
	    System.out.println(newstr);
	}
	public static void main(String[] args) {
		String str = "Interviewing is pretty serious business";
		replaceSpaces(str.toCharArray(), str.length());
	}
}
