package me.ashish.practice.personal.bitwise;

public class NearestPowerOf2 {
	public static void main(String[] args) {
		System.out.println(findNearestPowerOfTwo(45));
	}

	private static int findNearestPowerOfTwo(int n) {
		
		int x = 1;
		
		if(n <= 1)
			return x;
		
		while(x < n)
			x <<= 1;
		
		return (x - n) < (n - (x >> 1)) ? x : x >> 1;
	}
}
