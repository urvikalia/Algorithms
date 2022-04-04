//package com.tryharder.sorting;
//
///*
//Given a list of numbers, sort it using the Merge Sort algorithm.
//
//        Constraints:
//
//        1 <= length of the given list <= 105
//        -109 <= number in the list <= 109
//*/
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class merge_sort {
//
//
//    static ArrayList<Integer> merge_sort_helper(ArrayList<Integer>input, int start, int end)
//    {
//        // leaf node
//        if(start==end)
//            return input;
//
//        //intermediate worker mode
//        int mid = (start + end) / 2;
//       input = merge_sort_helper(input, start,mid);
//        input = merge_sort_helper(input,mid+1,end);
//
//        // merge logic
//        ArrayList<Integer> merged_output = new ArrayList<Integer>();
//
//        int i =start; int j=mid+1;
//        while(i <=mid && j <=end)
//        {
//            if(input.get(i)<= input.get(j))
//            {
//                merged_output.add(input.get(i));
//                i++;
//            }
//            else {
//                merged_output.add(input.get(j));
//                j++;
//            }
//
//        }
//        while(i <= mid)
//        {
//            merged_output.add(input.get(i));
//            i++;
//        }
//        while (j <=end)
//        {
//            merged_output.add(input.get(j));
//            j++;
//        }
//
//
//
//        int index=0;
//        for(i =start;i<end;i++)
//        {
//            input.set(i, merged_output.get(index));
//            index++;
//        }
//        return input;
//    }
//    static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
//        // Write your code here.
//        ArrayList<Integer> sourted_output = merge_sort_helper(arr, 0, arr.size());
//        return sourted_output;
//
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1));
//        ArrayList<Integer> sorted_output = merge_sort(input);
//
//        for (Integer element : sorted_output) {
//            System.out.println(element);
//        }
//    }
//}
//
//
//
//
