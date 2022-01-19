package com.javaacademy.model;

public class Class05Rectangle {
    public int length;
    public int breadth;
    public static String type;

    public static String getType(){
        return type.toUpperCase();
    }

    static{
        type="Rectangle";
        System.out.println("object type is: "+type);
    }

    //constructor overloading
    public Class05Rectangle(int length){
        this.length=length;
    }

    public Class05Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //static polymorphism - method overloading
    public int getArea(int length){
        System.out.print("Area of the square is: ");
        return length*length;
    }

    public int getArea(int length, int breadth){
        System.out.print("Area of the rectangle is: ");
        return length*breadth;
    }

}
