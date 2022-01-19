package com.javaacademy.model;

public class Class06Professor extends Class05Employee {
    private String level;

    public Class06Professor(String id, String firstName, String lastName, String dept, String level){
        super(id, firstName, lastName, dept);
        super.setDesignation("Professor");
        this.setPermanent(true);
        this.level=level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    //run-time polymorphism, method over-ridding
    public void printDetails(String objName) {
        System.out.print("\n" + objName + ":- Professor[Id: " + this.getId());
        System.out.print("\tName: " + this.getName());
        System.out.print("\tDept: " + this.getDept());
        System.out.print("\tPermanent: " + (this.isPermanent()?"YES":"NO"));
        System.out.print("]");
    }
}
