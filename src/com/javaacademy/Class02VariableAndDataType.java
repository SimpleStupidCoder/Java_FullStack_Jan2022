package com.javaacademy;

public class Class02VariableAndDataType {
    public static void main(String[] args) {
        //strongly-typed language
        //int a;//'a' is the variable whose type is int

        //numeric
        byte a=10;
        System.out.println("byte: "+a);

        short b=240;
        System.out.println("short: "+b);
        b=(short)(a*a);
        System.out.println("short: "+b);

        int c=-112112;
        System.out.println("int: "+c);

        long d=999999999l;

        double e = 10/3.0;
        int ans = (int)e;
        System.out.println("double: "+e);
        System.out.println("ans: "+ans);

        //character
        char ch='a';
        ch++;
        ch=94;//ASCII table
        System.out.println("char: "+ch);

        //boolean
        boolean bool;//declaration
        bool=true;//initialization
        boolean bool1=true;//declaration+initialization
        System.out.println("bool: "+bool);

    }
}
