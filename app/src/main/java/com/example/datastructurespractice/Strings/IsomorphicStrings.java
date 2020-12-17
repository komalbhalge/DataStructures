package com.example.datastructurespractice.Strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = t.split( " " );
        int size = words.length;
        for(int i = 0;i < size; i++){
            System.out.println( "Values: "+ map.values() );
            if(map.containsKey(s.charAt(i))){
                //System.out.println(words[i] +" map? " +map.get(s.charAt(i)));
                if(words[i].compareTo(map.get(s.charAt(i)))!=0){
                    //System.out.println("i"+i +" return False");
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(s.charAt(i), words[i]);
            }
        }
        //System.out.println( "Values---: "+ map.values() );

        return true;
    }

    public static void main(String[] args){
        System.out.println( "isIsomorphic: " +isIsomorphic("abba","dog cat cat fish"));
    }
}
