package org.espire.binarytree;


public class LeafNode {

    // class for binary tree node
    public static class TreeNode {
        Integer data;
        TreeNode left;
        TreeNode right;
    }

    // function to create a new node
    public static TreeNode newNode(Integer data) {
        TreeNode node = new TreeNode();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
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

    public static void main(String args[]) {

        TreeNode root = newNode(1);
        root.left = LeafNode.newNode(2);
        root.right = LeafNode.newNode(3);
        root.left.left = LeafNode.newNode(4);
        root.right.left = LeafNode.newNode(5);
        root.right.right = LeafNode.newNode(6);

        printLeaves(root);
    }
}
