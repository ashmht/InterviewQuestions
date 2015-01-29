package me.ashish.pratice.personal.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindAnagrams {
	static HashMap<String, ArrayList<String>> htable = new HashMap<String, ArrayList<String>>();

	@SuppressWarnings({ "rawtypes" })
	public static ArrayList findAnagrams(String input) {
		String key = input;
		Arrays.sort(key.toCharArray());
		if (htable.containsKey(key)) {
			ArrayList<String> currentValues = htable.get(key);
			if (currentValues != null)
				currentValues.add(input);

			htable.put(key, currentValues);
			return currentValues;
		} else {
			ArrayList<String> newValues = new ArrayList<String>();
			newValues.add(input);
			htable.put(key, newValues);
			return newValues;
		}
	}

}
