package com.example.datastructurespractice.Strings;

import java.util.PriorityQueue;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        //Input: S = "ADOBECODEBANC", T = "ABC"
        System.out.println(minimumWindow("ADOBECODEBANC","ABC"));
    }

    public static String minimumWindow(String s, String t){
        int[] map = new int[128];
        for(char c : t.toCharArray()) map[c]++;
PriorityQueue<Integer> q = new PriorityQueue<>();


        int start = 0, end =0, minStart =0, minLength = Integer.MAX_VALUE, targetCount = t.length();
        while(end < s.length()){
            final char ch = s.charAt(end);
            System.out.println("End: "+end +" c1:"+map[ch]);
            if(map[ch] > 0)targetCount --;
            map[ch]--;
            end++;

            while(targetCount == 0){
                System.out.println("minLength: "+minLength);
                if(minLength > end -start){
                    minLength = end - start;
                    minStart =start;
                }
                final char c2 = s.charAt( start );

                System.out.println("c2: "+c2+": "+map[c2]);
                map[c2]++;
                if(map[c2] >0) targetCount++;
                start++;
            }
        }
        return (minLength == Integer.MAX_VALUE ? "" : s.substring( minStart, minStart +minLength ));
    }
}
