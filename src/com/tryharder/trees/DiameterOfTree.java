package com.tryharder.trees;

import java.net.Inet4Address;

public class DiameterOfTree {

/*    Notes
    Diameter of a binary tree is the length of the longest path between any two nodes of the tree.
    Length between any two nodes is equal to the number of edges traversed to reach one node from the other.
    Constraints:

            1 <= number of nodes in the given tree <= 105
            0 <= node value < number of nodes
    Node values are unique*/


    class BinaryTreeNode {
        Integer value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static Integer helper(BinaryTreeNode node)
    {
        if(node==null)
            return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        treeLength = Integer.max(treeLength, left + right);

        return 1+Integer.max(left, right);

    }

    static Integer treeLength =0;
    static Integer binary_tree_diameter(BinaryTreeNode root) {

        helper(root);
        return treeLength;
    }

    public static void main(String[] args) {


    }
}
