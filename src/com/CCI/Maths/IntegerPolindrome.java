package com.CCI.Maths;

import java.util.ArrayList;

public class IntegerPolindrome {
    public static void main(String[] args) {
       System.out.println(isPolindrome(34643));
    }

    public static boolean isPolindromeWithArray(int number){
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(number>0){
            int remainder = number % 10;
            arrayList.add(remainder);
            number=number / 10;
        }
        System.out.println(arrayList);

        for(int i =0 , j=arrayList.size()-1; i < arrayList.size() / 2; i++,j--){
            if(arrayList.get(i) != arrayList.get(j)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPolindrome(int number){
        if(number <= 0){
            return false;
        }
        int sum=0;
        int n=number;

        while(n>0){
            int r=n % 10;
            sum = sum * 10 + r;
            /*if(sum==number){
                return true;
            }*/
            n=n/10;
        }
        System.out.println(sum);


        return false;
    }

}
