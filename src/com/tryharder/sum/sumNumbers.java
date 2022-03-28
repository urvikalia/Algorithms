package com.tryharder.sum;

import java.util.Arrays;

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


    public static void main(String[] args) {
        System.out.println("Brute force approach for Sum of Numbers problems");
        int [] input ={2,4,5,6,7,8,10};
        int target = 11;
        System.out.println(findNumbers(input, target));


        System.out.println("Two pointer approach");
        Arrays.sort(input);

      
    }
}
