package com.CCI;

public class OneEditAwayTest {

    public static void main(String args[]){
        System.out.println(isOneEditAway("ake","pake"));

    }

    static boolean isOneEditAway(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        if(m-n>1){
            return false;
        }

      int i=0,j=0,count=0;
        while(i<m && j<n){
            if(s1.charAt(i)!=s2.charAt(j)){
               count=count+1;
               if(count>1){
                   return false;
               }
               if(m>n){
                   i++;
               }else if(n>m){
                   j++;
               }else{
                   i++;
                   j++;
               }
            }else{
                i++;
                j++;
            }
        }
        return true;
    }

}
