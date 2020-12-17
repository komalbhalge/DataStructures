package com.example.datastructurespractice.Arrays;

import java.util.Arrays;

public class MaxCoins {
    public static int maxCoins(int[] piles) {
        if( piles==null || piles.length <=1) return 0;

        //Collections.sort(Arrays.asList( piles ), Collections.reverseOrder());
        int myShare = 0;
        System.out.println( Arrays.toString(piles));
        for(int i =1; i<piles.length; i=i+3){
            myShare+=piles[i];
        }
        return myShare;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(arr));
    }
}
