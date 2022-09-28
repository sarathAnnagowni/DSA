package com.search;

public class ButStockSellProblem {
    public static void main(String args[]){
        int[] stock={7,1,5,3,6,4};
        int maxProfit=maxProfit(stock);
        System.out.println(maxProfit);
    }

    private static int maxProfit(int[] stock) {
        int maxProfit=0;

        for(int i=1;i<stock.length;i++){
            if(stock[i]>stock[i-1]){
                maxProfit=maxProfit+(stock[i]-stock[i-1]);
            }
        }

        return maxProfit;
    }
}
