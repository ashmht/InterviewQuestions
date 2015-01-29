package me.ashish.practice.personal.trees;

public class MaximumSumLeaf {
	static int max_sum = Integer.MIN_VALUE;

	public static void main(String[] args) {

		// Tree structure
		Tree root = new Tree(1);
		root.left = new Tree(-10);
		root.right = new Tree(10);
		root.left.left = new Tree(100);
		root.left.right = new Tree(1);
		root.right.left = new Tree(20);
		root.right.right = new Tree(15);

		maxPossibleLeafPath(root, 0);

		// Gives the max path
		System.out.println(max_sum);
	}

	private static void maxPossibleLeafPath(Tree root, int sum) {
		if (root == null) {
			max_sum = Math.max(max_sum, sum);
			return;
		}
		sum += root.data;
		maxPossibleLeafPath(root.left, sum);
		maxPossibleLeafPath(root.right, sum);
	}
}
