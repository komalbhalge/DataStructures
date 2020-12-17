package com.example.datastructurespractice.Matrix;

import java.util.Arrays;

public class ManhattenDistance {
//[[3,12],[-2,5],[-4,1]]
//(Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]));

public static void main(String[] args) {

    int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
    System.out.println("D: "+minCostConnectPoints(points ));

    String s= " ";
    String[] words= s.split(" ");
    System.out.println("P: "+ Arrays.toString(   words)+words.length);
}

    public static int minCostConnectPoints(int[][] points) {
            //int[] dp = new int[points.length];
        int sDist=0;
        for(int i=1; i<points.length; i++){
            int dist =(Math.abs(points[i][0] - points[i][1]) + Math.abs(points[i-1][0] - points[i-1][1]));
            System.out.println("::"+dist);
            sDist= Math.min( sDist, dist );
        }
         return sDist;
    }
}
