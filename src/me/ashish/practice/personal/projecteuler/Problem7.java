package me.ashish.practice.personal.projecteuler;

public class Problem7 {
	public static void main(String[] args) {
		computePrime();
	}

	private static void computePrime() {
		// TODO Auto-generated method stub
		int i = 3;
		int count = 1;
		while (true) {
			if (isPrime(i)) {
				count++;
				if (count == 10001) {
					System.out.println(i);
					break;
				}
			}
			i = i + 2;
		}
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= Math.sqrt(num); ++i)
			if (num % i == 0)
				return false;
		return true;
	}
}
