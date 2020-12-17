package com.example.datastructurespractice.Strings;

public class IntegerToString {
    public static void main(String[] args){
        System.out.println( "Int: "+myAtoi( " 42" ) );
    }
    public static int myAtoi(String str) {
        if (str.isEmpty()) return 0;
        int sign = 1, base = 0, i = 0;
        while (str.charAt(i) == ' ')
            i++;
        System.out.println( "i= "+i );
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;

        System.out.println( "sign= "+sign );
        System.out.println( "str.charAt(i)= "+str.charAt(i) );

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {

            System.out.println( "base= "+base );

            System.out.println( "Max/10= "+ Integer.MAX_VALUE / 10 );

            System.out.println( "-0= "+(str.charAt(i) - '0') );

            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}
