package me.ashish.practice.personal.basic;

public class AsciitoInt {
	/* package whatever; // don't place package name! */

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		String num = "+12323435435";
		System.out.println("The number is" + atoi(num));
	}

	public static long atoi(String num) {
		long result = 0;
		boolean isNeg = false;
		int i = 0;
		char[] nArray = num.toCharArray();
		if (nArray[0] == '-') {
			isNeg = true;
			i++;
		} else if (nArray[0] == '+') {
			i++;
		}

		for (; i < nArray.length; ++i) {
			result = result * 10 + (nArray[i] - '0');
		}

		if (isNeg)
			return -result;
		else
			return result;
	}
}
