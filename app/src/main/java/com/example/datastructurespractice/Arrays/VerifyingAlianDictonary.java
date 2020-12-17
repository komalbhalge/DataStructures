package com.example.datastructurespractice.Arrays;

import java.util.Arrays;

public class VerifyingAlianDictonary {

    public static void main(String[] args){
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz" ;

        System.out.println( "Output: "+isAlienSorted( words, order ) );
    }

   static int[] mapping = new int[26];

    public static boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<order.length(); i++) {
            System.out.println(order.charAt( i )-'a');
                    mapping[order.charAt( i ) - 'a'] = i;
        }

        System.out.println("mapping: "+  Arrays.toString(mapping ));

        for(int i = 1; i<words.length; i++)
            if(compare(words[i-1], words[i]))
                return false;
        return true;
    }

    public static boolean compare(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        for(int i= 0; i<m && i<n; i++){
            if(s1.charAt(i) != s2.charAt(i))
                return mapping[s1.charAt(i)-'a']> mapping[s2.charAt(i)-'a'];
        }

        return m>n;
    }
}
