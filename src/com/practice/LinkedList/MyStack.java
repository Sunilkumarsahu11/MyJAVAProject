package com.practice.LinkedList;

public class MyStack {
	LinkedListNode top;
	public MyStack() {
		// TODO Auto-generated constructor stub
		this.top=null;
	}
	
	public void push(int data){
		LinkedListNode node = new LinkedListNode(data);
		node.next=top;
		top=node;
		
	}
	
	public LinkedListNode pop(){
		LinkedListNode temp=null;
		if(top==null){
			return null;
		}else{
			temp = new LinkedListNode(top.data);
			top=top.next;
						
		}
		return temp;
	}
	
	public LinkedListNode peek(){
		if(top!=null){
			return top;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
	}

}


