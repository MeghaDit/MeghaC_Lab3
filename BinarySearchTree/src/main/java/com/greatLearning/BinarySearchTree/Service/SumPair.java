package com.greatLearning.BinarySearchTree.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumPair {

	
	static Node root;
	
	class Node {
	    
		int data;
		Node left, right;

		public Node(int d)
		{
			this.data = d;
			left = right = null;
		}
	}
	// Constructor
	SumPair()
	{
		root = null;
	}

	// Inorder traversal of the tree
	void inorder()
	{
		inorderRec(this.root);
	}

	// Recursive function for inorder traversal of the tree
	void inorderRec(Node node)
	{
		if (node == null)
			return;

		inorderRec(node.left);
		//System.out.print(node.data + " ");
		inorderRec(node.right);
	}

	// This method mainly calls insertRec()
	void insert(int key)
	{
		root = insertKey(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertKey(Node root, int data)
	{

		
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insertKey(root.left, data);
		else if (data > root.data)
			root.right = insertKey(root.right, data);

		return root;
	}
	
    void findPairWithGivenSum(Node root, int sum) {
    	
    	Set<Integer> set = new HashSet<>();
    	if(!findPair(root,sum,set)) {
    		System.out.println("Pair does not exist");
    	}
    	
    }
	
	public boolean findPair(Node root, int sum, Set<Integer> set) {
		if(root == null) {
			return false;
		}
		if (findPair(root.left,sum,set)) {
			return true;
		}
		if(set.contains(sum-root.data)) {
			System.out.println("pair found(" + (sum-root.data) + ',' + root.data + ')');
			return true;
		}
		else {
			set.add(root.data);
		}
		return findPair(root.right,sum,set);
	}

	// Driver function
	public static void main(String[] args)
	{
		SumPair tree = new SumPair();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		tree.inorder();
		Scanner sumInput = new Scanner(System.in);
		System.out.println("Enter the Sum:");
		int sum = sumInput.nextInt();
        tree.findPairWithGivenSum(root,sum);
		
	}
	
}


