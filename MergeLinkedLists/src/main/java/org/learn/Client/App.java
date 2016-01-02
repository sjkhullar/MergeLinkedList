package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.MergeLinkedLists;

public class App 
{
	public static void main( String[] args )
    {
		int[] data1 = {1,3,5,9};
		Node head1 = new Node(data1[0]);
		for(int count = 1; count < data1.length; count++)
			MergeLinkedLists.insert(head1,data1[count]);
		
		System.out.printf("Linked list 1 is : ");
		MergeLinkedLists.print(head1);
		
		int[] data2 = {2,4,5,6,10};
		Node head2 = new Node(data2[0]);
		for(int count = 1; count < data2.length; count++)
			MergeLinkedLists.insert(head2,data2[count]);
		
		System.out.printf("Linked list 2 is : ");
		MergeLinkedLists.print(head2);
		
		Node mergedList = MergeLinkedLists.merge(head1, head2);
		System.out.printf("Merged Linked list is : ");
		MergeLinkedLists.print(mergedList);
    }
}