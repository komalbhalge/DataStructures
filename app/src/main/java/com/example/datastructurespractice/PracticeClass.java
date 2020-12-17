package com.example.datastructurespractice;

public class PracticeClass {
    public static void main(String[] args) {
        String k = "KomalBhalge";
        System.out.println(k.substring( 6 ));
        //System.out.println("Result: "+buddyStrings( "aaaaaaabc", "aaaaaaacb" ));
    }
    public static boolean buddyStrings(String A, String B) {
        if(A == null || A == "") return false;

        for(int i =1; i<A.length(); i++){
            if(A.charAt(i) ==A.charAt(i-1)) continue;
            if(swappedWord(i, A, B)) return true;
        }
        return false;
    }
    public static boolean swappedWord(int start, String A, String B){
        System.out.println(start);
        StringBuilder sb = new StringBuilder(A);
        if(A.length() == 2){
            char temp = A.charAt(0);
            sb.setCharAt(0, A.charAt(1));
            sb.setCharAt(1, temp);
            if(sb.toString() == B) return true;
        }
        for(int i =start; i <A.length()-1; i++){
            char temp = A.charAt(i);
            sb.setCharAt(i, A.charAt(i+1));
            sb.setCharAt(i+1, temp);
            if(sb.toString() == B) return true;
        }
        return false;
    }
}
