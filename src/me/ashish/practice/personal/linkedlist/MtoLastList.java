package me.ashish.practice.personal.linkedlist;

public class MtoLastList {
	public static Node MtoLast(Node head, int m) {
		if (head == null)
			return null;

		Node cur = head;
		Node mBehind = head;
		for (int i = 0; i < m; ++i)
			if (cur.next != null) {
				cur = cur.next;
			} else
				return null;

		while (cur.next != null) {
			cur = cur.next;
			mBehind = mBehind.next;
		}
		return mBehind;
	}

	public static void main(String[] args) {
		Node head = new Node(3);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(9);
		head.next.next.next.next = null;
		 head = MtoLast(head, 3);
		 Node cur = head;
		 while(cur != null)
		 {
		 System.out.println(cur.value);
		 cur = cur.next;
		 }
	}
}
