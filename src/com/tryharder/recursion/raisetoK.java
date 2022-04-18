package com.tryharder.recursion;

public class raisetoK {

    static int raisetoK(int n, int k)
    {
        if(k==0)
            return (1);
        else
            return (n* raisetoK(n, k - 1)); // Time complexity O(k) , space complexity =

    }

    static int iterativeApproach(int n,int k)
    {
        int result = 1;
        for (int i = 0; i < k; i++) {
            result =result*n;
        }
        return (result);

    }

    public static void main(String[] args) {

        int number = 2;
        int k=5;
        System.out.println("Output of raisetoK function: ");
        System.out.println(raisetoK(number,k));


        System.out.println("Iterative approach");
        System.out.println(iterativeApproach(5,3));
    }
}
