package com.recursion;

public class TowersOfHanoi {
    public static void main(String[] args){
        towersOfHanoi(4,"A","B","C");
    }
    public static void towersOfHanoi(int n,String a,String  b, String c){
        if(n>0){
            towersOfHanoi(n-1,a,c,b);
            System.out.println("Moving disks "+n+"from: "+a+" to: "+c );
            towersOfHanoi(n-1,b,a,c);
        }

    }
}
