package me.ashish.practice.personal.basic;

public class PowerOf3 {
	public static void main(String[] args) {
		checkPower();
	}

	private static void checkPower() {
		// TODO Auto-generated method stub
		int n = 27;
		int i = 3;
		System.out.println(checkPower(n, i));
	}

	private static boolean checkPower(int n, int i) {
		// TODO Auto-generated method stub
		if (n <= 0 || i <= 0)
			return false;

		while ((n % i) == 0)
			n /= i;

		return (n == 1) ? true : false;
	}
}
