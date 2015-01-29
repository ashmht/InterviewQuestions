package me.ashish.practice.personal.trees;

public class BinarySearchTreeValidation {
	public boolean isValid(Tree root) {
		return isValidHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isValidHelper(Tree cur, int min, int max) {
		if (cur == null)
			return true;
		if (cur.data < min || cur.data > max)
			return false;
		return isValidHelper(cur.left, min, cur.data)
				&& isValidHelper(cur.right, cur.data, max);
	}

	public static void main(String[] args) {
		Tree root = new Tree(3);
		root.left = new Tree(2);
		root.right = new Tree(5);
		root.left.left = new Tree(1);
		root.right.right = new Tree(4);
		BinarySearchTreeValidation b = new BinarySearchTreeValidation();
		System.out.println(b.isValid(root));
	}
}
