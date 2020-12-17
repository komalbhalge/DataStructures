package com.example.datastructurespractice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstBadVersion {
    public static void main(String[] args){

        //System.out.println( "MaxArea: "+ maxArea( input ));
       int[] nums=new int[]{2,3,5,1,3};


        System.out.println( "firstBadVersion: "+ kidsWithCandies(nums, 3));
    }
//    2126753390
//            1702766719
static int bad=2;
   static boolean isBadVersion(int version) {
       System.out.println( "version: "+version );
        if(version>=bad)
            return true;
        return false;
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion( mid )) {
                start = mid;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
    public static boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()) return false;
        int prev = 0;
        for(int i = 0; i < s.length();i++)
        {
            char tempChar = s.charAt(i);
            System.out.println( "tempChar: "+tempChar );
            prev = t.indexOf('k',prev);
            System.out.println( "prev: "+prev );
            if(prev == -1) return false;
            prev++;
        }

        return true;
    }

    //Input: J = "aA", S = "aAAbbbb"
    public static int numJewelsInStones(String J, String S) {
       int result=0;
int prev= 0;
       for(int i =0; i<S.length(); i++){
          prev=J.indexOf( S.charAt( i ), prev ) ;
           System.out.println("s: "+ S.charAt( i )+" -prev: "+prev );
    if(prev >=0){
        result++;
    }
           //prev++;
       }
       return result;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result =new ArrayList<>();
        int[] temp = candies;
        Arrays.sort(temp);

        for(int i =0; i<candies.length; i++){
            System.out.println("s: "+candies[i]);
            int num=candies[i]+extraCandies;
            System.out.println("c: "+num);
            if(num >=temp[temp.length-1]){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

}
