package com.CCI.chapter1;

public class URLifyTest {
    public static void main(String[] args){
        System.out.println(isUrlify(" ab  cdd"));

    }
    public static String isUrlify(String word){
        int count=0;
        int length=word.length();
        for (char c: word.toCharArray()) {
           if(c==' '){
               count++;
           }
        }
        System.out.println(count);
        int urlLength=length+2*count;
        System.out.println(urlLength);
        char[] url=new char[urlLength];
        int j=length-1;
        while(j>=0){
            if(word.charAt(j)!=' '){
                url[urlLength-1]=word.charAt(j);
                urlLength--;
            }else{
                url[urlLength-3]='%';
                url[urlLength-2]='2';
                url[urlLength-1]='0';
                urlLength=urlLength-3;
            }
            j--;
        }

       return new String(url);
    }


}
