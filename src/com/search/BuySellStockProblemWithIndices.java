package com.search;

public class BuySellStockProblemWithIndices {
    public static void main(String args[]){
        int[] stocks={6,4,3,1,2,5,9};
        maxProfitDays(stocks);

    }
    public static void maxProfitDays(int[] stocks){
        int buy=0;
        int sell=0;
        int currMin=0;
        int maxProfit=0;
        int currProfit=0;
        for(int i=0;i<stocks.length;i++){
            if(stocks[i]<stocks[currMin]){
                currMin=i;
            }
            currProfit=stocks[i]-stocks[currMin];
            if(currProfit>maxProfit){
                buy=currMin;
                sell=i;
                maxProfit=currProfit;
            }
        }

        System.out.println("buy at "+ (buy+1)+ "day");
        System.out.println("sell at "+ (sell+1)+ "day");
        System.out.println("Maximum Profit "+ maxProfit );

    }
}
