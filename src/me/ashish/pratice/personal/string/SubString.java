package me.ashish.pratice.personal.string;

public class SubString {
	public static boolean subString(String x, String y) {
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		if (a == null && b == null)
			return true;
		for (int i = 0; i < y.length(); ++i) {
			boolean nonmatch = false;
			for (int j = 0; j < x.length(); ++j)
				if (b[i + j] != a[j]) {
					nonmatch = true;
					break;
				}
			if (!nonmatch)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean isSubString = subString("Asktan", "Askfjgfg");
		System.out.println(isSubString);
	}
}
