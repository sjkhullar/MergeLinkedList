package org.learn.Question;

import org.learn.List.Node;

public class MergeLinkedLists {
	
	public static Node merge(Node head1, Node head2) {
		Node mergedList = null;
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		if(head1.data < head2.data) {
			//point to smaller element
			mergedList = head1;			
			mergedList.next = merge(head1.next, head2);
		} else { //head1 is large, so pass h
			//point to smaller element
			mergedList = head2;
			//head2 is already consider
			//now process next node of head2
			mergedList.next = merge(head1, head2.next);
		}
		return mergedList;
	}
	
	public static void insert(Node head, int data) {
		while(head.next != null) 
			head = head.next;
		head.next = new Node(data);
	}
	
	public static void print(Node head) {
		while(head != null) {
			System.out.printf("%d ",head.data);
			head = head.next;
		}
		System.out.println("");		
	}
}
