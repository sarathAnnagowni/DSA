package com.CCI;

import java.util.Arrays;

public class UniqueStringTest {
    public static void main(String[] args){
        System.out.println(isUnique("rey"));

    }
     // O(n2) This is Sliding window Approach
    public static boolean isUnique(String word){
        char[] wordChars=word.toCharArray();
        for(int i=0 ; i<wordChars.length-1; i++){
            for(int j=i+1;j<wordChars.length;j++){
                if(wordChars[i]==wordChars[j]){
                    return false;
                }
            }
        }
        return true;
    }

    // O(NlogN) This is
    public static boolean isUniquHelpOfSort(String word){
        char[] wordChars=word.toCharArray();
        Arrays.sort(wordChars);
        for(int i=0 ; i<wordChars.length-1; i++){
                if(wordChars[i]==wordChars[i+1]){
                    return false;
                }
        }
        return true;
    }

    public static boolean isUnique3(String word){
        char[] wordChars=word.toCharArray();
        Arrays.sort(wordChars);
        for(int i=0 ; i<wordChars.length-1; i++){
            if(wordChars[i]==wordChars[i+1]){
                return false;
            }
        }
        return true;
    }



}
