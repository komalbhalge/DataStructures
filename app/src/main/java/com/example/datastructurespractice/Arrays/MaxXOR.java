package com.example.datastructurespractice.Arrays;

public class MaxXOR {
    public static void main(String[] args) {
        int[] input= new int[]{3, 10, 5, 25, 2, 8};
        findMaximumXOR(input);
    }

    public static int findMaximumXOR(int[] nums) {
        int max= 0;
        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++ ){
                //System.out.println("XOR of: "+nums[i]+":"+nums[j]+"="+xOR(nums[i], nums[j]));
                max=Math.max(max, xOR( nums[i], nums[j] ));
            }
        }
        return 0;
    }

    private static int xOR(int x, int y) {
        return (x|y) &(~x|~y);
    }
}
