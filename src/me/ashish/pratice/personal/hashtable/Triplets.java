package me.ashish.pratice.personal.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triplets {
	public static void main(String[] args) {
		int s = 100;
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(70);
		num.add(20);
		num.add(40);
		num.add(35);
		num.add(25);
		num.add(15);
		num.add(30);
		num.add(55);
		Set<ArrayList<Integer>> triplets = new HashSet<ArrayList<Integer>>();
		triplets = makeTriplets(num, s);
		// System.out.println(triplets);
		Integer[] a = { 10, 70, 40, 20, 25, 15, 30, 35, 55 };
		FindAllSmallerTriples(a, 100);
	}

	public static void FindAllSmallerTriples(Integer[] nFooBarArray, int nTarget) {
		int nLength = nFooBarArray.length;
		int nPivotIndex;
		int nFindMe;

		List<Integer> num = Arrays.asList(nFooBarArray);

		for (Integer i : num)
			if (i > nTarget)
				num.remove(i);

		nFooBarArray = (Integer[]) num.toArray();

		Arrays.sort(nFooBarArray);

		for (int i = 0; i < nLength; ++i) {
			for (int j = 0; j < nLength; ++j) {
				if (i < j) {
					nFindMe = nTarget - (nFooBarArray[i] + nFooBarArray[j]);
					nPivotIndex = Math.abs(Arrays.binarySearch(nFooBarArray,
							nFindMe));

					for (int k = j + 1; k <= nPivotIndex; ++k) {
						if (nFooBarArray[i] + nFooBarArray[j] + nFooBarArray[k] < nTarget) {
							System.out.println("Triple found: "
									+ nFooBarArray[i] + " " + nFooBarArray[j]
									+ " " + nFooBarArray[k]);
						}
					}

				}
			}
		}
	}

	private static Set<ArrayList<Integer>> makeTriplets(List<Integer> num, int s) {
		Set<ArrayList<Integer>> triplets = new HashSet<ArrayList<Integer>>();
		List<Integer> triplet = new ArrayList<Integer>();
		// O(n)
		for (Integer i : num) {
			if (i > s)
				num.remove(i);
		}

		Collections.sort(num);

		for (int i = 0; i < num.size(); ++i) {

			int j = i + 1;
			int k = num.size() - 1;

			while (j < k) {
				int sum = num.get(i) + num.get(j);
				if (sum + num.get(k) == s) {
					triplet.add(num.get(i));
					triplet.add(num.get(j));
					triplet.add(num.get(k));
					triplets.add((ArrayList<Integer>) new ArrayList<Integer>(
							triplet));
					triplet.removeAll(triplet);
					j++;
					k--;
				} else if (sum + num.get(k) < s) {
					j++;
				} else
					k--;
			}
		}
		return triplets;
	}
}
