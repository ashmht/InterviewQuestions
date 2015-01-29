package me.ashish.practice.personal.projecteuler;

public class LargestPalindrome {
	public static void main(String[] args) {
		computePalin();
	}

	static int lar = 0;

	private static void computePalin() {
		// TODO Auto-generated method stub
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				if (isPalindrome(i * j)) {
					lar = Math.max((i * j), lar);
				}
			}
		}
		System.out.println(lar);
	}

	private static boolean isPalindrome(int i) {
		// TODO Auto-generated method stub

		int rev = reverse(i);
		return (rev == i) ? true : false;
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}
}
