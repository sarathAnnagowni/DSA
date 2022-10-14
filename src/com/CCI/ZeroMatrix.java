package com.CCI;

public class ZeroMatrix {
    public static void main(String args[]){
        int[][] arr={{5,0,0,5,8},
                     {9,8,8,3,9},
                     {0,7,2,3,1},
                     {1,0,4,3,2},
                     {8,1,8,5,10}
                     };
        printMatrix(arr);
        zeroMatrix(arr);
        System.out.println("zeroo ------------");
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

    public static void zeroMatrix(int[][] arr){
        boolean[] rows=new boolean[arr.length];
        boolean[] columns=new boolean[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==0){
                   rows[i]=true;
                   columns[j]=true;
               }
            }
        }
        nullifyRows(arr, rows);
        nullifyColumns(arr, columns);


    }

    private static void nullifyColumns(int[][] arr, boolean[] columns) {
        for(int j=0;j<columns.length;j++){
            if(columns[j]){
                for(int i= 0; i< arr.length; i++){
                    arr[i][j]=0;
                }
            }
        }
    }

    private static void nullifyRows(int[][] arr, boolean[] rows) {
       for(int i=0;i<rows.length;i++){
           if(rows[i]){
               for(int j = 0; j< arr[0].length; j++){
                   arr[i][j]=0;
               }
           }
       }
    }

}
