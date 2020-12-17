package com.example.datastructurespractice.Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args){
        int[] input = new int[]{0,1,0,3,12};
String s="KomalRonak";
String s2 ="OM";
       // moveZeroes(  );
System.out.println( 5/2);
    }
    public static void moveZeroes(int[] nums) {

        int currPose = 0;

        for (int num : nums) {
            System.out.println( "Num: " + num + " curr: " + currPose );
            if (num != 0) nums[currPose++] = num;
            System.out.println( "output: " + Arrays.toString( nums ) );
        }
        while (currPose < nums.length) {
            ;
            System.out.println( "nums[currPose]: " + currPose );
            nums[currPose++] = 0;
        }
        System.out.println( "output: " + Arrays.toString( nums ) );
    }

}
