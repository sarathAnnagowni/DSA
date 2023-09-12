package com.DP;

import java.util.ArrayList;
import java.util.HashMap;

public class FibonacciTest {
    public static void main(String[] s){
      /*  HashMap<Integer,Integer> map=new HashMap<>();
        //System.out.println(fibonacciTopDown(6,map));
        System.out.println(fibonacciBottomUp(6));*/
        String url="http://10.128.14.120:8143/nghp-content-reference-ui/autocomplete.jsp";
        System.out.println(url.split("://")[1].split("/")[0]);
    }

    public static int fibonacciTopDown(int n, HashMap<Integer,Integer> map){
        if(n<0){
            return -1;
        }else if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        if(!map.containsKey(n))
            map.put(n, fibonacciTopDown(n-1,map)+ fibonacciTopDown(n-2,map));
        return map.get(n);
    }
    public static int fibonacciBottomUp(int n){
        ArrayList<Integer> table=new ArrayList<>();
        table.add(0);
        table.add(1);
        for(int i=2;i<n+1;i++){
            int n1=table.get(i-1);
            int n2=table.get(i-2);
            table.add(n1+n2);
        }

        return table.get(n-1);

    }
}
