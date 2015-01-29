package me.ashish.practice.personal.projecteuler;

public class HighestPrimeFactor {
	public static void main(String[] args) {
		computePrime();
	}

	private static void computePrime() {
		// TODO Auto-generated method stub
		double d = 600851475143d;
		int div = 0;
		for (int i = 3; i < Math.sqrt(d); i += 2) {
			if (d % i == 0) {
				if (isPrime(i))
					div = Math.max(div, i);
			}
		}
		System.out.println(div);
	}

	public static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
