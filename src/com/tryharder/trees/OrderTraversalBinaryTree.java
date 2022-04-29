package com.tryharder.trees;

import java.util.*;

public class OrderTraversalBinaryTree {




    static BinaryTreeNode insert (BinaryTreeNode root, int key)
    {
        BinaryTreeNode node = new BinaryTreeNode(key);

        if(root ==null)
            return node;

        BinaryTreeNode current = root;
        BinaryTreeNode prev = null;

        while(current!=null)
        {
            if (current.value == key) {
                System.out.println("Key already present");
                return root;
            }
            else if (current.value > key) {
                prev=current;
                current = current.left;
            }
            else
            { prev=current;
                current = current.right;
            }
        }


        if (prev.value > key) {
            prev.left = node;
        }
        else
            prev.right =node;

        return (root);
    }


    static ArrayList<ArrayList<Integer>> level_order_traversal(BinaryTreeNode root) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (root == null)
            return (result);

        LinkedList < BinaryTreeNode > queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int queueLength = queue.size();
            ArrayList<Integer> subresult = new ArrayList<>();

            for(int i =0;i<queueLength;i++)
            {

                BinaryTreeNode node =queue.poll();

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

                subresult.add(node.value);

            }

            if(subresult.size()>0)
            result.add(subresult);
        }
        return result;
    }


    static ArrayList<ArrayList<Integer>> reverse_level_order_traversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (root == null)
            return (result);

        LinkedList < BinaryTreeNode > queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int queueLength = queue.size();
            ArrayList<Integer> subresult = new ArrayList<>();

            for(int i =0;i<queueLength;i++)
            {

                BinaryTreeNode node =queue.poll();

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

                subresult.add(node.value);

            }

            if(subresult.size()>0)
                result.add(subresult);
        }

        // Can use Collections.reverse function rather than looping through yourself
        ArrayList<ArrayList<Integer>> reversedResult = new ArrayList<>();
        for(int cnt = result.size()-1;cnt >=0;cnt--)
        {
            reversedResult.add(result.get(cnt));
        }
        return reversedResult;
    }

    static ArrayList<Integer> right_view(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null)
            return (result);

        LinkedList < BinaryTreeNode > queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int queueLength = queue.size();
            ArrayList<Integer> subresult = new ArrayList<>();

            for(int i =0;i<queueLength;i++)
            {

                BinaryTreeNode node =queue.poll();

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

                subresult.add(node.value);

            }

            if(subresult.size()>0)
                result.add(subresult.get(subresult.size()-1));
        }
        return result;
    }

    static ArrayList<ArrayList<Integer>> zigzag_level_order_traversal(BinaryTreeNode root)
        {

            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            if (root == null)
                return (result);

            LinkedList < BinaryTreeNode > queue = new LinkedList<>();
            queue.add(root);
            int level =1;

            while(!queue.isEmpty())
            {
                int queueLength = queue.size();
                ArrayList<Integer> subresult = new ArrayList<>();

                for(int i =0;i<queueLength;i++)
                {

                    BinaryTreeNode node =queue.poll();

                    if(node.left!=null)
                        queue.add(node.left);
                    if(node.right!=null)
                        queue.add(node.right);

                    subresult.add(node.value);

                }

                if(subresult.size()>0) {
                    if(level % 2 ==0) {
                        Collections.reverse(subresult);
                        result.add(subresult);
                    }
                    else
                result.add(subresult);
                level ++;
                }
            }
            return result;
        }




    public static void main(String[] args) {

        BinaryTreeNode root = insert(null, 2);
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

        ArrayList<ArrayList<Integer>> result = level_order_traversal(root);

        for(ArrayList<Integer>lst : result)
        {
            System.out.println(lst);
        }

        System.out.println("Reverse output");
        result = reverse_level_order_traversal(root);
        result.stream().forEach(lst -> System.out.println(lst));

        System.out.println("right side view");
        ArrayList<Integer> rightView =right_view(root);
        rightView.stream().forEach(item-> System.out.println(item));


        System.out.println("zig zag tree traversal ");
        result = zigzag_level_order_traversal(root);
        result.stream().forEach(lst -> System.out.println(lst));
    }
}
