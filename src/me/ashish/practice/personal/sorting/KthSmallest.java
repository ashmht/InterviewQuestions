package me.ashish.practice.personal.sorting;

public class KthSmallest {
	public static int partition(int[] array, int startIndex, int endIndex) {
		int pivot = array[(startIndex + endIndex) / 2];
		while (startIndex <= endIndex) {
			while (array[startIndex] < pivot)
				startIndex++;
			while (array[endIndex] > pivot)
				endIndex--;

			if (startIndex <= endIndex) {
				int temp = array[startIndex];
				array[startIndex] = array[endIndex];
				array[endIndex] = temp;

				startIndex++;
				endIndex--;
			}
		}
		return startIndex;
	}

	public static void getKthSmallest(int[] array, int startIndex,
			int endIndex, int k) {
		int pivotIndex = partition(array, startIndex, endIndex);
		if (pivotIndex == k - 1 || (pivotIndex == k && k == 1))
			System.out.println(array[k-1]);
		if (startIndex < pivotIndex - 1)
			getKthSmallest(array, startIndex, pivotIndex - 1, k);
		if (pivotIndex < endIndex)
			getKthSmallest(array, pivotIndex, endIndex, k);
	}

	public static void main(String[] args) {
		int array[] = { 0, 1, 2, 3, 4, 5, 6 };
		getKthSmallest(array, 0, array.length - 1, 1);
	}
}
