package me.ashish.practice.personal.basic;

public class MultiplicationTable {
	public static void main(String[] args) {
		multitable(12);
	}
	
	private static void multitable(int n) {
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=n;++j) {
				System.out.print ( String.format ( "%4d", j * i ));
			}
			System.out.println();
		}
	}
	
}
