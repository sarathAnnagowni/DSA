package com.sort;

public class MergeSort {

    public static void main(String[] args){
        int[] arr={4,22,-51,1,9,-6,3,97,-24,6};
        mergeSort(arr,0,arr.length-1);
        print(arr);
    }
    private static void print(int[] arr) {
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
    int[] array;

    public void sort(){
        int[] temp=new int[array.length];
        mergeSort(array,0,array.length-1);
    }


    public static void mergeSort(int[] array,int start,int end){

       if(start<end){
           int mid =(start+end)/2;
           System.out.println("start : "+start+" end : "+end+" middle: "+mid);
           mergeSort(array,start,mid);
           mergeSort(array,mid+1,end);
           merge(array,start,mid,end);
       }

    }

    private static void merge(int[] array, int start, int mid, int end) {

        int n1=mid-start+1;
        int n2=end-mid;

        int[] L=new int[n1];
        int[] R=new int[n2];


        for(int i=0;i<L.length;i++){
            L[i]=array[start+i];
        }

        for(int i=0;i<R.length;i++){
            R[i]=array[mid+1+i];
        }

       int i=0;int j=0;int k=start;

       while(i<n1 && j<n2){
           if(L[i]<=R[j]){
               array[k]=L[i];
               i++;
           }else{
               array[k]=R[j];
               j++;
           }
           k++;
       }


       while(i<n1){
           array[k]=L[i];
           i++;
           k++;
       }

       while(j<n2){
           array[k]=R[j];
           j++;
           k++;
       }
    }
}
