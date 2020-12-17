package com.example.datastructurespractice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class DissapearingNumbers {
    public static void main(String[] args){

        //System.out.println( "MaxArea: "+ maxArea( input ));
        int[] nums=new int[]{4,3,2,7,8,2,3,1};

        String a= "komalk";
        String b=  "malkoaab";

        System.out.println( "findDisappearedNumbers: "+ findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            System.out.println("val: "+val+" nums[val]: "+nums[val]);
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.println("nums[i]: "+nums[i]);
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}
