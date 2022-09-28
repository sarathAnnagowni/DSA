package com.array;

import java.util.Arrays;

/*
 This is Kadane's algorithm
 */
public class MaxSumContigiousSubArray {

    public static void main(String[] args){
        int[] a={1,-2,3,4,-4,6,-14,8,2};
        int[] b={4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
       // System.out.println(maxSubArrayContigious(a));
        System.out.println(maxSubArrayContigious(b));
        print(subArrayContigiousWithMaxCount(b));

    }
    private static void print(int[] a) {
        System.out.println("------------------");
        for (int i: a) {
            System.out.print(i+" ");
        }
    }
    public static int maxSubArrayContigious(int[] array){
        int maxSoFar=0;
        int maxEndingHere=0;
        for (int i=0;i<array.length;i++){
            int startIndex=0;int endIndex=0;
            maxEndingHere+=array[i];
            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
                System.out.println("MaxEnd");
                System.out.println(i);
            }
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
        }
        return maxSoFar;
    }


    public static int[] subArrayContigiousWithMaxCount(int[] array){
        int maxSoFar=0;
        int maxEndingHere=0;
        int startIndex=0;int endIndex=0;int s=0;
        for (int i=0;i<array.length;i++){

            maxEndingHere+=array[i];
            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
                startIndex=s;
                endIndex=i;
            }
            if(maxEndingHere<0){
                maxEndingHere=0;
                s=i+1;
            }
        }
        return Arrays.copyOfRange(array, startIndex, endIndex+1);

    }
}
