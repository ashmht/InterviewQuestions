package me.ashish.practice.personal.projecteuler;

public class Problem10 {
	public static void main(String[] args) {
		computeSumPrime();
	}

	private static void computeSumPrime() {
		// TODO Auto-generated method stub
		long sum = 2L;
		for(int i=3; i<2000000; i+=2) {
			if(checkPrime(i))
				sum+=i;
		}
		System.out.println(sum);
	}

	private static boolean checkPrime(int n) {
		// TODO Auto-generated method stub
		for(int i=2; i<=Math.sqrt(n);++i)
			if(n%i == 0)
				return false;
		return true;
	}
}
