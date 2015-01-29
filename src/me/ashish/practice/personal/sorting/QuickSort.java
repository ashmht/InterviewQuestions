package me.ashish.practice.personal.sorting;

public class QuickSort {
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

	public static void quickSort(int[] array, int startIndex, int endIndex) {
		int pivotIndex = partition(array, startIndex, endIndex);
		if (startIndex < pivotIndex - 1)
			quickSort(array, startIndex, pivotIndex - 1);
		if (pivotIndex < endIndex)
			quickSort(array, pivotIndex, endIndex);
	}

	public static void main(String[] args) {
		int array[] = { 0, 1, 7, 5, 4, 8, 4, -9, 10, 20, 30, 40, 4 };
		quickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; ++i)
			System.out.println(array[i] + " ");
	}
}
