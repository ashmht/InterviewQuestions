package me.ashish.practice.personal.linkedlist;

public class LoopDetector {
	public static boolean detectLoop(Node head) {
		
		// Base Case 
		if (head == null || head.next == null)
			return false;
		
		Node slow = head;
		Node fast = head.next;
		
		
		while (true) {
			
			// End of linked list, loop not found
			if (fast == null || fast.next == null)
				return false;
			
			// Loop found
			else if (fast == slow || fast.next == slow) {
				return true;
				
			//  Else advance 
			} else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
	}
}
