package me.ashish.practice.personal.basic;

import java.util.Arrays;

public class SumTwoNumbers {
	public static String SumofTwoNumbers(int x, int[] array) {
		if (array.length <= 1)
			return null;
		Arrays.sort(array);
		int i = 0;
		int j = array.length - 1;
		while (i < array.length && j > -1) {
			if (x < (array[i] + array[j]))
				j--;
			else if (x > (array[i]+array[j]))
				i++;
			else
			{
				StringBuilder s = new StringBuilder();
				s.append(String.valueOf(i) + ",");
				s.append(String.valueOf(j));
				return s.toString();
			}
		}
		return "";
	}
	public static void main(String[] args) {
		int x=50;
		int[] array = {0,1,10,40,30,3};
		System.out.println(SumofTwoNumbers(x, array));
	}

}
