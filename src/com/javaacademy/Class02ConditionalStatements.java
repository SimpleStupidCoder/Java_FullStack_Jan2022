package com.javaacademy;

public class Class02ConditionalStatements {
    public static void main(String[] args) {
        //if, else; switch-case
        int age=168;

        //if-else block
        if(age<10){
            System.out.println("Too young to apply");
        }else{
            System.out.println("*** Eligible for Loan ***");
        }

        //if-else-if ladder block
        double interestPercentage=0.0;
        if(age<10){
            System.out.println("Too young to apply");
        }else if(age<18){
            interestPercentage=7.5;
        }else if(age<32){
            interestPercentage=8;
        }else if(age<64){
            interestPercentage=9.5;
        }else{
            System.out.println("Too old to apply");
        }

        if(interestPercentage>0.0){
            System.out.println("you have to pay an interest of "+interestPercentage + " %");
        }


        char membershipType='C';
        double discount=0;
        //switch-case
        switch (membershipType){
            case 'A':
                discount=10.0;
                System.out.println("Discount: "+discount);
            case 'B':
                discount=9.0;
                System.out.println("Discount: "+discount);
            default:
                discount=5.0;
                System.out.println("Discount: "+discount);
        }
    }
}
