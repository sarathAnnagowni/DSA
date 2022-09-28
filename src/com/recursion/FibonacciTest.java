package com.recursion;

public class FibonacciTest {

    public static void main(String[] args){
        System.out.println(fibonacci(6));
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
