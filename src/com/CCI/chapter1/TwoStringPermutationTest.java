package com.CCI.chapter1;

public class TwoStringPermutationTest {

    public static void main(String[] args){
        System.out.println(isPermutation("india","adini"));

    }

    public static boolean isPermutation(String s1,String s2){
        //length check done
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] letters=new int[128];
        char[] firstString=s1.toCharArray();
        char[] secondString=s2.toCharArray();
        for (char c: firstString) {
            letters[c]++;
        }
        for (char c: secondString) {
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }

        return true;

    }
}
