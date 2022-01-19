package com.javaacademy.model;

public class Class05Student extends Class04Person {
    private String stream;
    private String currentSem;
    private int currentYear;

    public Class05Student(String id, String firstName, String lastName){
        super(id,firstName);
        this.setLastName(lastName);
    }

    public void printDetails(String objName) {
        System.out.print("\n" + objName + ":- Employee[Id: " + this.getId());
        System.out.print("\tName: " + this.getName());
        System.out.print("\tStream: " + this.stream);
        System.out.print("\tCurrent Sem: " + this.currentSem);
        System.out.print("]");
    }
}
