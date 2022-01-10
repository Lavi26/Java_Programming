package org.espire.leafofbinarytree;

import org.espire.leafofbinarytree.AllLeafOfBinaryTree.TreeNode;
import org.junit.Test;

public class TestAllLeafOfBinaryTree {

	class TreePracticeTest {
		@Test
		public void testLeafNode() {
			AllLeafOfBinaryTree.printLeaves(null);
			new TreeNode("d");
			new TreeNode("e");
			new TreeNode("g");
			TreeNode node = new TreeNode("d,e,g");

			AllLeafOfBinaryTree.printLeaves(node);
		}

	}
}