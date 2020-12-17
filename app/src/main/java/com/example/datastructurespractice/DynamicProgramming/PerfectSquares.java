package com.example.datastructurespractice.DynamicProgramming;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 13;
        int[] arr= {67, 77, 51, 103, 51, 48, 1009};
        String s="kom";
        System.out.println(outliner( arr ));
        StringBuilder sb = new StringBuilder( s );
        System.out.println(removeDups("abbaca"));

    }

    public static String removeDups(String S){
        String out="";
        for(int i= 1; i<S.length(); i++){
            if(S.charAt(i-1) ==S.charAt(i)){
               out= removeDups(S.substring( 0,i-1 )+S.substring( i+1 ));
            }else{
                continue;
            }
        }
        return out;
    }
public static int outliner(int[] arr){
        int evenNums  =0, oddNums=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0 && oddNums>1){
               return  arr[i];
            }else if(arr[i]%2>0 && evenNums>1){
                return  arr[i];
            }else if(arr[i]%2>0){
                oddNums++;
            }else {
                evenNums++;
            }
        }
        return 0;
}
    public static int perfectSquares(int n) {

//        int[] dp = new int[n+1];
//        Arrays.fill(dp, Integer.MAX_VALUE);
//        dp[0]=0;
//        for(int i=1; i<=n; i++){
//            int j=1;
//            int min = Integer.MAX_VALUE;
//            while(i-j*j>=0){
//                min=Math.min(min, dp[i-j*j]+1);
//            }
//            dp[i]=min;
//        }
//        return dp[n];
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; ++i) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j*j >= 0) {
                min = Math.min(min, dp[i - j*j] + 1);
                ++j;
            }
            dp[i] = min;
        }
        return dp[n];
    }


}