package com.CCI.chapter1;

public class RotationOfString {

    public static void main(String[] args){
        System.out.println(isRotation("water",null));

    }

    public static boolean isRotation(String word1,String word2){

        if(word1.length()!=word2.length()){
            return false;
        }
        String word3=word1+word1;
        if(word3.contains(word2))
          return true;
        else
            return false;
    }
}
