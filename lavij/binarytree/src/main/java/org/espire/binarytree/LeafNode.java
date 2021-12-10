package org.espire.binarytree;


public class LeafNode {

	// class for binary tree node
	private static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		// function to create a new node
		public TreeNode(int data) {
			data = data;
			left = null;
			right = null;
		}

		// create a binary tree
		public static TreeNode constructBST(int[]arr,int start,int end,TreeNode root)
		{
		    if(start>end)
		        return null;
		    int mid=(start+end)/2;

		    if(root==null)
		        root=new TreeNode(arr[mid]);

		    root.left=constructBST(arr,start,mid-1, root.left);
		    root.right=constructBST(arr,mid+1,end, root.right);

		    return root;

		}

		// function to print leaf
		public static TreeNode printLeaves(TreeNode root) {
			if (root == null) {
				return null;
			}

			if (root.left == null && root.right == null) {
				System.out.println("" + root.data);
			}

			// if left child exist
			if (root.left != null) {
				printLeaves(root.left);
			}

			// if right child exist
			if (root.right != null) {
				printLeaves(root.right);
			}
			return root;
		}
	}
	public static void main(String args[]) {
		
		TreeNode root= null;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("leaf nodes are: ");
		root = TreeNode.constructBST(a, 0, a.length - 1,root);
		TreeNode.printLeaves(root);
		
	}
}
