package com.CCI.chapter1;

import java.util.HashMap;

public class PermutedPolindromeTest {
    public static void  main(String[] args){
        System.out.println(isPermutedPolindrome("aabbacccc"));

    }
    public static boolean isPermutedPolindrome(String word){
        HashMap<Character,Integer> countArray=new HashMap<>();
        char[] wordChars=word.toCharArray();
        for (char c: wordChars) {
            if(countArray.containsKey(c)){
               int cou=countArray.get(c);
                cou++;
                countArray.put(c,cou);
            }else{
                countArray.put(c,1);
            }
        }
        int oddCount=0;
        for (char c: countArray.keySet()) {
            if(countArray.get(c)%2==1){
                oddCount++;
                if(oddCount>1){
                    return false;
                }
            }
        }

        return true;
    }

}
