package com.javaacademy.model;

//subclass/child-class of Person
public class Class05Employee extends Class04Person {
    private String dept;
    private boolean isPermanent;
    private String designation;

    public Class05Employee(String id, String firstName, String lastName, String dept){
        super(id, firstName);
        this.setLastName(lastName);
        this.dept=dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }

    public String getDesignation(){
        return this.designation;
    }

    //run-time polymorphism, method over-ridding
    public void printDetails(String objName) {
        System.out.print("\n" + objName + ":- Employee[Id: " + this.getId());
        System.out.print("\tName: " + this.getName());
        System.out.print("\tDept: " + this.dept);
        System.out.print("\tPermanent: " + (this.isPermanent?"YES":"NO"));
        System.out.print("]");
    }

}
