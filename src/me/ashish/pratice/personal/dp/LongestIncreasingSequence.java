package me.ashish.pratice.personal.dp;

import java.util.Arrays;

public class LongestIncreasingSequence {
	public static void main(String[] args) {
		LIS();
	}

	private static void LIS() {
		// TODO Auto-generated method stub
		int[] arr = { 30, -3, 5, 40, -20, 2, 10, 400, 70, 4, 100 };
		int n = arr.length;
		int[] max = new int[n];
		for (int i = 0; i < n; ++i)
			max[i] = 1;

		for (int i = 1; i < n; ++i) {
			for (int j = 0; j < i; ++j) {
				if (arr[i] > arr[j] && max[i] < max[j] + 1) {
					max[i] =  max[j] + 1;
				}
			}
		}
		
		Arrays.sort(max);

		System.out.println(max[n-1]);
	}
}
