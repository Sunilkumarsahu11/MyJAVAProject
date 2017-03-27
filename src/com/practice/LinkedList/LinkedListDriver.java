package com.practice.LinkedList;

public class LinkedListDriver {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(4);
		myLinkedList.addNode(8);
		myLinkedList.addNode(5);
		myLinkedList.addNode(2);
		myLinkedList.addNodeAtBegining(9);
		
		myLinkedList.display();
		
	}
}
