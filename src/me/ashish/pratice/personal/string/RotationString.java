package me.ashish.pratice.personal.string;

public class RotationString {
	public static void main(String[] args) {
		System.out.println(checkStringRotate("abc", "bcb"));
	}


	private static boolean checkStringRotate(String s1, String s2) {
		// TODO Auto-generated method stub
		if (s1 == null && s2 == null)
			return true;
		if (s1.length() != s2.length())
			return false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		String s1s1 = s1 + s1;
		if (s1s1.contains(s2))
			return true;
		else
			return false;
	}
}
