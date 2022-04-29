package com.tryharder.trees;

public class PathSum {

//    Given a binary tree and an integer k, check whether the tree has a root to leaf path with a sum of values equal to k.


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

    static boolean helper(BinaryTreeNode root, long k){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return k-root.value == 0;
        }

        if(root.left != null){
            if(helper(root.left, k-root.value)){
                return true;
            }
        }

        if(root.right != null){
            if (helper(root.right, k-root.value)){
                return true;
            }
        }

        return false;

    }
    static Boolean path_sum(BinaryTreeNode root, Integer k) {
        // Write your code here.

        boolean checkSum = helper(root, k);
        return checkSum;
    }

    public static void main(String[] args) {


        BinaryTreeNode root = new BinaryTreeNode(2);
        BinaryTreeNode five = new BinaryTreeNode(5);
        BinaryTreeNode four= new BinaryTreeNode(4);
        BinaryTreeNode zero = new BinaryTreeNode(0);
        BinaryTreeNode one = new BinaryTreeNode(1);
        BinaryTreeNode three = new BinaryTreeNode(3);
        BinaryTreeNode six = new BinaryTreeNode(6);

        five.left = zero;
        five.right = one;
        four.left=three;
        four.right=six;
        root.left = five;
        root.right = four;


        boolean checkSum = path_sum(root, 12);
        System.out.println(checkSum);


    }
}
