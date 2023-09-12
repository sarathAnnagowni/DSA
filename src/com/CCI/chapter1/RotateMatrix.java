package com.CCI.chapter1;

public class RotateMatrix {

    public static void main(String args[]){
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(arr);
        rotate(arr);
        System.out.println("rotated");
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr){
        transposeMatrix(arr);
        reverseRows(arr);
    }

    public static void transposeMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }


    }

    public static void reverseRows(int[][] arr){
        for(int i=0;i<arr.length;i++){
         reverseRow(arr[i]);
        }

    }

    public static void reverseRow(int[] row){
        for(int i=0,j=row.length-1;i<j;i++,j--){
            int temp=row[i];
            row[i]=row[j];
            row[j]=temp;
        }
    }
}
