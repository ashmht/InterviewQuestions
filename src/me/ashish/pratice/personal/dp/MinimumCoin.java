package me.ashish.pratice.personal.dp;


public class MinimumCoin {
	public static void main(String[] args) {

		makeChange();
	}

	private static void makeChange() {
		// TODO Auto-generated method stub
		int[] denom = { 5, 10, 15, 20, 1 };
		int S = 40;
		int n = denom.length;
		int[] min = new int[S + 1];
		int[] coins = new int[S + 1];

		for (int i = 0; i <= S; ++i) {
			min[i] = Integer.MAX_VALUE;
		}
		min[0] = 0;

		for (int i = 1; i <= S; ++i) {
			for (int j = 0; j < n; ++j) {
				if (denom[j] <= i && min[i - denom[j]] + 1 < min[i]) {
					min[i] = min[i - denom[j]] + 1;
					coins[i] = denom[j];
				}
			}

		}
		System.out.println("Coins are ");
		for (int i = S; i > 0;) {
			System.out.print(coins[i] + " ");
			i -= coins[i];
		}
		System.out.println();
		System.out.println("Min no of coins: " + min[S]);
	}
}
