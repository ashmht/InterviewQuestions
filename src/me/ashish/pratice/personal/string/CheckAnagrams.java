package me.ashish.pratice.personal.string;

import java.util.Arrays;

public class CheckAnagrams {
	public static boolean checkAnagrams(char[] s, char[] t) {
		if(s.length != t.length)
			return false;
		
		// Complexity nlogn
		Arrays.sort(s);
		Arrays.sort(t);
		for(int i=0;i<s.length;++i)
		{
			if(s[i]!=t[i])
				return false;
		}
		return  true;
	}
	public static void main(String[] args) {
		String a = "Ashish";
		String b = "Ashish";
		System.out.println(checkAnagrams(a.toCharArray(),b.toCharArray()));
	}
}
