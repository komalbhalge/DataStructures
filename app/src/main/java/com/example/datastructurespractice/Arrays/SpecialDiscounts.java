package com.example.datastructurespractice.Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SpecialDiscounts {
    public static void main(String[] args){
String[] input = {"eat"};
        int[] prices = {2,3,4,5} ;
        int fee = 2;


        System.out.println( "Profit: "+ groupAnagrams( input ) );
    }
    public static int[] finalPrices(int[] prices) {

        if(prices.length==1){
            return prices;
        }
        int[] res = new int[prices.length];

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {

            while (!st.isEmpty() && prices[i] <= prices[st.peek()]) {
                res[st.pop()] -= prices[i];
            }
            res[i] = prices[i];
            st.push(i);
        }
        return res;
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Map<Integer, Integer> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect( Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

         int removedCount=0;
        for(Iterator<Map.Entry<Integer, Integer>> it = result.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println( entry.getKey()+"-"+entry.getValue() );
            if(removedCount<k){
                System.out.println(removedCount);
                if(entry.getValue()==1){
                    it.remove();
                }

                removedCount++;
            }else{
                break;
            }

        }


        return result.size();

    }
    public static int[] products(int[] arr){
        if(arr ==null || arr.length==0 || arr.length==1) return new int[0];

        int[] dpLeft = new int[arr.length];
        int[] dpRight = new int[arr.length];


        int[] result= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(i==0){
                dpLeft[i]= 1;
            }else{
                dpLeft[i]=arr[i-1]*dpLeft[i-1];
            }
        }
        for(int i=arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                dpRight[i]=1;
            }else{
                dpRight[i]=arr[i+1]*dpRight[i+1];
            }
        }

        for(int i=0; i<arr.length; i++){
            result[i]=dpLeft[i]*dpRight[i];
        }

        return result;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()){
                ca[c - 'a']++;
                System.out.println("Key: "+(c - 'a'));
            }
            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
