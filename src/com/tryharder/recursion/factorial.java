package com.tryharder.recursion;

public class factorial {

    /*
    For recursive as well the time complexity is the same as interative approach i.e O(n) as each (func call) does  a constant amount of work.In totality it does it n times
     */
    static int fact(int n)
    {
        if(n ==0)
            return 1;
        else
            return (n * fact(n - 1));

    }

    static int interative_approach (int n)
    {
        int result=1;
        for(int i=1;i<=n;i++) // ntimes =. time complexity => O(n)
        {
            result=result*i;
        }
        return (result);
    }
    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println(factorial);

        System.out.println(interative_approach(5));
    }
}
