package com.leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] r){
        System.out.println(romanToInt("MCD"));
    }

        public static int romanToInt(String s) {
            HashMap<Character, Integer> values = new HashMap<>();
            values.put('I', 1);
            values.put('V', 5);
            values.put('X', 10);
            values.put('L', 50);
            values.put('C', 100);
            values.put('D', 500);
            values.put('M', 1000);
            int sum = 0;
            int i = 0;
            while (i < s.length()) {
                if (i == s.length() - 1) {
                    sum = sum + values.get(s.charAt(i));
                    i++;
                } else if (values.get(s.charAt(i)) >= values.get(s.charAt(i + 1))) {
                    sum = sum + values.get(s.charAt(i));
                    i = i + 1;
                } else {
                    sum = sum + values.get(s.charAt(i + 1)) - values.get(s.charAt(i));
                    i = i + 2;
                }
            }
            return sum;

        }

}
