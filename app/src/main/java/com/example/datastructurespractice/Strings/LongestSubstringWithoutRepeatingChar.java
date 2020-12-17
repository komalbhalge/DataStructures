package com.example.datastructurespractice.Strings;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] strs){
        //System.out.println("Output:"+longestSubstringWithoutRepeatingChar("abcabcd")  );

        System.out.println(""+getHint("1807111", "2359233")  );
    }

    public static int longestSubstringWithoutRepeatingChar(String s){
        if(s==null) return 0;

        int l = s.length();

        int result =0;
        int[] chars = new int[256];
        for(int i=0, j=0; i<l; i++){
            System.out.println( s.charAt( i )-'0' );
            j= (chars[s.charAt( i )] >j ? Math.max( j, s.charAt( i ) ): j);
            chars[s.charAt(i  )] = i+1;

            result= Math.max(result, i-j+1);
        }
        return result;
    }
    public static String getHint(String secret, String guess) {
    int bulls=0;
    int cows=0;
       int[] nums = new int[10];
       for(int i=0; i<guess.length(); i++){
           System.out.println("N: "+ secret.charAt( i ));
            if(guess.charAt( i ) ==secret.charAt( i )){
             bulls++;
            }else{
                System.out.println( secret.charAt( i )-'0' );
                if(nums[secret.charAt( i )-'0']++ <0) cows++;
                if(nums[guess.charAt( i )-'0']-->0)  cows++;

                System.out.println( Arrays.toString(nums  ) );

            }

        }
        return bulls+"A"+cows+"B";
    }
}
