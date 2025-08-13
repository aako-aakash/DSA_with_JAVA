package com.aako;

class Node{
	int data;
	Node left,right;
	Node(int val){
		data=val;
		left=right=null;
	}
}
public class BinarySearchTree {
		Node root;
		
		//Insert method
		void insert(int value) {
			root=insertNode(root,value);
			
		}
		
		Node insertNode(Node root,int value) {
			if(root==null) {
				return new Node(value);
				
				
			}
			
			if(value<root.data) {
				root.left=insertNode(root.left,value);
			}else if(value>root.data) {
				root.right=insertNode(root.right,value);
			}
			
			return root;
			
		}
		
		// Inorder traversal(print BST)
		
		void inorderPrint(Node root) {
			if(root!=null) {
				inorderPrint(root.left);
				System.out.print(root.data+" ");
				inorderPrint(root.right);
				
			}
			
		}
		
		
		public static void main(String[] args) {
			
			BinarySearchTree bst=new BinarySearchTree();
			
			
			bst.insert(10);
			bst.insert(5);
			bst.insert(3);
			bst.insert(11);
			bst.insert(4);
			bst.insert(19);
			
			System.out.println("Inorder Traversal Values of BST: ");
			bst.inorderPrint(bst.root);
			
		}
}
