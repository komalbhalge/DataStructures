package com.example.datastructurespractice.Strings;

public class LongestPalindrom {

    public static void main(String[] args){
        System.out.println( "Int: "+palindrome( "komok9" ) );
    }
    public static boolean palindrome(String s1) {
      //char[] sp=  s1.split( " ", 2 );
        int n = s1.length() - 1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt( i ) != s1.charAt( n - i )) {
                return false;
            }

        }
        return true;
    }
}
