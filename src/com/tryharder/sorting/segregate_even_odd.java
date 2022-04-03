package com.tryharder.sorting;

/*
Given an array of numbers, rearrange them in-place so that even numbers appear before odd ones.

        The order within the group of even numbers does not matter; same with odd numbers. So the following are also correct outputs: [4, 2, 1, 3], [2, 4, 1, 3], [2, 4, 3, 1].

        It is important to practice solving this problem by rearranging numbers in-place.
        There is no need to preserve the original order within the even and within the odd numbers.
        We look for a solution of the linear time complexity that uses constant auxiliary space.
        Constraints:

        1 <= length of the array <= 105
        1 <= element of the array <= 109*/


import java.util.ArrayList;
import java.util.Arrays;

public class segregate_even_odd {

    static ArrayList<Integer> swap(ArrayList<Integer>input,int i,int j)
    {
        Integer temp = input.get(i);
        input.set(i, input.get(j));
        input.set(j, temp);
        return (input);
    }

    static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
        Integer even = 0;
        Integer odd =numbers.size();

        while(even<odd)
        {
            if(numbers.get(even)%2 ==0)
            {
                even++;
            }
            else
            {
                numbers = swap(numbers, even, --odd);
            }
        }
        return (numbers);

    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 3, 7, 8, 9, 6));
        ArrayList<Integer> output = segregate_evens_and_odds(input);
        for (Integer element: output) {
            System.out.println(element);
        }
    }



}
