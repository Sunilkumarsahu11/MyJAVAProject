package com.practice.tree;

public class MyBSTree {
	public TreeNode root;

	public MyBSTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}

	public void addNode(int num) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(num);
		if(root==null){
			root=node;
			return;
		}
		
		TreeNode temp=root,parent;
		while(true){
			parent = temp;
			
			if(num < temp.data){
				temp=temp.left;
				if(temp==null){
					parent.left=node;
					return;
				}
			}else{
				temp=temp.right;
				if(temp==null){
					parent.right=node;
					return;
				}
			}
		}
	}
	
	public boolean find(int num) {
		// TODO Auto-generated method stub
		TreeNode current = root;
		if(root==null){
			return false;
		}
		while(current!=null){
			
			if(num == current.data){
				return true;
			}
			if(num<current.data){
				current=current.left;
			}else{
				current=current.right;
			}
		}
		return false;

	}
	

	private void deleteNode(int key) {
		// TODO Auto-generated method stub
		root= delete(root, key);
	}

	public TreeNode delete(TreeNode node,int key){
		if(node==null){
			return node ;
		}
		if(key<node.data){
			node.left=delete(node.left,key);
		}else if (key>root.data){
			node.right=delete(node.right,key);
		}else{
			//node to be deleted
			if(node.left==null){
				return node.right;
			}else if(node.right==null){
				return node.left;
			}
			
			node.data=findMinVal(node.right);
			node.right=delete(node.right,node.data);
			
			
		}
		return node;
	}
	
	public int findMinVal(TreeNode node){
		int minVal = node.data;
		while(node.left != null){
			minVal=node.data;
			node=node.left;
		}
		return minVal;
	}
	private TreeNode findNode(TreeNode node,int num) {
		// TODO Auto-generated method stub
		if(node==null){
			return node;
		}
		if(node.data==num){
			return node;
		}else if(num<node.data){
			return findNode(node.left,num);
		}else if(num>node.data){
			return findNode(node.right,num);
		}
		return node;
		
		

	}

	private void printInOrderBSTree(TreeNode node) {
		// TODO Auto-generated method stub
		if (node != null) {
		
			printInOrderBSTree(node.left);
			System.out.print(node.data+" ");
			printInOrderBSTree(node.right);
		}

	}

	private void printPreOrderBSTree(TreeNode node) {
		// TODO Auto-generated method stub
		
		if (node != null) {

			System.out.print(node.data+" ");
			printInOrderBSTree(node.left);
			printInOrderBSTree(node.right);
		}

	}

	private void printPostOrderBSTree(TreeNode node) {
		// TODO Auto-generated method stub
		
		if (node != null) {

			printInOrderBSTree(node.left);
			printInOrderBSTree(node.right);
			System.out.print(node.data+ " ");
		}
	}
	
	public static void main(String arg[]){
		int [] a = {3,8,1,4,6,2,10,9,20,25,15,16};
		MyBSTree b = new MyBSTree();
		/*b.addNode(3);b.addNode(8);
		b.addNode(1);b.addNode(4);b.addNode(6);b.addNode(2);b.addNode(10);b.addNode(9);
		b.addNode(20);b.addNode(25);b.addNode(15);b.addNode(16);*/
		for (int i = 0; i < a.length; i++) {
			b.addNode(a[i]);
		}
		System.out.println("Original Tree : ");
		b.printInOrderBSTree(b.root);		
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		System.out.println("Delete Node with no children (2) " );
		b.deleteNode(2);		
		b.printInOrderBSTree(b.root);
		System.out.println("\n Delete Node with one child (4) ");
		b.deleteNode(4);		
		b.printInOrderBSTree(b.root);
		System.out.println("\n Delete Node with Two children (10)  " );
		b.deleteNode(10);		
		b.printInOrderBSTree(b.root);
		
		
		
	}
}
