package com.example.datastructurespractice.Arrays;

public class SubArraySumZero {
    public static void main(String[] args) {
        int[] arr =  {2,-3, 4};
        System.out.println("C: "+subarrayCount( arr ));
    }

    public static int subarrayCount(int[] A){
        int sum =0;
        int count=0;
        boolean areAllZeros=true;
        for(int i=0; i<A.length; i++){
            if(A[i] !=0) areAllZeros=false;
        }
        if(!areAllZeros){
            for(int i=0; i<A.length; i++){
                for(int j =i+1; j<A.length; j++){
                    sum=sum+A[i]+A[j];
                    if(A[i]==0 || A[j]==0 ||sum==0 )
                    {
                        if(count>1000000000){
                            return -1;
                        }
                        count++;

                        System.out.println("c"+count);
                    }
                }
            }
        }

        if(count>2){
            return count/2;
        }else{
           return count;
        }
    }
}
