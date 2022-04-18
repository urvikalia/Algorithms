package com.tryharder.recursion;

public class countSubsets {

//How many subsets of set of size n are there ?

    static int countSubset(int noOfPossibilities)
    {
        if(noOfPossibilities==0)
            return (1);
        else
            return (2 * countSubset(noOfPossibilities - 1)); // time complexity is O(n)
    }

//    TODO: Optimized for time complexity
    public static void main(String[] args) {
        System.out.println(Math.pow(2,5));
        System.out.println(countSubset(5));
    }
}
