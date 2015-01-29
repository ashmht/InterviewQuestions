package me.ashish.practice.personal.projecteuler;

public class Multipleof5or3 {
	public static void main(String args[]) {
		computeSum();
	}

	private static void computeSum() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<1000;++i) {
			if(i%3 == 0 || i%5 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
