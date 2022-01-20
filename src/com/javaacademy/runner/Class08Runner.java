package com.javaacademy.runner;

import com.javaacademy.model.Class08Constants;
import com.javaacademy.model.Class08PersonImpl;

public class Class08Runner {
    public static void main(String[] args) {
        Class08PersonImpl person1=new Class08PersonImpl(001, "Arjun");
        person1.printAddressDetails("Madhapur","Hyderabad");
        person1.printContactDetails();


        //String class
        int id=10;
        String firstName="Arjun";//5bits(approx)

        //immutable
        id=20;
        firstName="Vivek";//new 5bits(approx) will be consumed
        //name=new String("Vipin");
        String name2=new String("Vivek");

        //string comparison
        int id2=20;
        if(id==id2){//compare int variable
            //do the logic
        }
        System.out.print("\ncomparing object:");
        if(firstName==name2){//comparing the object, not their value
            System.out.print("Equal");
        }else{
            System.out.print("Not equal");
        }
        System.out.print("\ncomparing value:");
        if(firstName.equals(name2)){//equals is a method to compare the value
            System.out.print("Equal");
        }else{
            System.out.print("Not equal");
        }

        //String concatenation
        String lastName="Basu";
        String fullName;
        fullName=firstName+" "+lastName;
        fullName=firstName.concat(" ").concat(lastName);
        System.out.println("Name: "+fullName);
        //fullName="";

        String var="";
        for(int i=0;i<10;i++){
            var=""+i;//very careful
        }

        //substring
        String email=firstName.substring(0,3).concat(lastName.substring(0,3)).concat("@gmail.com");
        System.out.println("Email: "+email);

        //StringBuffer
        StringBuffer nameBf=new StringBuffer(firstName);
        nameBf.append(" ").append(lastName);
        System.out.println("Name BF:" + nameBf.toString());

        StringBuffer varBf=new StringBuffer("");
        for(int i=0;i<10;i++){
            varBf.append(i);//not creating new objects as SB is mutable
        }

        //StringBuilder
        StringBuilder nameBd=new StringBuilder("");
    }
}
