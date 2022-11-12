package com.greatlearning.question2.driver;
import com.greatlearning.question2.model.Node;
import com.greatlearning.question2.service.SkewedTree;

public class Main 
{
	public static void main(String[] args)
	{
		Node node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);

		// Order of the Skewed tree can
		// be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1

		int order = 0;

		SkewedTree st = new SkewedTree();
		st.flattenBTToSkewed(node, order);
		st.traverseRightSkewed(SkewedTree.headNode);
	}
}


