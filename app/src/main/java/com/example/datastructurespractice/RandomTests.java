package com.example.datastructurespractice;

public class RandomTests {
    public static void main(String[] args) {
int[] n= {1, 2, 3, 4, 5, 6, 7,8 ,9, 1, 2, 3};
        System.out.println("N: "+permute(n));
    }
    public static int testChar(char c){
        int num =0;
        c+='k';
        System.out.println( c+'k');
        return   num * 10 + c - '0';
    }

    public static String permute(int[] nums){
        int n = nums.length;
        int i =n - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j =n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);

        }
        reverse(nums, i+1);
        StringBuilder sb  = new StringBuilder();
        for(int c: nums){
            sb= sb.append(c);
        }
        return sb.toString();
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public static void reverse(int[] nums,int start){
        int left =start;
        int right = nums.length-1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
