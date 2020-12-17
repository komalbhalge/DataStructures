package com.example.datastructurespractice.Arrays;

public class MaxWaterArea {
    public static void main(String[] args){
        int[] input= new int[]{1,8,6,2,5,4,8,3,7};
        //System.out.println( "MaxArea: "+ maxArea( input ));
        System.out.println( "MaxArea: "+ ( -1*-9 ));
    }
    public static int maxArea(int[] height) {
        if(height == null || height.length < 2) return 0;
        int left = 0;
        int right = height.length-1;
        int ans = Integer.MIN_VALUE;
        while(left < right){
            System.out.print("a: "+height[left]);
            System.out.print(" b: "+height[right]*(right-left));
            System.out.println(" c: "+ (right-left));
                    ans = Math.max(ans, Math.min(height[left], height[right])*(right-left));
            if(height[left] < height[right]){
                left++;
            }else if(height[left] == height[right]){
                right--;
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }

}
