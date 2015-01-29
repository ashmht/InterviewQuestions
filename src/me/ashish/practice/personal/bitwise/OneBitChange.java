package me.ashish.practice.personal.bitwise;

public class OneBitChange {
	public static void main(String[] args) {
		checkOneBit(-10,-11);
		System.out.println(Integer.toBinaryString(-10));
		System.out.println(Integer.toBinaryString(-11));
	}

	private static void checkOneBit(int i, int j) {
		// TODO Auto-generated method stub
		int ixorj = i^j;
		System.out.println(Integer.toBinaryString(ixorj));
		int count = countSetBits(ixorj);
		if(count == 1)
			System.out.println("Yes");
		else
			System.out.println("False");
	}

	private static int countSetBits(int n) {
		// TODO Auto-generated method stub
		int count =0;
		while(n != 0) {
			n= n & n-1;
			count++;
		}
		return count;
	}
}
