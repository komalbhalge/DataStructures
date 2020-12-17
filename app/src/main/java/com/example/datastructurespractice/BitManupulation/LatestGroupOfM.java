package com.example.datastructurespractice.BitManupulation;

public class LatestGroupOfM {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1,2,4};
        System.out.println(findLatestStep(arr,1));
    }

    public static int findLatestStep(int[] arr, int m) {
        for(int i =0; i<arr.length; i++){
            if(convertBinary(arr[i], m)) return i+1;
        }
        return -1;
    }
    private static boolean convertBinary(int num, int m){
        int index = 0;
        int count =0;

        while(num > 0){
            int curr = num%2;
            if(curr==1){
                count++;
            }else if(curr == 0 && count ==m){
                return true;
            }
            System.out.println( "Curr: "+curr +" c: "+count );

            num = num/2;
        }

        return false;
    }
}
