package com.practice.LinkedList;

import java.util.LinkedList;

public class MyLinkedList {

	public LinkedListNode head;
	
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head=null;
	}
	public void addNode(int data){
		LinkedListNode node = new LinkedListNode(data);
		
		if(this.head==null){
			head=node;
		}else{
			LinkedListNode temp = this.head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
		}
		return;
	}
	
	public void addNodeAtBegining(int data) {
		// TODO Auto-generated method stub
		LinkedListNode node = new LinkedListNode(data);
		node.next=head;
		head=node;

	}
	
	public void deleteNode(int data) {
		// TODO Auto-generated method stub
		if(head==null){
			return;
		}
		LinkedListNode temp =null;
		if(head.data==data){
			temp=head;
			head=head.next;
			temp.next=null;
			return;
		}
		LinkedListNode cur=head.next,prev = head;
		
		while(cur!=null){
			
			temp=cur;
			if(temp.data==data){
	            prev.next = temp.next;
	            temp.next=null;
	            cur=prev.next;
	            
	            
			}else{
				cur=cur.next;
				prev=prev.next;
			}
			
		}

	}
	public void deleteNodeFromBegining() {
		// TODO Auto-generated method stub
		if(head==null){
			return;
		}
		if(head.next==null){
			head=null;
			return;
		}
		LinkedListNode temp =head;
		head= head.next;
		temp.next=null;

	}
	
	public void display() {
		// TODO Auto-generated method stub
		LinkedListNode temp = head;
		if(temp==null){
			return;
		}
		System.out.println("");
		while(temp.next!=null){
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print(temp.data );

	}
	
	
	public void reverseLinkedList(){
		if(head==null|| head.next==null){
			return;
		}
		LinkedListNode temp=head;
		LinkedListNode prev = null;
		LinkedListNode cur = head;
		while(temp!=null){
			cur = temp.next;
			temp.next=prev;
			prev=temp;
			temp=cur;
		}
		head=prev;
		return;
		
	}
	
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(5);
		myLinkedList.addNode(7);
		myLinkedList.addNode(1);
		myLinkedList.addNode(9);
		myLinkedList.addNode(3);
		myLinkedList.addNode(8);
		myLinkedList.display();
		myLinkedList.reverseLinkedList();
		myLinkedList.display();
		myLinkedList.addNodeAtBegining(6);
		myLinkedList.display();
		myLinkedList.reverseLinkedList();
		myLinkedList.display();
		myLinkedList.deleteNode(6);
		myLinkedList.display();
	
	}
	
}


 class LinkedListNode{
	public int data;
	public LinkedListNode next;
	public LinkedListNode(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.next=null;
	}
	
}