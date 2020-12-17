package com.example.datastructurespractice.Matrix;

public class PointsInLine {

    public static void main(String[] args){
        int[][] points =new int[][]{
                {-3,-2},
                {-1,-2},
                {2,-2},
                {-2,-2},
                {0,-2}};
        System.out.println( "Check IF:"+checkStraightLine(points) );
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2) return true;
        int x=Math.abs(coordinates[1][0]-coordinates[0][0]);
        int y=Math.abs(coordinates[1][1]-coordinates[0][1]);

        for(int i = 2; i<coordinates.length; i++){

            int x1=Math.abs(coordinates[i][0]-coordinates[0][0]);
            int y1=Math.abs(coordinates[i][1]-coordinates[0][1]);
            if(y/x !=y1/x1){
                return false;
            }

        }
        return true;

    }
}
