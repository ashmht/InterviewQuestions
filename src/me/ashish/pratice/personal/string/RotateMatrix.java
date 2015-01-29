package me.ashish.pratice.personal.string;

public class RotateMatrix {
	// Rotate Matrix
	// Time Complexity O(n^2)

	public static void rotateMatrix(int[][] matrix, int n) {
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
   

		for (int layer = 0; layer < n / 2; ++layer) {

			int first = layer;
			int last = n - 1 - layer;

			for (int i = first; i < last; ++i) {
				int offset = i - first;

				// Store top
				int top = matrix[first][i];

				// Move left -> top
				matrix[first][i] = matrix[last - offset][first];

				// Move bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// Move right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				// Move bottom -> top
				matrix[i][last] = top;

			}
		}
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateMatrix(matrix, 3);

	}
}
