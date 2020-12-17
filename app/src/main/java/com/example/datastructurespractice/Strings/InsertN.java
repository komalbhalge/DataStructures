package com.example.datastructurespractice.Strings;

public class InsertN {
    public static void main(String[] args) {
        System.out.println("N: "+102%10);
    }
    private static int insert(int N){
        if(N>0){
            String num = String.valueOf( N );
            for(int i=0; i<num.length(); i++){
                if(num.charAt( i )<='5'){
                    return Integer.valueOf( num.substring( 0,i )+"5"+num.substring( i ) );
                }
            }
        }else if(N<0){
            String num=String.valueOf( N );
            for(int i=0; i<num.length(); i++){
                if(num.charAt( i )>='5'){
                    return Integer.valueOf( num.substring( 0,i )+"5"+num.substring( i ) );
                }
            }
            num =num+"5";
            return Integer.valueOf( num );
        }else if(N==0){
            return Integer.valueOf( "5"+N );
        }
        return -1;
    }
    private static int insertTwo(int num){
        boolean isNegative = num < 0;
        String resStr = "";
        if(!isNegative){
            String temp = String.valueOf(num);
            for(int i = 0;i<temp.length();i++){
                int n = Integer.parseInt(String.valueOf(temp.charAt(i)));
                if(5 > n){
                    resStr = temp.substring(0,i)+"5"+ temp.substring(i);
                    break;
                }
            }
            if(resStr.length() == 0){
                resStr += "5";
            }
        }else{
            String temp = String.valueOf(num*-1);
            for(int i = 0;i<temp.length();i++){
                int n = Integer.parseInt(String.valueOf(temp.charAt(i)));
                if(5 < n){
                    resStr = temp.substring(0,i)+"5"+ temp.substring(i);
                    break;
                }
            }

        }
        System.out.println("str: "+resStr);
        return isNegative == true? Integer.parseInt(resStr)*-1: Integer.parseInt(resStr);
    }
}
