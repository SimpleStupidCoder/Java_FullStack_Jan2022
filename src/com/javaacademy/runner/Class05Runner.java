package com.javaacademy.runner;

import com.javaacademy.model.Class05Rectangle;
import com.javaacademy.model.Class04Person;
import com.javaacademy.model.Class05Employee;

public class Class05Runner {
    public static void main(String[] args) {
        System.out.println(Class05Rectangle.type);
        System.out.println(Class05Rectangle.getType());

        Class05Rectangle sq1 = new Class05Rectangle(10);
        System.out.print(sq1.getArea(sq1.length) + "\n");

        Class05Rectangle rec1 = new Class05Rectangle(30, 20);
        System.out.print(rec1.getArea(rec1.length, rec1.breadth) + "\n");

        Class05Employee emp1=new Class05Employee("001","Arjun","Kiran","Physics");
        emp1.setPermanent(true);
        emp1.printDetails("Emp1");

        Class05Employee emp2=new Class05Employee("002","Shiva","Kiran","Maths");
        emp2.printDetails("Emp2");

        Class04Person emp3=new Class05Employee("003","Shiva", "Kiran","Eng");
        emp3.printDetails("Emp3");

    }
}
