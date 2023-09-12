package com.CCI.chapter1;

public class StringWithUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(isUnique("ravis"));

    }
    public static boolean isUnique(String s){
        if(s.length() > 128){
            return false;
        }
        boolean[] map= new boolean[128];
        char[] charsList = s.toCharArray();
        for (int i = 0; i < charsList.length; i++) {
            char ch=charsList[i];
            if(map[ch] == true){
                return false;
            }else{
                map[ch]=true;
            }
        }
        return true;
    }

}
