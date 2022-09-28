package com.recursion;

public class GCDTest {
    public static void main(String[] args){
        System.out.println(findGCD(2024,2046));

    }
    public static int findGCD(int input1,int input2){
        if(input1<input2){
            return findGCD(input2,input1);
        }
        else{
            int div=input1%input2;
            if(div==0){
                return input2;
            }
            return findGCD(input2,div);

        }
    }
}
