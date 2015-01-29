package me.ashish.practice.personal.trees;

public class Subtree {
	public static void main(String[] args) {
		Tree root1 = new Tree(100);
		root1.left = new Tree(10);
		root1.left.left = new Tree(20);
		Tree root2 = new Tree(10);
		root2.left = new Tree(20);
		root2.right = new Tree(100);
		if(checkSubtree(root1 ,root2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean checkSubtree(Tree root1, Tree root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1== null || root2 == null)
			return false;
		
		if(match(root1,root2))
			return true;
		
		return checkSubtree(root1.left,root2) || checkSubtree(root1.right, root2);
		// TODO Auto-generated method stub
	}

	private static boolean match(Tree root1, Tree root2) {
		// TODO Auto-generated method stub
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		if(root1.data == root2.data) {
			boolean left = match(root1.left, root2.left);
			boolean right = match(root1.right, root2.right);
			if(left && right)
					return true;
		}
		return false;
	}
}
