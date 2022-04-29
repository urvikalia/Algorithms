package com.tryharder.trees;


import java.util.ArrayList;
import java.util.LinkedList;

// For your reference:
 class TreeNode {
     Integer value;
     ArrayList<TreeNode> children;

     TreeNode(Integer value) {
         this.value = value;
         this.children = new ArrayList(3);
     }
 }


public class OrderTraversalNArryTree {



    static ArrayList<ArrayList<Integer>> level_order(TreeNode root) {
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();

        if(root==null)
            return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int queueSize = queue.size();
            ArrayList<Integer> subResult = new ArrayList<>();

            for(int i=0;i<queueSize;i++)
            {
                TreeNode node = queue.pop();
                subResult.add(node.value);

                if(node.children!=null) {
                    for (int cnt = 0; cnt < node.children.size(); cnt++) {
                        queue.add(node.children.get(cnt));
                    }
                }

            }
            if(subResult.size()>0)
                result.add(subResult);

        }
        return result;
    }


    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        four.children.add(five);
        four.children.add(six);

        one.children.add(three);
        one.children.add(four);
        one.children.add(two);

        ArrayList<ArrayList<Integer>> result = level_order(one);

        result.stream().forEach(lst -> System.out.println(lst));





    }
}
