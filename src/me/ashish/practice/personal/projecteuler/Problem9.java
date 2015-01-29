package me.ashish.practice.personal.projecteuler;

public class Problem9 {
	public static void main(String[] args) {
		computePProd();
	}

	private static void computePProd() {
		// TODO Auto-generated method stub
		// a+b+c = 1000
		// a^2 + b^2 = c^2
		//abc ??
		//a2 + b2 + c2 = 
		
		for(int a =334; a>0; a--) {
			for(int b = 334 + a; b>0; b--) {
				for(int c = a+b; c>=a-b; c--) {
					if(a*a + b*b == c*c && a+b+c ==1000) {
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						System.out.println(a * b * c);
					}
				}
			}
		}
	}
}
