package me.ashish.practice.personal.basic;

public class LargestInArray {
	public static void main(String[] args) {
		int[] num = { -10, -2, 40, -77, 23, -45 };
		System.out.println(findLargest(num));
	}

	private static int findLargest(int[] num) {
		if (num.length <= 0)
			return -1;
		int max = num[0];
		for (int i = 1; i < num.length; ++i) {
			if (max < num[i])
				max = num[i];
		}
		return max;
	}
}
