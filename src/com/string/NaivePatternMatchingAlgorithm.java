package com.string;

public class NaivePatternMatchingAlgorithm {
    public static void main(String[] args){
       // System.out.println(isPatternAvailable("abcbca","cbc"));
        printIndex("abcabfbcfbc","fbc");

    }
    public static boolean isPatternAvailable(String actualString,String pattern){
        char[] actualCharArray=actualString.toCharArray();
        char[] patternCharArray=pattern.toCharArray();
        int actualStringLength=actualCharArray.length;
        int patternLength = patternCharArray.length;
        if(patternLength >actualStringLength){
            return false;
        }
        for(int i=0;i<actualStringLength-patternLength+1;i++){
            int j=0;
            while(j<patternLength){
                if(actualCharArray[i+j]==patternCharArray[j]){
                    j++;
                }else{
                    break;
                }
                if(j==patternLength){
                    return true;
                }
            }
        }
        return false;

    }

    public static void printIndex(String actualString,String pattern){
        char[] actualCharArray=actualString.toCharArray();
        char[] patternCharArray=pattern.toCharArray();
        int actualStringLength=actualCharArray.length;
        int patternLength = patternCharArray.length;
        if(patternLength >actualStringLength){
            return;
        }
        for(int i=0;i<actualStringLength-patternLength+1;i++){
            int j=0;
            while(j<patternLength){
                if(actualCharArray[i+j]==patternCharArray[j]){
                    j++;
                }else{
                    break;
                }
                if(j==patternLength){
                    System.out.println(i);
                    break;
                }
            }
        }
    }



}
