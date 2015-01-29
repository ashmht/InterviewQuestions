package me.ashish.practice.personal.projecteuler;

public class SumofEvenFibonacci {
	public static void main(String[] args) {
		computeSumofEvenFib();
	}

	private static void computeSumofEvenFib() {
		// TODO Auto-generated method stub
		int a = 1, b = 2, c = 0;
		int sum = 2;
		while (c < 4000000) {
			if (c%2 == 0) {
				sum += c;
			}
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(sum);
	}
}
