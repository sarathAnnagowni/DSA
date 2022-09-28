package com.array;

public class RotateArray {
    public static void main(String args[]){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        print(a);
        rotateArray(a,0,3);
        print(a);
        rotateArray(a,4,a.length-1);
        print(a);
        rotateArray(a,0,a.length-1);
        print(a);

    }

    private static void print(int[] a) {
        System.out.println("------------------");
        for (int i: a) {
            System.out.print(i+" ");
        }
    }

    public static void rotateArray(int[] array,int startIndex,int endIndex){

        while(startIndex<endIndex){
            int temp=array[startIndex];
            array[startIndex]=array[endIndex];
            array[endIndex]=temp;
            startIndex++;
            endIndex--;
        }

    }

}
