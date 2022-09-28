package com.sort;

public class QuickSort {
    public static void main(String[] args){

    }
    private static void print(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] array,int lower,int upper){
        if(upper<=lower){
            return;
        }
        int pivot=array[lower];
        int start=lower;
        int end=upper;

    }
    private static void swap(int i, int j,int[] array) {
        int temp=0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
