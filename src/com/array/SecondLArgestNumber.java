package com.array;

public class SecondLArgestNumber {
    public static void main(String args[]){
        int[] a={10,5,9,-6,-9,15,14,11};
        System.out.println(maxElement(a));
        System.out.println(secondMaxElement1(a));
    }
    public static int secondMaxElement1(int[] array){

        int largest=0;int secondLargest=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }
            if(array[i]>secondLargest && array[i]<largest){
                secondLargest=array[i];
            }
        }

      return secondLargest;
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
    public static int secondMaxElement(int[] array){
        int maxElement=maxElement(array);
        int secondMAx=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]>secondMAx && array[i]!=maxElement){
                secondMAx=array[i];
            }

        }
        return secondMAx;
    }
}
