package com.tryharder.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class sumNumbers {

    /*Implement brute force
    * Requirements: find two numbers in the given array whose sum is given as Target
    * Input: input array , Target value
    * Output pair of numbers */

//    nested for loops : one runs n times and other (n-1)times , so time complexity is n(n-1) => O(N^2)


    private static String findNumbers(int []input, int target)
    {
        for (int x = 0; x<input.length; x++) {  // n times

            int yvalue = target-input[x];
            for(int y = (x + 1);y<input.length;y++) // (n-1) times
            {
                if(input[y]==yvalue)
                    return("numbers found:" + input[x] + " & "+ input[y]);
            }

        }
        return ("Number whose sum is: " + target +" not found");
    }

    /*once you have a brute force solution
    * think if divide & conquer and decrease and conquer give an performance benefit, which they dont*/

    /*Coming to transform and conquer
    * Maximum time is spent in searching the second element
    * There are three ways to transform
    * 1. sort input and then search the other elmenet using binary search , overall => O(nlogn)
    * 2. Buid BST
    * 3. Build a hash table for the input */

    /*If memory is a concern , can use two pointer approach (once sorted)*/


    private static String twoPointerApprach(int[]input,int target)
    {
        Arrays.sort(input);

        int leftcounter = 0;
        int rightcounter = input.length-1;
        while(leftcounter<rightcounter)
        {
            int sum = input[leftcounter] + input[rightcounter];
            if(sum==target) {
                return ("match found:" + input[leftcounter] + " & " + input[rightcounter]);
            }
            else if(sum>target)
                rightcounter--;
            else
                leftcounter++;

        }
        return ("No match found");
    }


    /*Given an array sorted in non-decreasing order and a target number, find the indices of the two values from the array that sum up to the given target number.
        In case when no answer exists, return an array of size two with both values equal to -1, i.e., [-1, -1].
        In case when multiple answers exist, you may return any of them.
        The order of the indices returned does not matter.
        A single index cannot be used twice.
        2 <= Array Size <= 105.
        -105 <= Array Elements <= 105.
        -105 <= Target Number <= 105.
        Array can contain duplicate elements.
     */

    // return indices of two values that sum up the target
    static ArrayList<Integer> pair_sum_sorted_array(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.


        for (int x = 0; x< numbers.size(); x++) {  // n times

            int yvalue = target-numbers.get(x);
            for(int y = (x + 1);y< numbers.size();y++) // (n-1) times
            {
                if (numbers.get(y) == yvalue) {
                    ArrayList output =new ArrayList();
                    output.add(x);
                    output.add(y);
                    return (output);
                }
            }

        }
        return new ArrayList(Arrays.asList(-1,-1));
    }





    public static void main(String[] args) {
        System.out.println("Brute force approach for Sum of Numbers problems");
        int [] input ={2,4,5,6,7,8,10};
        int target = 11;
        System.out.println(findNumbers(input, target));


        System.out.println("Two pointer approach");
        System.out.println(twoPointerApprach(input,12));

        System.out.println("pair_sum_sorted_array");
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(input).boxed().collect(Collectors.toList());

        ArrayList <Integer> output = pair_sum_sorted_array(integerArray, 110);
        System.out.println(output);

    }
}
