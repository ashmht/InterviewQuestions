package me.ashish.practice.personal.basic;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 20;
		for (int i = 0; i <= n; ++i) {
			System.out.print(fib(i) + ", ");
			System.out.print(fibonnaciiterative(i) + ", ");
		}
		fibonnaciiterative(20);
	}

	private static int fibonnaciiterative(int n) {
		// TODO Auto-generated method stub
		if (n <= 1)
			return n;

		int fibN = 0;
		int fibN1 = 1;
		int fibN2 = 0;

		for (int i = 2; i <= n; ++i) {
			fibN = fibN1 + fibN2;
			fibN2 = fibN1;
			fibN1 = fibN;
		}
		return fibN;
	}

	private static long fib(int i) {
		return i <= 1 ? i : fib(i - 1) + fib(i - 2);
	}
}
