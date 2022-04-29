package com.tryharder.recursion;

import java.util.ArrayList;


/*
Given two integers n and k, find all the possible unique combinations of k numbers in range 1 to n.


        {
        "n": 5,
        "k": 2
        }


        [
        [1, 2],
        [1, 3],
        [1, 4],
        [1, 5],
        [2, 3],
        [2, 4],
        [2, 5],
        [3, 4],
        [3, 5],
        [4, 5]
        ]


        The answer can be returned in any order.

        Constraints:

        1 <= n <= 20
        1 <= k <= n
*/

public class NChooseKCombination {


    static ArrayList<ArrayList<Integer>> helper(int n, int ind, int k, ArrayList<Integer>slate,ArrayList<ArrayList<Integer>> result)
    {

        if(k==slate.size())
        {
            result.add(new ArrayList<Integer>(slate));
           /* slate = new ArrayList<Integer>();*/
        }
        else
        {
            for(int i =ind;i<n;i++) {
                slate.add(ind + 1);
                helper(n, ind + 1, k, slate, result);
                //slate.add(ind + 1);
               // helper(n, ind + 1, k, slate, result);
                slate.remove(slate.size() - 1);

            }

            //slate = new ArrayList<Integer>();

        }
        return result;
    }
    static ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        result= helper(n,0,k,new ArrayList<Integer>(),result);
        return result;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = find_combinations(5, 2);

        System.out.println(result.size());
        for (ArrayList<Integer> res : result) {
            System.out.println(res);
        }
    }
}
