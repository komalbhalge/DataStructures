package com.example.datastructurespractice.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallerNumsThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101], presum = new int[101], ans = new int[nums.length];

        for(int num : nums) count[num]++;
        System.out.println("Count: "+Arrays.toString( count ));
        for(int i = 1; i <= 100; i++){
            System.out.println(presum[i-1] +" - " +count[i-1]);
            presum[i] = presum[i-1] + count[i-1];
            System.out.println("presum: "+presum[i]);
        }

        for(int i = 0; i < nums.length; i++) {ans[i] = presum[nums[i]];}

        return ans;
    }
    public static void main(String[] args){
        int[] arr = new int[]{8,1,2,2,3,4,5,6,7,1,1,1};
        List list = new ArrayList<>();


        list.add("ab");
        list.add( "wd" );
        Collections.sort( list );
        //int a[] = {1,2,3,4};

        //"app".get;
        System.out.println( "strawberries"+ Math.abs((2-1)*(1-2)));
    }
    
}
