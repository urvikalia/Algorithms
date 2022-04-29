package com.tryharder.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearchTree {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,7,8,9,2,1,3));
        System.out.println("Creating binary search tree for input");
        BST root = new BST(6);
        root = root.createBST(root, input);

        System.out.println("Printing tree:BFS");
        root.search(root,9);

        root.search(root, 100);

        System.out.println("Minimum value in Binary search tree is:");
        System.out.println(root.getMin(root));

        System.out.println("Maximum value in binary search tree is:");
        System.out.println(root.getMax(root));



    }
}
