package print_leaf_node;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeafNodeTest {
	PrintBinayTreeLeafNode node = new PrintBinayTreeLeafNode();

	@Test
	public void testLeafNode() {

		PrintBinayTreeLeafNode.TreeNode root = PrintBinayTreeLeafNode.addNewNode(1);
		root.left = PrintBinayTreeLeafNode.addNewNode(2);
		root.right = PrintBinayTreeLeafNode.addNewNode(3);
		root.left.left = PrintBinayTreeLeafNode.addNewNode(4);
		root.right.left = PrintBinayTreeLeafNode.addNewNode(5);
		root.right.right = PrintBinayTreeLeafNode.addNewNode(8);
		root.right.left.left = PrintBinayTreeLeafNode.addNewNode(5);
		root.right.left.right = PrintBinayTreeLeafNode.addNewNode(7);
		root.right.right.left = PrintBinayTreeLeafNode.addNewNode(12);
		root.right.right.right = PrintBinayTreeLeafNode.addNewNode(18);
		PrintBinayTreeLeafNode.printLeafNodes(root);
	}

}
