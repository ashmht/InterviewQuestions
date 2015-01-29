package me.ashish.pratice.personal.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PopularCharacters {
	public static void main(String[] args) {
		Integer n = 3;
		ArrayList<String> input = new ArrayList<String>();
		input.add("abcdde");
		input.add("baccd");
		input.add("eeabg");
		getPopularCharacters(n, input);
	}

	private static void getPopularCharacters(Integer n, ArrayList<String> input) {
		// TODO Auto-generated method stub
		int minLength = input.get(0).length();
		String minStr = null;
		for (int i = 1; i < n; ++i) {
			if (input.get(i).length() < minLength) {
				minLength = input.get(i).length();
				minStr = input.get(i);
			}
		}

		char[] letters = minStr.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(char c: letters)
			hs.add(c);
		
		

		HashMap<Character, Integer> hc = new HashMap<Character, Integer>();
		for (char c : letters) {
			hc.put(c, 1);
		}

		for (String s : input) {
			if (!s.equals(minStr)) {
				letters = s.toCharArray();
				letters = getUniqueChar(letters);
				for (char c : letters) { 
					if (hs.contains(c)) {
						hc.put(c, hc.get(c) + 1);
					}
				}
			}
		}

		Set<Character> keySet = hc.keySet();
		StringBuffer chars = new StringBuffer();
		Iterator<Character> keys = keySet.iterator();
		while (keys.hasNext()) {
			char key = (char) keys.next();
			if(hc.get(key) == n) {
				chars.append(key);
			}
		}

		System.out.println(chars);
	}

	private static char[] getUniqueChar(char[] letters) {
		// TODO Auto-generated method stub
		HashSet<Character> hs = new HashSet<Character>();
		for(char c: letters) 
			hs.add(c);
		
		String s = hs.toString();
		
		return s.toCharArray();
	}
}
