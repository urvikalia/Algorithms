package com.tryharder.recursion;

//
//Given an array of unique numbers, return in any order all its permutations.
//input : {
//        "arr": [1, 2, 3]
//        }
//
//Output
//        [
//        [1, 2, 3],
////        [1, 3, 2],
////        [2, 1, 3],
////        [2, 3, 1],
////        [3, 2, 1],
////        [3, 1, 2]
////        ]
////
//        Constraints:
//
//        1 <= size of the input array <= 9
//        0 <= any array element <= 99

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permute{



    static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        helper(arr, 0, result);

        return result;
    }


    static void helper(List<Integer> input, int ind, ArrayList<ArrayList<Integer>> result) {

        
    }

    public static void main(String[] args) {
        System.out.println("printing all possible permutations");
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        ArrayList<ArrayList<Integer>> results = get_permutations(input);
        System.out.println(results.size());


        for (ArrayList<Integer> result : results) {
            System.out.println(result);
        }


    }
}