package com.example.datastructurespractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] strs){
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();


        Scanner s = new Scanner(scan.nextLine());
        int length = s.nextInt();
        int rotations = s.nextInt();

        int[] arr = new int[length];
        Scanner arrScan = new Scanner(scan.nextLine());

        for(int i =0; i<length; i++){
            if(arrScan.hasNextInt()){
                arr[i]= arrScan.nextInt();
            }else{
                System.out.println("you did not provide enough numbers!");
                break;
            }
        }
        monkRtation(arr,rotations);
        System.out.println( "ARRAY: "+ Arrays.toString( arr ) );
    }



    private static void monkRtation(int[] arr, int rotation){
        rotation %=arr.length;
        System.out.println( "K: "+rotation );

        swapTwoPositions(arr, 0, arr.length-1);
        swapTwoPositions(arr, 0, rotation-1);
        swapTwoPositions(arr,  rotation, arr.length - 1);


    }

    private static void swapTwoPositions(int[] arr, int start, int end){
        while(start<end) {
            int last = arr[end];
            arr[end] = arr[start];
            arr[start] = last;
            start++;
            end--;
        }
    }
    public static int[] printArray(){
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();


        Scanner s = new Scanner(scan.nextLine());
        int length = s.nextInt();
        int rotations = s.nextInt();

        int[] arr = new int[length];
        Scanner arrScan = new Scanner(scan.nextLine());

        for(int i =0; i<length; i++){
            if(arrScan.hasNextInt()){
                arr[i]= arrScan.nextInt();
            }else{
                System.out.println("you did not provide enough numbers!");
                break;
            }
        }
        return arr;
    }
}
