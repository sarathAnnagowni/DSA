package com.array;

public class LargestNumberInTheArray {
    public static void main(String args[]){
        int[] a={8,7,3,6,78,43,98,78};
        System.out.println(maxElement(a));
    }

    public static int maxElement(int[] array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;

    }
}
