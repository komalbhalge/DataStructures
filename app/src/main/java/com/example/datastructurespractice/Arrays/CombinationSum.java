package com.example.datastructurespractice.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public static void main(String[] args) {
        // [2,3,6,7], target = 7
        int[] arr = {2, 3, 6, 7};
        div(arr, 7);
    }
    public static List<List<Integer>> div(int[] arr, int target){
        List<List<Integer>> list = new ArrayList<>(  );
        if(arr==null || arr.length ==0) return list;

        Set<Integer> set = new HashSet<>();

        for(int i: arr)  set.add( i );

        List<Integer> subList = new ArrayList<>(  );
        int rem =arr[0];
        for(int i : arr){
            if(i==target) subList.add( i );
            rem = target - rem;
            if(set.contains( rem )){
                subList.add( i );
                subList.add( target-i );
            }else{
                set.add( i );
            }
        }
        return list;
    }

    public static List<Integer> helper(int[] arr, int target, int rem, Set<Integer> set, int sum,List<Integer> subList){
if(sum == target) return subList;
if(rem == 0) return subList;

        for(int i : arr){
            if(i==target) {
                subList.add( i );
                return subList;
            }
            if(set.contains( rem )){
                subList.add( i );
                subList.add( target-i );
            }else{
                set.add( i );
            }
        }
        return subList;
    }
}
