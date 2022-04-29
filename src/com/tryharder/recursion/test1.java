package com.tryharder.recursion;

import java.util.ArrayList;
import java.util.Collections;


/*Given a set of integers and a target value k, find whether there is a non-empty subset that sums up to k.

        {
        "arr": [2, 4, 8],
        "k": 6
        }

        1*/

public class test1 {

//    static Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {
//        int start =0;
//        int end =arr.size()-1;
//
//
//       Collections.sort(arr);
//        while(start<=end)
//        {
//            if(arr.get(start)+arr.get(end)==k)
//                return true;
//
//            //check for this condition
//            if(arr.get(start)==arr.get(end) && arr.get(start)==k)
//                return true;
//
//            if(arr.get(start)==k || arr.get(end)==k)
//                return true;
//
//            if(arr.get(start)+arr.get(end)<k)
//                start=start+1;
//            else
//                end = end - 1;
//        }
//        return false;
//    }


    static boolean helper(ArrayList<Long> arr, Long k,int index,Long subtotal)
    {
        System.out.println("For index value= "+index);

        System.out.println("subtotal: "+subtotal);
        System.out.println("arr value: "+ arr.get(index));

        if(subtotal==k)
        {
            return true;
        }
        else
        {

            //slate.add(arr.get(index));
            helper(arr,k,index+1,subtotal+arr.get(index));
        }
        return false;
    }

    static Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {
       boolean check = helper(arr,k,0,0L);
       return check;

    }
    public static void main(String[] args) {

        ArrayList<Long> input = new ArrayList<>();
        input.add(1L);
        input.add(2L);
        input.add(5L);
        input.add(8L);
        input.add(10L);



        boolean check = check_if_sum_possible(input, 5L);
        System.out.println(check);

/*

         check = check_if_sum_possible(input, 7L);
        System.out.println(check);

        check = check_if_sum_possible(input, 17L);
        System.out.println(check);

        ArrayList<Long> input2 = new ArrayList<>();
        input2.add(50L);
        check = check_if_sum_possible(input2, 50L);
        System.out.println(check);

        input2 = new ArrayList<>();
        input2.add(8L);
        input2.add(-11L);
        check = check_if_sum_possible(input2, 8L);
        System.out.println(check);
*/


    }
}
