package com.tryharder.recursion;

public class fibonacci {

    static int fibonnacciNthElement(int n)
    {
        if (n==0)
            return 0;
        if (n == 1) {
            return (1);
        }
        else
            return (fibonnacciNthElement(n - 1) + fibonnacciNthElement(n - 2));
    }

    public static void main(String[] args) {

        System.out.println(fibonnacciNthElement(12));
    }
}
