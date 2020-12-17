package com.example.datastructurespractice.Matrix;

public class SpecialNumber {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1,0,0},
                {0,1,0},
                {0,0,1}};
        System.out.println( "isSpecial: "+ numSpecial( mat ));
    }
    public static int numSpecial(int[][] mat) {
        if(mat==null || mat.length==0) return 0;
        int count=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    if(isSpecial(mat, i, j)) count++;
                }

            }
        }
        return count;
    }
    public static boolean isSpecial(int[][] mat, int row, int col){

        int x=0, y=0;
        int n= row; int m=col;
        n++;
        while(n<mat.length){
            if(mat[n++][m]==1){x=1;
            break;}
        }
        n=row;n--;
        while(n>=0){
            if(mat[n--][m]==1){x=1;
                break;}
        }

        n=row;  m++;
        while( m<mat[0].length){
            if(mat[n][m++]==1) {y=1;
            break;}
        }

        m=col;  m--;
        while(m>=0){
            if(mat[n][m--]==1) {y=1;
                break;}
        }
        return x==0 && y==0;
    }

}
