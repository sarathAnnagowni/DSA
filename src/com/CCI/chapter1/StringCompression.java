package com.CCI.chapter1;

public class StringCompression {
    public static void main(String[] args){
        System.out.println(compressString("abbbcccdddd"));
    }
    public static String compressString(String word){

        int count=1;
        StringBuilder sb=new StringBuilder();
        char ce=word.charAt(0);
        for (int i=0;i<word.length();i++) {
            if(i==word.length()-1){
                if(word.charAt(i)!=word.charAt(i-1)){
                    sb.append(word.charAt(i));
                    sb.append(count);
                }else{
                    sb.append(ce);
                    sb.append(count++);
                }
                break;

            }else{
                if(word.charAt(i)==word.charAt(i+1)){
                    ce=word.charAt(i);
                    count++;
                }else{
                    sb.append(ce);
                    sb.append(count);
                    ce=word.charAt(i+1);
                    count=1;
                }

            }

        }




        if(sb.toString().length()<word.length()){
            return sb.toString();
        }else{
            return word;
        }

    }
}
