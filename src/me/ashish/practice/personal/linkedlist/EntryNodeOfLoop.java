package me.ashish.practice.personal.linkedlist;

public class EntryNodeOfLoop {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = head.next.next.next;
		Node p = entryNodeOfLoop(head);
		System.out.println(p.value);
	}
	public static Node entryNodeOfLoop(Node head) {
		if(head == null || head.next == null)
			return null;
		
		Node meetingNode = getMeetingNode(head);
		
		if(meetingNode == null)
			return null;
		
		int length = 1;
		
		Node p1 = meetingNode;
		
		while(p1.next != meetingNode) {
			p1 = p1.next;
			length++;
		}
		
		p1 = head;
		for(int i=0;i<length;++i)
			p1 = p1.next;
		
		Node p2 = head;
		
		while(p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
		
	}

	private static Node getMeetingNode(Node head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null)
			return null;
		Node slow = head;
		Node fast = head.next;
		
		while(slow != null && fast != null) {
			if(slow == fast) {
				return slow;
			}
			else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return null;
	}
}
