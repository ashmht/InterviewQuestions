package me.ashish.pratice.personal.string;

public class ReverseSentence {
	public static void main(String[] args) {
		reverseSentence();
	}

	private static void reverseSentence() {
		// TODO Auto-generated method stub
		String sentence = "     fgldfg ";
		char[] words = sentence.toCharArray();
		StringBuilder s = new StringBuilder();
		StringBuilder w = new StringBuilder();
		for(int i=words.length-1; i>=0; i--) {
			if(words[i] != ' ')
				w.append(words[i]);
			if(words[i] == ' ' || i == 0) {
				s.append(w.reverse());
				s.append(' ');
				w.setLength(0);
			}	
		}
		
		System.out.println(s.toString());
	}
}
