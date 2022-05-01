package com.tryharder.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Traversal {


//    The preorder traversal processes all the nodes of a binary tree by first visiting the root, then recursively visiting its left and right subtrees respectively.
//

    static class BinaryTreeNode {
        Integer value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }


    static void helper(BinaryTreeNode node, ArrayList<Integer> result) {
        if(node==null)
            return;

        result.add(node.value);
        helper(node.left, result);
        helper(node.right, result);

    }

    static ArrayList<Integer> preorder(BinaryTreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }

//    Given a binary tree, return the inorder traversal of its node values.

    static void inorderHelper(BinaryTreeNode node,ArrayList<Integer> result)
    {
        if(node==null)
            return;

        inorderHelper(node.left,result);
        result.add(node.value);
        inorderHelper(node.right,result);

    }

    static ArrayList<Integer> inorder(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderHelper(root,result);
        // Write your code here.
        return result;
    }


    static void postorderHelper(BinaryTreeNode node, ArrayList<Integer>result) {
        if(node==null)
            return;

        postorderHelper(node.left,result);
        postorderHelper(node.right,result);
        result.add(node.value);
    }
//    Given a binary tree, find its postorder traversal.
    static ArrayList<Integer> postorder(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        // Write your code here.
        return result;
    }


    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(0);
        BinaryTreeNode one = new BinaryTreeNode(1);
        BinaryTreeNode two = new BinaryTreeNode(2);
        BinaryTreeNode three = new BinaryTreeNode(3);
        BinaryTreeNode four = new BinaryTreeNode(4);

        one.left=three;
        one.right=four;

        root.left= one;
        root.right = two;

        List <Integer> result =preorder(root);
        System.out.println("Preorder traversal: " + result);

         result =inorder(root);
        System.out.println("Inorder traversal: " + result);

        result =postorder(root);
        System.out.println("Postorder traversal: "+  result);

    }
}
