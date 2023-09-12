package com.array;

public class MissingNumber {
    public static void main(String[] args) {
       int[] list=new int[100000];
       for(int i=0;i<list.length-1;i++){
           list[i] = i+1;
       }
       list[21]=0;
       System.out.println(missingNumber(list));

    }


    static int  missingNumber(int[] li){
        int n= li.length+1;
        int expectedSum=(n*(n+1))/2;
        int sum=0;
        for (int i:li) {
            sum=sum+i;
        }

        return expectedSum-sum;
    }
}
