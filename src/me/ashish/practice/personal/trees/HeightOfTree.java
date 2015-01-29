package me.ashish.practice.personal.trees;

public class HeightOfTree {
	public static int height(Tree root) {
		if (root == null)
			return 0;
		else
			return 1 + Math.max(height(root.left), height(root.right));
	}

	public static void main(String[] args) {
		Tree root = new Tree(3);
		root.left = new Tree(2);
		root.right = new Tree(5);
		root.left.left = new Tree(1);
		root.right.right = new Tree(4);
		root.left.left.left = new Tree(1);
		System.out.println(height(root));
	}

}
