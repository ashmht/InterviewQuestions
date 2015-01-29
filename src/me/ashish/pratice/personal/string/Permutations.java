package me.ashish.pratice.personal.string;

import java.util.ArrayList;

public class Permutations {
	public static ArrayList<String> permute(String input) {
		ArrayList<String> permutations = new ArrayList<String>();
		if (input == null)
			return null;
		// base Case
		if (input.length() == 0) {
			permutations.add("");
			return permutations;
		}

		char first = input.charAt(0); 
		String rest = input.substring(1);

		ArrayList<String> otherWords = permute(rest);

		for (String word : otherWords) {
			for (int j = 0; j <= word.length(); ++j)
				permutations.add(insertCharAt(word, first, j));
		}
		return permutations;
	}

	private static String insertCharAt(String word, char first, int j) {
		// TODO Auto-generated method stub
		String start = word.substring(0, j);
		String end = word.substring(j);
		return start + first + end;
	}
	public static void main(String[] args) {
		 ArrayList<String> permutations = permute("James");
		 for(String s: permutations) {
		 System.out.println(s);
		 }
		Permutations p = new Permutations();
		p.permute();
		p.combine(0);
	}

	final String in = "James";
	StringBuilder out = new StringBuilder();
	boolean[] used = new boolean[in.length()];

	public  void permute() {
		if(out.length() == in.length()) {
			System.out.println(out);
		}
			
		for(int i=0; i<in.length(); ++i) {
			if(used[i]) continue;
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}
	
	public void combine(int start) {
		for(int i=start;i<in.length();++i) {
			out.append(in.charAt(i));
			System.out.println(out);
			if(i<in.length())
				combine(i+1);
			out.setLength(out.length() - 1);
		}
	}
}
