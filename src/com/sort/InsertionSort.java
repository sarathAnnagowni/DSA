package com.sort;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={4,22,-51,1,9,-6,3,97,-24};
        insertionSort(arr);
        System.out.println();
        print(arr);
    }
    private static void print(int[] arr) {
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }

    public  static void insertionSort(int[] array){
        int k=0;
        for(int i=0;i<array.length;i++){
            k++;
            int temp,j;
            temp=array[i];
            for(j=i; j>0 && isGreater(array[j-1],temp); j--){
                array[j]=array[j-1];
                k++;
            }
            array[j]=temp;
        }
        System.out.println(k);
    }

    private static boolean isGreater(int m, int n) {
        return m > n;
    }
}
