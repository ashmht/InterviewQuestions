package me.ashish.practice.personal.basic;

public class ReverseString {
	public static String reverseString(String str) {
		char[] revStr = str.toCharArray();
		for(int i=0,j=str.length() - 1;i<j;++i,j--) {
			char temp = revStr[i];
			revStr[i] = revStr[j];
			revStr[j] = temp;
		}
		return new String(revStr);
	}
	public static void main(String[] args) {
		
		//String name = "Nitindrtfijrgtdjglaejtrgserl;jgseplgjwerpyrphgrfg;hljrt";
		//System.out.println("Reversed String is " + reverseString(name));
		
		// Reverse words in a sentence;
		String sentence = "I am a awesome dude";
		sentence = reverseString(sentence);
		String[] words = sentence.split(" ");
		for(int i=0;i<words.length;++i) {
			words[i] = reverseString(words[i]);
		}
		sentence = "";
		for(String s : words) {
			sentence = sentence + s +" ";
		}
		System.out.println(sentence);
	}
}
