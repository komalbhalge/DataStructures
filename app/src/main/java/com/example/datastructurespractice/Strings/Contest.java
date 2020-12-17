package com.example.datastructurespractice.Strings;

import java.util.HashSet;

public class Contest {
    public static void main(String[] args){

        //System.out.println( "MaxArea: "+ maxArea( input ));
        int[] nums=new int[]{2,3,5,1,3};

        String a= "komalk";
        String b=  "malkoaab";

        System.out.println( "firstBadVersion: "+ canConstruct(a, b));
    }
    public static boolean checkIfCanBreak22(String s1, String s2) {
//        Arrays.sort(s1.toCharArray());
//        Arrays.sort(s2.toCharArray());
        for(int i=0; i<s1.length();i++){
            int prev =s2.indexOf( s1.charAt( i ) );
            if(prev>0){
               return true;
            }
            System.out.println( "str: "+prev );
        }
        return false;
    }
    public static boolean checkIfCanBreak(String s1, String s2) {
        HashSet<String> str1= new HashSet<>();

        HashSet<String> str2 = new HashSet<>();

        return (getAllPermutaions( s1,s2,"" ) || getAllPermutaions( s2,s1,""));

    }
    public static boolean getAllPermutaions(String s1,String s2,  String ans){

        if(s1.length()==0){
            for(int i=0; i<ans.length();i++){
                if(s2.charAt( i )>=ans.charAt( i )){
                    return true;
                }
            }
            //str1.add(ans);
        }
        for(int i = 0; i<s1.length(); i++){
            char ch= s1.charAt(i);

            String word = s1.substring(0, i)+s1.substring(i+1);

            getAllPermutaions(word, s2,ans+ch);
        }

    return false;
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()<1 ) return true;


        boolean result =false;

        for(char ch: magazine.toCharArray()){
           System.out.println( "CH: "+magazine.indexOf( ch ) );
        }


        return result;
    }
}
