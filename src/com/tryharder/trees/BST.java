package com.tryharder.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BST {



    private int key;
    BST left;
    BST right;

    public BST(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
    public int getKey() {
        return key;
    }


    public BST insert(BST root, int key)
    {
        BST node = new BST(key);
        if(root ==null)
            return node;

        BST current = root;
        BST previous =null;
        while (current != null) {
            previous=current;

            if(current.key > key)
                current=current.left;
            else
                current = current.right;
        }

        if(previous.key>key)
            previous.left= node;
        else
            previous.right=node;

        return root;
    }

    public BST createBST (BST root ,ArrayList<Integer> input)
    {
        for (Integer item : input) {
            root = insert(root, item);
        }
        return root;
    }

    public void search(BST root,int key)
    {
        if(root==null) {
            System.out.println("BST null");
            return;
        }
        BST current = root;
        while(current!=null)
        {
            if(current.key == key) {
                System.out.println("Key found");
                return;
            }

            if(current.key > key)
                current=current.left;
            else
                current=current.right;
        }

        System.out.println("Key not found");;
    }

    public BST delete (BST root,int key)
    {
        return root;
    }

    public Integer getMin(BST root)
    {
        if(root ==null)
            return null;

        BST current= root;
        while(current.left !=null)
            current = current.left;


        return current.key;
    }

    public Integer getMax(BST root)
    {
        if(root==null)
            return null;

        BST current =root;
        while(current.right!=null)
            current =current.right;
        return current.key;
    }

    /*
    Breadth first search
     */
    public List<List<Integer>> bsf(BST root)
    {
        BST current = root;
        LinkedList<BST> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            int queueSize = queue.size();
            ArrayList<Integer> levelNodes = new ArrayList<>();

            for(int i =0;i<queueSize;i++)
            {
                BST node = queue.pop();
                levelNodes.add(node.key);

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

            }
            result.add(new ArrayList<>(levelNodes));

        }
        return result;
    }

    public void printPreOrder(BST root)
    {

    }
    public void printInOrder(BST root)
    {

    }
    public void printPostOrder(BST root)
    {

    }





}
