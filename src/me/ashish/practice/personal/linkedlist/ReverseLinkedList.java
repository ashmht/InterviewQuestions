package me.ashish.practice.personal.linkedlist;


public class ReverseLinkedList {
	public static Node reverseListIterative(Node head) {

		Node cur = head;
		Node prev = null;

		while (cur != null) {
			Node next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}

	public static Node reverseListRecursive(Node head) {

		Node first = head;
		Node rest = head.next;
		
		// Base Case
		if (first == null || rest == null)
			return first;
		rest = reverseListRecursive(rest);
		first.next.next = first;
		first.next = null;
		return rest;
	}

	public static void main(String[] args) {
		Node head = new Node(3);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(9);
		head.next.next.next.next = null;
		 head = reverseListIterative(head);
		 Node cur = head;
		 while(cur != null)
		 {
		 System.out.println(cur.value);
		 cur = cur.next;
		 }
		head = reverseListRecursive(head);
		cur = head;
		while (cur != null) {
			System.out.println(cur.value);
			cur = cur.next;
		}

	}
}
