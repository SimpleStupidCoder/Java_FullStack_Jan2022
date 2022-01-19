package com.javaacademy;

public class Class03Loops {
    public static void main(String[] args) {

        //for loop (initialization;condition;increment/decrement)
        System.out.print("for loop example: ");
        for(int i=3;i<=30;i=i+3){
            System.out.print(i+"\t");
        }

        System.out.print("\nfor loop example (reverse): ");
        for(int i=30;i>0;i=i-3){
            System.out.print(i+"\t");
        }

        //while loop
        int i=3;
        System.out.print("\nwhile loop example: ");
        while(i<=30){
            System.out.print(i+"\t");
            i=i+3;
        }
    }
}
