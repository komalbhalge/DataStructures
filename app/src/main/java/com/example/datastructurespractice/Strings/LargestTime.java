package com.example.datastructurespractice.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LargestTime {
    public static void main(String[] strs){
        int[] arr = new int[]{2,1, 1,3,5, 9, 15};
        List list= new ArrayList(  );
        System.out.println(nSmallest( arr ,7));
    }
public static int nSmallest(int[] input, int n){
        if(input==null || input.length==0 || n> input.length) return 0;

        int min = Integer.MAX_VALUE;
        int result=0;
        TreeSet<Integer> set = new TreeSet<>();

    for(int i =0; i<input.length; i++){
        min = Math.min( min,input[i] );
        set.add( input[i] );
    }
    result= min;
    for(int j=1; j<n;j++){
        if(set.ceiling(result+1 )!=null)
        result= set.ceiling(result+1 );
    }
    System.out.println( "HasSet: "+set.headSet( 9 ) );
       return result;
}
    public static String largestTimeFromDigits(int[] A) {
        Set<Integer> set  = new HashSet<>(  );
        int index =-1;

        int h1=-1, h2=-1,m1=-1,m2 =-1;

        for(int i =0; i< A.length; i++){
            if(A[i] <=2) {
                if(A[i]>h1){
                    index = i;
                    h1=A[i];
                }
            }
        }
        if(h1==-1) return "";
        System.out.println( "i1: "+index );
        set.add( index );
        index =- 1;

        for(int i =0; i< A.length; i++){
            if(h1+A[i] <6 && !set.contains( i )) {
                if(A[i]>h2) {
                    index = i;
                    h2 = A[i];
                }
            }
        }
        if(h2==-1) return "";
        set.add( index );
        System.out.println( "i2: "+index );
        index =- 1;

        for(int i =0; i< A.length; i++){
            if(A[i] <=5 && !set.contains( i )) {
                if(A[i]>m1){
                    index = i;
                    m1=A[i];
                }
            }
        }
        if(h1==-1) return "";
        set.add( index );
        System.out.println( "i3: "+index );
        index =- 1;

        for(int i =0; i< A.length; i++){
            if(!set.contains(i))
                m2 = A[i];
        }
        return h1+""+h2+":"+m1+""+m2;
    }
}
