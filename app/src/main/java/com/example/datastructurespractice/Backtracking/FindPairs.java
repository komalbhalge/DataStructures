package com.example.datastructurespractice.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(findPairs( nums, 1 ));
    }

    public static int findPairs(int[] nums, int k) {
        int count = 0;
        backtrack(nums, k, count, new ArrayList<Integer>(  ));
        return count;
    }
    public static void backtrack(int[] nums, int target, int count, List<Integer> pair){
        List<Integer> p = new ArrayList<>( pair );
        if(p.size() == 2 && p.get(1)-p.get(0) == target){
            count++;
        }

        for(int i=0; i<nums.length; i++){
            if(pair.size() <2) pair.add(nums[i]);

            backtrack(nums,target, count, pair);
            pair.remove(pair.size() - 1);
        }
    }
}
