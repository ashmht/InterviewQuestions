package me.ashish.practice.personal.projecteuler;

public class Problem6 {
	public static void main(String[] args) {
		computeDiff();
	}

	private static void computeDiff() {
		// TODO Auto-generated method stub
		int  diff = squareofSum() - sumofSquare();
		System.out.println(diff);
	}

	private static int sumofSquare() {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1; i<=100;++i)
			sum+= (i*i);
		return sum;
	}

	private static int squareofSum() {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1; i<=100;++i)
			sum+= i;
		return sum * sum;
	}
}
