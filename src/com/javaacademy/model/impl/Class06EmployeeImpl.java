package com.javaacademy.model.impl;

public class Class06EmployeeImpl extends Class06PersonImpl{
    private String dept;
    private boolean isPermanent;
    public final String TYPE="EMPLOYEE";
    private String designation;

    public Class06EmployeeImpl(String id){
        this.setId(id);
    }

    public Class06EmployeeImpl(String id, String firstName, String lastName){
        this.setId(id);
        this.setLastName(lastName);
        this.setFirstName(firstName);
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public void printDetails() {
        System.out.print("\nEmployee[Id: " + this.getId());
        System.out.print("\tName: " + this.getName());
        System.out.print("\tDept: " + this.dept);
        System.out.print("\tPermanent: " + (this.isPermanent?"YES":"NO"));
        System.out.print("]");
    }

    public Class06PersonImpl getDetails(){
        return this;
    }
}
