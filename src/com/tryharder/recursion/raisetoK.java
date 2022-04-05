package com.tryharder.recursion;

public class raisetoK {

    static int raisetoK(int n, int k)
    {
        if(k==0)
            return (1);
        else
            return (n* raisetoK(n, k - 1));

    }

    public static void main(String[] args) {

        int number = 2;
        int k=5;
        System.out.println("Output of raisetoK function: ");
        System.out.println(raisetoK(number,k));

    }
}
