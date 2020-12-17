package com.example.datastructurespractice.Arrays;

import java.util.Stack;

public class LargestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length ==0) return 0;
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(0);
        for(int i = 1; i< heights.length; i++){
            int cur = heights[i];
            if(cur >= heights[stack.peek()]){
                stack.add(i);
            }else{
                while(!stack.isEmpty() && cur < heights[stack.peek()]){
                    int top = stack.pop();
                    if(stack.isEmpty()){
                        max = Math.max(max, heights[top]*i);
                    }else{
                        max = Math.max(max, heights[top]* (i-stack.peek()-1));
                    }
                }
                stack.add(i);
            }
        }
        if(!stack.isEmpty()){
            int i = stack.pop();
            while(!stack.isEmpty()){
                int top = stack.pop();
                if(stack.isEmpty()){
                    max = Math.max(max, heights[top]*i);
                }else{
                    max = Math.max(max, heights[top]* (i-stack.peek()-1));
                }
            }
        }
        return max;
    }


}
