package com.sort;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr={4,22,-51,1,9,-6,3,97,-24};
        bubbleSort(arr);
        print(arr);

    }

    private static void print(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] array){
        int k=0;
        for(int i=0;i<array.length;i++){
            k++;
            for(int j=0;j< array.length;j++){
                if(array[i]<array[j]){
                    swap(i,j,array);
                }
                k++;
            }
        }
        System.out.println(k);

    }

    private static void swap(int i, int j,int[] array) {
        int temp=0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
