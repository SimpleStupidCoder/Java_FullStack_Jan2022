package com.javaacademy.runner;

import com.javaacademy.model.Class04Person;

public class Class04Runner {
    public static void main(String[] args) {
        Class04Person ravi = new Class04Person("001","Ravi");
        ravi.setLastName("Deverakonda");
        ravi.printDetails("Ravi");

        Class04Person arjun = new Class04Person("002");
        arjun.setLastName("Arjun");
        arjun.printDetails("Arjun");

        Class04Person arjunCopy1 = arjun;//both variable are referring to same object
        arjun.setFirstName("Allu");
        arjunCopy1.printDetails("ArjunCopy1");

        Class04Person arjunCopy2 = new Class04Person(arjun.getId(),arjun.getFirstName());
        arjunCopy2.setLastName(arjun.getLastName());
        arjunCopy2.printDetails("ArjunCopy2");

        System.out.print("\nIs Arjun same as ArjunCopy1? "+arjun.comparePeron(arjunCopy1));
        System.out.print("\nIs Arjun same as ArjunCopy2? "+arjun.comparePeron(arjunCopy2));

        arjun.setLastName("Akash");
        //arjunCopy2.id="003";
        arjun.printDetails("Arjun");
        arjunCopy1.printDetails("ArjunCopy1");
        arjunCopy2.printDetails("ArjunCopy2");

        System.out.print("\nIs Arjun same as ArjunCopy1? "+arjun.comparePeron(arjunCopy1));
        System.out.print("\nIs Arjun same as ArjunCopy2? "+arjun.comparePeron(arjunCopy2));
    }
}
