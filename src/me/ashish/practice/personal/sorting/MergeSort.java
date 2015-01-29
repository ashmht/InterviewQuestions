package me.ashish.practice.personal.sorting;


public class MergeSort {
	public static int[] mergeSort(int[] array) {
		if (array.length <= 1)
			return array;
		int r = array.length;
		int m = array.length / 2;
		int[] aLeft = new int[m];
		int[] aRight = new int[r - m];
		System.arraycopy(array, 0, aLeft, 0, m);
		System.arraycopy(array, m, aRight, 0, r - m);
		int[] left = mergeSort(aLeft);
		int[] right = mergeSort(aRight);
		return merge(left, right);
	}

	private static int[] merge(int[] aLeft, int[] aRight) {
		// TODO Auto-generated method stub
		int l = aLeft.length;
		int r = aRight.length;
		int ll = l + r;
		int[] mergedArray = new int[ll];
		int i = 0, j = 0, k = 0;
		while (i < l && j < r) {
			if (aLeft[i] <= aRight[j]) {
				mergedArray[k] = aLeft[i++];
			} else if (aLeft[i] > aRight[j]) {
				mergedArray[k] = aRight[j++];
			}
			k++;
		}
		while (i < l) {
			mergedArray[k++] = aLeft[i++];
		}
		while (j < r) {
			mergedArray[k++] = aRight[j++];
		}
		return mergedArray;
	}

	public static void main(String[] args) {
		int array[] = { 4, 2, 3, 6, 5, 1, 8, 7, 8, 0, -1, -4, 10, 44, 9 };
		array = mergeSort(array);
		for (int i : array)
			System.out.println(i + " ");
	}

}
