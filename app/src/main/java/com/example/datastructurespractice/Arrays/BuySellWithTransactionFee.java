package com.example.datastructurespractice.Arrays;

public class BuySellWithTransactionFee {

    public static void main(String[] args){
       int[] prices = {1, 3, 2, 8, 4, 9} ;
        int fee = 2;

        System.out.println( "Profit: "+maxProfit( prices, fee ) );
    }

    public static int maxProfit(int[] prices, int fee) {
        int buy =Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int profit = 0;

        for(int i =0; i<prices.length-1; i++){

            System.out.println("Buy: "+buy);

            if(prices[i]<buy) buy = prices[i];

            if(prices[i+1]<=prices[i] && sell<prices[i]){
                sell=prices[i];
                System.out.println("Sell: "+sell);
                profit+=(sell-buy)-fee;
                buy =0;
                sell = Integer.MIN_VALUE;
                System.out.println("P: "+profit);
            }
        }

        return profit;
    }
}
