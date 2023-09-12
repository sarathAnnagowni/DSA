package com.recursion;

public class FibonacciTest {

    public static void main(String[] args){
        fibIter(8);
    }
    public static int fibonacci(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void fibIter(int n){
        int f1 = 0, f2 = 1, i;
        System.out.print(f1 + " ");
        for ( i = 1; i < n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

    }
    public static void fiboncacciPrint(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
