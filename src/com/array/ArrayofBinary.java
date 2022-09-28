package com.array;

public class ArrayofBinary {
    public static void main(String[] args){
        int[] array={1,0,0,1,1,0,1};
        sideZerores(array);
        print(array);
    }

    private static void sideZerores(int[] array) {
        int left=0;
        int temp=0;
        for(int i = 0; i< array.length; i++){
            if(array[i]==0){
                temp= array[left];
                array[left]= array[i];
                array[i]=temp;
                ++left;
            }

        }
    }

    private static void print(int[] a) {
        System.out.println("------------------");
        for (int i: a) {
            System.out.print(i+" ");
        }
    }


}
