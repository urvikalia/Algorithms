package com.tryharder.recursion;

import java.util.ArrayList;
import java.util.Stack;

public class test2 {
//    Given a positive integer n, return ALL strings of length 2 * n with well-formed round brackets.

//    {
//        "n": 3
//    }
//
//    [
//            "((()))",
//            "(()())",
//            "(())()",
//            "()(())",
//            "()()()"
//            ]
//


    static boolean check_wellformed(String slate)
    {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < slate.length(); i++) {
            char c =slate.charAt(i);
            if(c=='(')
                stack.push(c);
            else {
                if(!stack.isEmpty())
                    stack.pop();
                else
                    return false;
            }
        }
        return (stack.empty());
    }

    static void helper(int index, int n , String slate, ArrayList<String> result)
    {
        if (index == n) {
            boolean check = check_wellformed(slate.toString());
            if(check)
                result.add(new String(slate));
            return;
        }
        else
        {
                helper(index+1,n,slate+'(',result);
                helper(index+1,n,slate+')',result);
        }
    }

    static ArrayList<String> find_all_well_formed_brackets(Integer n) {

        int length = n * 2;
        ArrayList<String> result = new ArrayList<>();

        String slate = new String();
        helper( 0,length ,slate,result);

        return result;
    }


    public static void main(String[] args) {

        ArrayList<String> result =find_all_well_formed_brackets(3);

        System.out.println("output ");
        for (String res : result) {
            System.out.println(res);
        }

    }
}
