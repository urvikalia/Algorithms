package com.tryharder.recursion;

import java.util.ArrayList;


/*
Generate ALL possible subsets of a given set. The set is given in the form of a string s containing distinct lowercase characters 'a' - 'z'.

        {
        "s": "xy"
        }


        ["", "x", "y", "xy"]


        Notes
        Any set is a subset of itself.
        Empty set is a subset of any set.
        Output contains ALL possible subsets of given string.
        Order of strings in the output does not matter. E.g. s = "a", arrays ["", "a"] and ["a", ""] both will be accepted.
        Order of characters in any subset must be same as in the input string. For s = "xy", array ["", "x", "y", "xy"] will be accepted, but ["", "x", "y", "yx"] will not be accepted.
        Constraints:

        0 <= length of s <= 19
        s only contains distinct lowercase English letters.
*/

public class generateAllSubsets {


    static ArrayList<String> findSubsets (String partialProblem, int i, String partialSolution,ArrayList<String> result)
    {
        if(i == partialProblem.length())
            result.add(new String(partialSolution));

        else
        {
            // exclude
            findSubsets(partialProblem, i + 1, partialSolution, result);


            // include
            partialSolution = partialSolution + partialProblem.charAt(i);
            findSubsets(partialProblem, i + 1, partialSolution, result);




        }
        return result;
    }

    static ArrayList<String> generate_all_subsets(String s) {
        ArrayList<String> result = new ArrayList<String>();
        result = findSubsets(s, 0, "", result);
        return result;
    }


    public static void main(String[] args) {

        ArrayList<String> result = generate_all_subsets("AB");

        System.out.println("generating subsets ");
        System.out.println(result.size());

        for(String res: result)
        {
            System.out.println(res);
        }
    }

}
