package com.javaacademy.model;

import com.javaacademy.model.interfaces.Class06IPerson;

public class Class08PersonImpl implements Class06IPerson.Message {

    private int id;
    private String name;
    private int age;
    private static String PRIMARY="PRIMARY";

    public Class08PersonImpl(int id, String name){
        this.id=id;
        this.name=name;
    }


    @Override
    public void printMessage() {
        System.out.println("An example");
    }

    public void printAddressDetails(String city, String country){
        Class08Address obj=new Class08Address(city, country);
        obj.printAddress();
    }

    public void printContactDetails(){
        Class08Contact.printDetails(this.name);
    }

    class Class08Address {
        private String city;
        private String Country;

        Class08Address(String city, String country){
            this.city=city;
            this.Country=country;
        }

        void printAddress(){
            System.out.println("Person " +name+" belongs to "+city+","+Country);
        }
    }

    static class Class08Contact{
        static String phoneNumber="123456";
        static void printDetails(String name){
            System.out.println("Person "+name+" can be contacted via "+phoneNumber+"("+PRIMARY+")");
        }
    }

}
