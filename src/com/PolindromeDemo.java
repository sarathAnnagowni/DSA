package com;

import java.util.ArrayList;

public class PolindromeDemo {
    public static void main(String[] args) {
     int[] arr1= {1,2,2,1};
        int[] ar2= {2,3,1,1,6,4};
        for (Integer a: solve(arr1,ar2)) {
            System.out.println(a);
        }


    }

    //n 5  0 1 1 2 3
    //n 12 0 1 1 2 3 5 8 13 21 34 55 89
    static int returnFibonacci(int n){
        if(n==0){
            System.out.println(n);
            return 0;
        }else if(n==1){
            System.out.println(n);
            return 1;
        }else{
            while(n>0){
                System.out.println(n);
                return returnFibonacci(n-1)+returnFibonacci(n);
            }

        }

return 0;
    }
//454
   // 454/10 = 45, rem=4 sum=0+4*10=40
    //45/10 = 4 rem=5  sum= 40 + 5*10 = 90
   // 4/10 =0  rem=4
    //

    static boolean  isPolindrome(int number){
        int reverse=0;
        int actual=number;
        while(number>0){
            number = number/10;
            int re = number%10;
            reverse+=re*10;
        }

        if(reverse==actual){
            return true;
        }




        return false;
    }


        // Do not write code to include libraries, main() function or accept any input from the console.
        // Initialization code is already written and hidden from you. Do not write code for it again.
        public static int pow(int A, int B, int C) {
            // Just write your code below to complete the function. Required input is available to you as the function arguments.
            // Do not print the result or any output. Just return the result via this function.

            double pow = 1;
            if(A < 0){
                pow = -1;
            }
            if(B == 0 ){
                pow = 1;
            }else if(B == 1 ){
                pow = A;
            }else {
                while(B > 1){
                    pow *= A;
                    B--;
                }

            }
System.out.println("Power "+pow);
            double re = pow % C;
            if(re < 0){
                return (int) (C+re);
            }

            return (int) (pow % C);

        }


    // Initialization code is already written and hidden from you. Do not write code for it again.
    public static int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int size;

        if (A.length < B.length) {
            size = A.length;

        } else {
            size = B.length;
        }
        ArrayList<Integer> list = new ArrayList<>();

        if (A.length < B.length) {
            for (int a : A) {
                for (int i = 0; i < B.length; i++) {
                    if (a == B[i]) {
                        list.add(a);
                        B[i]=Integer.MAX_VALUE;
                    }
                }
            }
        } else {

            for (int b : B) {
                for (int i = 0; i < A.length; i++) {
                    if (b == A[i]) {
                        list.add(b);
                        A[i]=Integer.MAX_VALUE;
                    }
                }
            }

        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;


    }
}
