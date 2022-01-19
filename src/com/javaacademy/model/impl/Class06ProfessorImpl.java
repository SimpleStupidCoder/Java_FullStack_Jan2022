package com.javaacademy.model.impl;

public class Class06ProfessorImpl extends Class06EmployeeImpl{
    public final String TYPE="PROFESSOR";


    public Class06ProfessorImpl(String id) {
        super(id);
        this.setPermanent(true);
    }

    public Class06ProfessorImpl(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public Class06PersonImpl getDetails(){
        return this;
    }
}
